/*
 * Copyright 2017 andrej.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.lorislab.clingo4j.api;

import java.util.List;
import org.bridj.Pointer;
import org.bridj.SizeT;
import static org.lorislab.clingo4j.api.Clingo.LIB;
import org.lorislab.clingo4j.api.c.ClingoLibrary.clingo_model;
import static org.lorislab.clingo4j.api.Clingo.handleError;
import org.lorislab.clingo4j.api.c.ClingoLibrary.clingo_solve_control;
import org.lorislab.clingo4j.util.AbstractPointerObject;
import org.lorislab.clingo4j.util.EnumValue;

/**
 *
 * @author andrej
 */
public class Model extends AbstractPointerObject<clingo_model>{


    public Model(Pointer<clingo_model> pointer) {
        super(pointer);
    }

    public ModelType type() throws ClingoException {
        Pointer<Integer> type = Pointer.allocateInt();
        handleError(LIB.clingo_model_type(pointer, type), "Error reading the model type");
        return EnumValue.valueOfInt(ModelType.class, type.get());
    }

    public List<Symbol> symbols() throws ClingoException {
        return symbols(ShowType.SHOWN);
    }

    public List<Symbol> symbols(ShowType type) throws ClingoException {
        List<Symbol> result = null;

        // determine the number of (shown) symbols in the model    
        Pointer<SizeT> size = Pointer.allocateSizeT();
        handleError(LIB.clingo_model_symbols_size(pointer, type.getInt(), size), "Error reading size of symbols of the model");

        if (0 < size.getLong()) {
            // allocate required memory to hold all the symbols
            Pointer<Long> atoms = Pointer.allocateLongs(size.getLong());

            // retrieve the symbols in the model
            handleError(LIB.clingo_model_symbols(pointer, type.getInt(), atoms, size.getLong()), "Error read the model symbols");

            result = Symbol.list(atoms, size.getLong());
        }
        return result;
    }

    public boolean contains(Symbol atom) throws ClingoException {
        Pointer<Boolean> ret = Pointer.allocateBoolean();
        handleError(LIB.clingo_model_contains(pointer, atom.getSymbol(), ret), "Error reading model contains symbol atom!");
        return ret.get();
    }

    public List<Long> cost() throws ClingoException {
        Pointer<SizeT> n = Pointer.allocateSizeT();
        handleError(LIB.clingo_model_cost_size(pointer, n), "Error reading model cost size!");
        Pointer<Long> ret = Pointer.allocateLongs(n.getLong());
        handleError(LIB.clingo_model_cost(pointer, ret, n.getLong()), "Error reading the model cost!");
        return ret.asList();
    }

    public long number() throws ClingoException {
        Pointer<Long> ret = Pointer.allocateLong();
        handleError(LIB.clingo_model_number(pointer, ret), "Error reading the model number!");
        return ret.get();
    }

    public boolean optimalityProven() throws ClingoException {
        Pointer<Boolean> ret = Pointer.allocateBoolean();
        handleError(LIB.clingo_model_optimality_proven(pointer, ret), "Error reading the model optimality provden!");
        return ret.get();
    }

    public SolveControl context() throws ClingoException {
        Pointer<Pointer<clingo_solve_control>> ret = Pointer.allocatePointer(clingo_solve_control.class);
        handleError(LIB.clingo_model_context(pointer,  ret), "Error reading the model solve control!");
        return new SolveControl(ret.get());
    }

    public int threadId() throws ClingoException {
        Pointer<Integer> ret = Pointer.allocateInt();
        handleError(LIB.clingo_model_thread_id(pointer, ret), "Error reading the model thread id!");
        return ret.get();
    }

    @Override
    public String toString() {
        try {
            List<Symbol> tmp = symbols();
            return tmp.toString();
        } catch (ClingoException ex) {
            throw new RuntimeException(ex.getMessage(), ex);
        }
    }
}
