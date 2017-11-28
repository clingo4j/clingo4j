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
@Name("clingo_ast_body_aggregate_element") 
@Library("clingo") 
public class clingo_ast_body_aggregate_element extends StructObject {
	/** C type : clingo_ast_term_t* */
	@Field(0) 
	public Pointer<clingo_ast_term > tuple() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : clingo_ast_term_t* */
	@Field(0) 
	public clingo_ast_body_aggregate_element tuple(Pointer<clingo_ast_term > tuple) {
		this.io.setPointerField(this, 0, tuple);
		return this;
	}
	@Ptr 
	@Field(1) 
	public long tuple_size() {
		return this.io.getSizeTField(this, 1);
	}
	@Ptr 
	@Field(1) 
	public clingo_ast_body_aggregate_element tuple_size(long tuple_size) {
		this.io.setSizeTField(this, 1, tuple_size);
		return this;
	}
	/** C type : const clingo_ast_literal_t* */
	@Field(2) 
	public Pointer<clingo_ast_literal > condition() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : const clingo_ast_literal_t* */
	@Field(2) 
	public clingo_ast_body_aggregate_element condition(Pointer<clingo_ast_literal > condition) {
		this.io.setPointerField(this, 2, condition);
		return this;
	}
	@Ptr 
	@Field(3) 
	public long condition_size() {
		return this.io.getSizeTField(this, 3);
	}
	@Ptr 
	@Field(3) 
	public clingo_ast_body_aggregate_element condition_size(long condition_size) {
		this.io.setSizeTField(this, 3, condition_size);
		return this;
	}
	public clingo_ast_body_aggregate_element() {
		super();
	}
	public clingo_ast_body_aggregate_element(Pointer pointer) {
		super(pointer);
	}
}
