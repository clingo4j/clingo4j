package org.lorislab.clingo4j;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Name;
import org.bridj.ann.Ptr;
/**
 * <i>native declaration : src/main/clingo/lib/clingo.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Name("clingo_ast_theory_definition") 
@Library("clingo") 
public class clingo_ast_theory_definition extends StructObject {
	/** C type : const char* */
	@Field(0) 
	public Pointer<Byte > name() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : const char* */
	@Field(0) 
	public clingo_ast_theory_definition name(Pointer<Byte > name) {
		this.io.setPointerField(this, 0, name);
		return this;
	}
	/** C type : const clingo_ast_theory_term_definition_t* */
	@Field(1) 
	public Pointer<clingo_ast_theory_term_definition > terms() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : const clingo_ast_theory_term_definition_t* */
	@Field(1) 
	public clingo_ast_theory_definition terms(Pointer<clingo_ast_theory_term_definition > terms) {
		this.io.setPointerField(this, 1, terms);
		return this;
	}
	@Ptr 
	@Field(2) 
	public long terms_size() {
		return this.io.getSizeTField(this, 2);
	}
	@Ptr 
	@Field(2) 
	public clingo_ast_theory_definition terms_size(long terms_size) {
		this.io.setSizeTField(this, 2, terms_size);
		return this;
	}
	/** C type : const clingo_ast_theory_atom_definition_t* */
	@Field(3) 
	public Pointer<clingo_ast_theory_atom_definition > atoms() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : const clingo_ast_theory_atom_definition_t* */
	@Field(3) 
	public clingo_ast_theory_definition atoms(Pointer<clingo_ast_theory_atom_definition > atoms) {
		this.io.setPointerField(this, 3, atoms);
		return this;
	}
	@Ptr 
	@Field(4) 
	public long atoms_size() {
		return this.io.getSizeTField(this, 4);
	}
	@Ptr 
	@Field(4) 
	public clingo_ast_theory_definition atoms_size(long atoms_size) {
		this.io.setSizeTField(this, 4, atoms_size);
		return this;
	}
	public clingo_ast_theory_definition() {
		super();
	}
	public clingo_ast_theory_definition(Pointer pointer) {
		super(pointer);
	}
}
