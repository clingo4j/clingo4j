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

import static java.lang.System.out;
import org.lorislab.clingo4j.api.c.ClingoLibrary.clingo_clause_type;
import static org.lorislab.clingo4j.api.c.ClingoLibrary.clingo_clause_type.clingo_clause_type_learnt;
import static org.lorislab.clingo4j.api.c.ClingoLibrary.clingo_clause_type.clingo_clause_type_static;
import static org.lorislab.clingo4j.api.c.ClingoLibrary.clingo_clause_type.clingo_clause_type_volatile;
import static org.lorislab.clingo4j.api.c.ClingoLibrary.clingo_clause_type.clingo_clause_type_volatile_static;

/**
 *
 * @author andrej
 */
public enum ClauseType {
    
    LEARNT(clingo_clause_type_learnt, "Learnt"),
    STATIC(clingo_clause_type_static, "Static"),
    VOLATILE(clingo_clause_type_volatile, "Volatile"),
    VOLATILE_STATIC(clingo_clause_type_volatile_static, "VolatileStatic");
            
    private final clingo_clause_type type;
    
    private final String string;

    private ClauseType(clingo_clause_type type, String string) {
        this.type = type;
        this.string = string;
    }

    public clingo_clause_type getType() {
        return type;
    }

    public String getString() {
        return string;
    }

    @Override
    public String toString() {
        return string;
    }

}
