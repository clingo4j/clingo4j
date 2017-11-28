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
@Name("clingo_ast_theory_term_definition") 
@Library("clingo") 
public class clingo_ast_theory_term_definition extends StructObject {
	/** C type : clingo_location_t */
	@Field(0) 
	public clingo_location location() {
		return this.io.getNativeObjectField(this, 0);
	}
	/** C type : clingo_location_t */
	@Field(0) 
	public clingo_ast_theory_term_definition location(clingo_location location) {
		this.io.setNativeObjectField(this, 0, location);
		return this;
	}
	/** C type : const char* */
	@Field(1) 
	public Pointer<Byte > name() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : const char* */
	@Field(1) 
	public clingo_ast_theory_term_definition name(Pointer<Byte > name) {
		this.io.setPointerField(this, 1, name);
		return this;
	}
	/** C type : const clingo_ast_theory_operator_definition_t* */
	@Field(2) 
	public Pointer<clingo_ast_theory_operator_definition > operators() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : const clingo_ast_theory_operator_definition_t* */
	@Field(2) 
	public clingo_ast_theory_term_definition operators(Pointer<clingo_ast_theory_operator_definition > operators) {
		this.io.setPointerField(this, 2, operators);
		return this;
	}
	@Ptr 
	@Field(3) 
	public long size() {
		return this.io.getSizeTField(this, 3);
	}
	@Ptr 
	@Field(3) 
	public clingo_ast_theory_term_definition size(long size) {
		this.io.setSizeTField(this, 3, size);
		return this;
	}
	public clingo_ast_theory_term_definition() {
		super();
	}
	public clingo_ast_theory_term_definition(Pointer pointer) {
		super(pointer);
	}
}
