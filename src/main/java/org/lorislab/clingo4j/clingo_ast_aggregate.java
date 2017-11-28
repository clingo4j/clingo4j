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
@Name("clingo_ast_aggregate") 
@Library("clingo") 
public class clingo_ast_aggregate extends StructObject {
	/** C type : const clingo_ast_conditional_literal_t* */
	@Field(0) 
	public Pointer<clingo_ast_conditional_literal > elements() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : const clingo_ast_conditional_literal_t* */
	@Field(0) 
	public clingo_ast_aggregate elements(Pointer<clingo_ast_conditional_literal > elements) {
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
	public clingo_ast_aggregate size(long size) {
		this.io.setSizeTField(this, 1, size);
		return this;
	}
	/** C type : const clingo_ast_aggregate_guard_t* */
	@Field(2) 
	public Pointer<clingo_ast_aggregate_guard > left_guard() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : const clingo_ast_aggregate_guard_t* */
	@Field(2) 
	public clingo_ast_aggregate left_guard(Pointer<clingo_ast_aggregate_guard > left_guard) {
		this.io.setPointerField(this, 2, left_guard);
		return this;
	}
	/** C type : const clingo_ast_aggregate_guard_t* */
	@Field(3) 
	public Pointer<clingo_ast_aggregate_guard > right_guard() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : const clingo_ast_aggregate_guard_t* */
	@Field(3) 
	public clingo_ast_aggregate right_guard(Pointer<clingo_ast_aggregate_guard > right_guard) {
		this.io.setPointerField(this, 3, right_guard);
		return this;
	}
	public clingo_ast_aggregate() {
		super();
	}
	public clingo_ast_aggregate(Pointer pointer) {
		super(pointer);
	}
}
