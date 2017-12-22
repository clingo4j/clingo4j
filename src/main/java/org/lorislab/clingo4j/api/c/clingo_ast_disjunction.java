package org.lorislab.clingo4j.api.c;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Name;
import org.bridj.ann.Ptr;
/**
 * <i>native declaration : src/main/clingo/lib/c/clingo.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Name("clingo_ast_disjunction") 
@Library("clingo") 
public class clingo_ast_disjunction extends StructObject {
	/** C type : const clingo_ast_conditional_literal_t* */
	@Field(0) 
	public Pointer<clingo_ast_conditional_literal > elements() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : const clingo_ast_conditional_literal_t* */
	@Field(0) 
	public clingo_ast_disjunction elements(Pointer<clingo_ast_conditional_literal > elements) {
		this.io.setPointerField(this, 0, elements);
		return this;
	}
	@Ptr 
	@Field(1) 
	public long size() {
		return this.io.getSizeTField(this, 1);
	}
	@Ptr 
	@Field(1) 
	public clingo_ast_disjunction size(long size) {
		this.io.setSizeTField(this, 1, size);
		return this;
	}
	public clingo_ast_disjunction() {
		super();
	}
	public clingo_ast_disjunction(Pointer pointer) {
		super(pointer);
	}
}