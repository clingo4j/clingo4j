package org.lorislab.clingo4j.api.c;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Name;
/**
 * <i>native declaration : src/main/clingo/lib/c/clingo.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Name("clingo_ast_id") 
@Library("clingo") 
public class clingo_ast_id extends StructObject {
	/** C type : clingo_location_t */
	@Field(0) 
	public clingo_location location() {
		return this.io.getNativeObjectField(this, 0);
	}
	/** C type : clingo_location_t */
	@Field(0) 
	public clingo_ast_id location(clingo_location location) {
		this.io.setNativeObjectField(this, 0, location);
		return this;
	}
	/** C type : const char* */
	@Field(1) 
	public Pointer<Byte > id() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : const char* */
	@Field(1) 
	public clingo_ast_id id(Pointer<Byte > id) {
		this.io.setPointerField(this, 1, id);
		return this;
	}
	public clingo_ast_id() {
		super();
	}
	public clingo_ast_id(Pointer pointer) {
		super(pointer);
	}
}