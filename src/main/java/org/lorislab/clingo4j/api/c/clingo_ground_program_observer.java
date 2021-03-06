package org.lorislab.clingo4j.api.c;
import org.bridj.Callback;
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
@Name("clingo_ground_program_observer") 
@Library("clingo") 
public class clingo_ground_program_observer extends StructObject {
	/** C type : init_program_callback* */
	@Field(0) 
	public Pointer<clingo_ground_program_observer.init_program_callback > init_program() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : init_program_callback* */
	@Field(0) 
	public clingo_ground_program_observer init_program(Pointer<clingo_ground_program_observer.init_program_callback > init_program) {
		this.io.setPointerField(this, 0, init_program);
		return this;
	}
	/** C type : begin_step_callback* */
	@Field(1) 
	public Pointer<clingo_ground_program_observer.begin_step_callback > begin_step() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : begin_step_callback* */
	@Field(1) 
	public clingo_ground_program_observer begin_step(Pointer<clingo_ground_program_observer.begin_step_callback > begin_step) {
		this.io.setPointerField(this, 1, begin_step);
		return this;
	}
	/** C type : end_step_callback* */
	@Field(2) 
	public Pointer<clingo_ground_program_observer.end_step_callback > end_step() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : end_step_callback* */
	@Field(2) 
	public clingo_ground_program_observer end_step(Pointer<clingo_ground_program_observer.end_step_callback > end_step) {
		this.io.setPointerField(this, 2, end_step);
		return this;
	}
	/** C type : rule_callback* */
	@Field(3) 
	public Pointer<clingo_ground_program_observer.rule_callback > rule() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : rule_callback* */
	@Field(3) 
	public clingo_ground_program_observer rule(Pointer<clingo_ground_program_observer.rule_callback > rule) {
		this.io.setPointerField(this, 3, rule);
		return this;
	}
	/** C type : weight_rule_callback* */
	@Field(4) 
	public Pointer<clingo_ground_program_observer.weight_rule_callback > weight_rule() {
		return this.io.getPointerField(this, 4);
	}
	/** C type : weight_rule_callback* */
	@Field(4) 
	public clingo_ground_program_observer weight_rule(Pointer<clingo_ground_program_observer.weight_rule_callback > weight_rule) {
		this.io.setPointerField(this, 4, weight_rule);
		return this;
	}
	/** C type : minimize_callback* */
	@Field(5) 
	public Pointer<clingo_ground_program_observer.minimize_callback > minimize() {
		return this.io.getPointerField(this, 5);
	}
	/** C type : minimize_callback* */
	@Field(5) 
	public clingo_ground_program_observer minimize(Pointer<clingo_ground_program_observer.minimize_callback > minimize) {
		this.io.setPointerField(this, 5, minimize);
		return this;
	}
	/** C type : project_callback* */
	@Field(6) 
	public Pointer<clingo_ground_program_observer.project_callback > project() {
		return this.io.getPointerField(this, 6);
	}
	/** C type : project_callback* */
	@Field(6) 
	public clingo_ground_program_observer project(Pointer<clingo_ground_program_observer.project_callback > project) {
		this.io.setPointerField(this, 6, project);
		return this;
	}
	/** C type : output_atom_callback* */
	@Field(7) 
	public Pointer<clingo_ground_program_observer.output_atom_callback > output_atom() {
		return this.io.getPointerField(this, 7);
	}
	/** C type : output_atom_callback* */
	@Field(7) 
	public clingo_ground_program_observer output_atom(Pointer<clingo_ground_program_observer.output_atom_callback > output_atom) {
		this.io.setPointerField(this, 7, output_atom);
		return this;
	}
	/** C type : output_term_callback* */
	@Field(8) 
	public Pointer<clingo_ground_program_observer.output_term_callback > output_term() {
		return this.io.getPointerField(this, 8);
	}
	/** C type : output_term_callback* */
	@Field(8) 
	public clingo_ground_program_observer output_term(Pointer<clingo_ground_program_observer.output_term_callback > output_term) {
		this.io.setPointerField(this, 8, output_term);
		return this;
	}
	/** C type : output_csp_callback* */
	@Field(9) 
	public Pointer<clingo_ground_program_observer.output_csp_callback > output_csp() {
		return this.io.getPointerField(this, 9);
	}
	/** C type : output_csp_callback* */
	@Field(9) 
	public clingo_ground_program_observer output_csp(Pointer<clingo_ground_program_observer.output_csp_callback > output_csp) {
		this.io.setPointerField(this, 9, output_csp);
		return this;
	}
	/** C type : external_callback* */
	@Field(10) 
	public Pointer<clingo_ground_program_observer.external_callback > external() {
		return this.io.getPointerField(this, 10);
	}
	/** C type : external_callback* */
	@Field(10) 
	public clingo_ground_program_observer external(Pointer<clingo_ground_program_observer.external_callback > external) {
		this.io.setPointerField(this, 10, external);
		return this;
	}
	/** C type : assume_callback* */
	@Field(11) 
	public Pointer<clingo_ground_program_observer.assume_callback > assume() {
		return this.io.getPointerField(this, 11);
	}
	/** C type : assume_callback* */
	@Field(11) 
	public clingo_ground_program_observer assume(Pointer<clingo_ground_program_observer.assume_callback > assume) {
		this.io.setPointerField(this, 11, assume);
		return this;
	}
	/** C type : heuristic_callback* */
	@Field(12) 
	public Pointer<clingo_ground_program_observer.heuristic_callback > heuristic() {
		return this.io.getPointerField(this, 12);
	}
	/** C type : heuristic_callback* */
	@Field(12) 
	public clingo_ground_program_observer heuristic(Pointer<clingo_ground_program_observer.heuristic_callback > heuristic) {
		this.io.setPointerField(this, 12, heuristic);
		return this;
	}
	/** C type : acyc_edge_callback* */
	@Field(13) 
	public Pointer<clingo_ground_program_observer.acyc_edge_callback > acyc_edge() {
		return this.io.getPointerField(this, 13);
	}
	/** C type : acyc_edge_callback* */
	@Field(13) 
	public clingo_ground_program_observer acyc_edge(Pointer<clingo_ground_program_observer.acyc_edge_callback > acyc_edge) {
		this.io.setPointerField(this, 13, acyc_edge);
		return this;
	}
	/** C type : theory_term_number_callback* */
	@Field(14) 
	public Pointer<clingo_ground_program_observer.theory_term_number_callback > theory_term_number() {
		return this.io.getPointerField(this, 14);
	}
	/** C type : theory_term_number_callback* */
	@Field(14) 
	public clingo_ground_program_observer theory_term_number(Pointer<clingo_ground_program_observer.theory_term_number_callback > theory_term_number) {
		this.io.setPointerField(this, 14, theory_term_number);
		return this;
	}
	/** C type : theory_term_string_callback* */
	@Field(15) 
	public Pointer<clingo_ground_program_observer.theory_term_string_callback > theory_term_string() {
		return this.io.getPointerField(this, 15);
	}
	/** C type : theory_term_string_callback* */
	@Field(15) 
	public clingo_ground_program_observer theory_term_string(Pointer<clingo_ground_program_observer.theory_term_string_callback > theory_term_string) {
		this.io.setPointerField(this, 15, theory_term_string);
		return this;
	}
	/** C type : theory_term_compound_callback* */
	@Field(16) 
	public Pointer<clingo_ground_program_observer.theory_term_compound_callback > theory_term_compound() {
		return this.io.getPointerField(this, 16);
	}
	/** C type : theory_term_compound_callback* */
	@Field(16) 
	public clingo_ground_program_observer theory_term_compound(Pointer<clingo_ground_program_observer.theory_term_compound_callback > theory_term_compound) {
		this.io.setPointerField(this, 16, theory_term_compound);
		return this;
	}
	/** C type : theory_element_callback* */
	@Field(17) 
	public Pointer<clingo_ground_program_observer.theory_element_callback > theory_element() {
		return this.io.getPointerField(this, 17);
	}
	/** C type : theory_element_callback* */
	@Field(17) 
	public clingo_ground_program_observer theory_element(Pointer<clingo_ground_program_observer.theory_element_callback > theory_element) {
		this.io.setPointerField(this, 17, theory_element);
		return this;
	}
	/** C type : theory_atom_callback* */
	@Field(18) 
	public Pointer<clingo_ground_program_observer.theory_atom_callback > theory_atom() {
		return this.io.getPointerField(this, 18);
	}
	/** C type : theory_atom_callback* */
	@Field(18) 
	public clingo_ground_program_observer theory_atom(Pointer<clingo_ground_program_observer.theory_atom_callback > theory_atom) {
		this.io.setPointerField(this, 18, theory_atom);
		return this;
	}
	/** C type : theory_atom_with_guard_callback* */
	@Field(19) 
	public Pointer<clingo_ground_program_observer.theory_atom_with_guard_callback > theory_atom_with_guard() {
		return this.io.getPointerField(this, 19);
	}
	/** C type : theory_atom_with_guard_callback* */
	@Field(19) 
	public clingo_ground_program_observer theory_atom_with_guard(Pointer<clingo_ground_program_observer.theory_atom_with_guard_callback > theory_atom_with_guard) {
		this.io.setPointerField(this, 19, theory_atom_with_guard);
		return this;
	}
	/** <i>native declaration : src/main/clingo/lib/c/clingo.h</i> */
	public static abstract class init_program_callback extends Callback<init_program_callback > {
		public boolean apply(boolean incremental, Pointer<? > data) {
			return apply(incremental, Pointer.getPeer(data));
		}
		public boolean apply(boolean incremental, @Ptr long data) {
			return apply(incremental, Pointer.pointerToAddress(data));
		}
	};
	/** <i>native declaration : src/main/clingo/lib/c/clingo.h</i> */
	public static abstract class begin_step_callback extends Callback<begin_step_callback > {
		public boolean apply(Pointer<? > data) {
			return apply(Pointer.getPeer(data));
		}
		public boolean apply(@Ptr long data) {
			return apply(Pointer.pointerToAddress(data));
		}
	};
	/** <i>native declaration : src/main/clingo/lib/c/clingo.h</i> */
	public static abstract class end_step_callback extends Callback<end_step_callback > {
		public boolean apply(Pointer<? > data) {
			return apply(Pointer.getPeer(data));
		}
		public boolean apply(@Ptr long data) {
			return apply(Pointer.pointerToAddress(data));
		}
	};
	/** <i>native declaration : src/main/clingo/lib/c/clingo.h</i> */
	public static abstract class rule_callback extends Callback<rule_callback > {
		public boolean apply(boolean choice, Pointer<Integer > head, @Ptr long head_size, Pointer<Integer > body, @Ptr long body_size, Pointer<? > data) {
			return apply(choice, Pointer.getPeer(head), head_size, Pointer.getPeer(body), body_size, Pointer.getPeer(data));
		}
		public boolean apply(boolean choice, @Ptr long head, @Ptr long head_size, @Ptr long body, @Ptr long body_size, @Ptr long data) {
			return apply(choice, (Pointer)Pointer.pointerToAddress(head, Integer.class), head_size, (Pointer)Pointer.pointerToAddress(body, Integer.class), body_size, Pointer.pointerToAddress(data));
		}
	};
	/** <i>native declaration : src/main/clingo/lib/c/clingo.h</i> */
	public static abstract class weight_rule_callback extends Callback<weight_rule_callback > {
		public boolean apply(boolean choice, Pointer<Integer > head, @Ptr long head_size, int lower_bound, Pointer<clingo_weighted_literal > body, @Ptr long body_size, Pointer<? > data) {
			return apply(choice, Pointer.getPeer(head), head_size, lower_bound, Pointer.getPeer(body), body_size, Pointer.getPeer(data));
		}
		public boolean apply(boolean choice, @Ptr long head, @Ptr long head_size, int lower_bound, @Ptr long body, @Ptr long body_size, @Ptr long data) {
			return apply(choice, (Pointer)Pointer.pointerToAddress(head, Integer.class), head_size, lower_bound, (Pointer)Pointer.pointerToAddress(body, clingo_weighted_literal.class), body_size, Pointer.pointerToAddress(data));
		}
	};
	/** <i>native declaration : src/main/clingo/lib/c/clingo.h</i> */
	public static abstract class minimize_callback extends Callback<minimize_callback > {
		public boolean apply(int priority, Pointer<clingo_weighted_literal > literals, @Ptr long size, Pointer<? > data) {
			return apply(priority, Pointer.getPeer(literals), size, Pointer.getPeer(data));
		}
		public boolean apply(int priority, @Ptr long literals, @Ptr long size, @Ptr long data) {
			return apply(priority, (Pointer)Pointer.pointerToAddress(literals, clingo_weighted_literal.class), size, Pointer.pointerToAddress(data));
		}
	};
	/** <i>native declaration : src/main/clingo/lib/c/clingo.h</i> */
	public static abstract class project_callback extends Callback<project_callback > {
		public boolean apply(Pointer<Integer > atoms, @Ptr long size, Pointer<? > data) {
			return apply(Pointer.getPeer(atoms), size, Pointer.getPeer(data));
		}
		public boolean apply(@Ptr long atoms, @Ptr long size, @Ptr long data) {
			return apply((Pointer)Pointer.pointerToAddress(atoms, Integer.class), size, Pointer.pointerToAddress(data));
		}
	};
	/** <i>native declaration : src/main/clingo/lib/c/clingo.h</i> */
	public static abstract class output_atom_callback extends Callback<output_atom_callback > {
		public boolean apply(long symbol, int atom, Pointer<? > data) {
			return apply(symbol, atom, Pointer.getPeer(data));
		}
		public boolean apply(long symbol, int atom, @Ptr long data) {
			return apply(symbol, atom, Pointer.pointerToAddress(data));
		}
	};
	/** <i>native declaration : src/main/clingo/lib/c/clingo.h</i> */
	public static abstract class output_term_callback extends Callback<output_term_callback > {
		public boolean apply(long symbol, Pointer<Integer > condition, @Ptr long size, Pointer<? > data) {
			return apply(symbol, Pointer.getPeer(condition), size, Pointer.getPeer(data));
		}
		public boolean apply(long symbol, @Ptr long condition, @Ptr long size, @Ptr long data) {
			return apply(symbol, (Pointer)Pointer.pointerToAddress(condition, Integer.class), size, Pointer.pointerToAddress(data));
		}
	};
	/** <i>native declaration : src/main/clingo/lib/c/clingo.h</i> */
	public static abstract class output_csp_callback extends Callback<output_csp_callback > {
		public boolean apply(long symbol, int value, Pointer<Integer > condition, @Ptr long size, Pointer<? > data) {
			return apply(symbol, value, Pointer.getPeer(condition), size, Pointer.getPeer(data));
		}
		public boolean apply(long symbol, int value, @Ptr long condition, @Ptr long size, @Ptr long data) {
			return apply(symbol, value, (Pointer)Pointer.pointerToAddress(condition, Integer.class), size, Pointer.pointerToAddress(data));
		}
	};
	/** <i>native declaration : src/main/clingo/lib/c/clingo.h</i> */
	public static abstract class external_callback extends Callback<external_callback > {
		public boolean apply(int atom, int type, Pointer<? > data) {
			return apply(atom, type, Pointer.getPeer(data));
		}
		public boolean apply(int atom, int type, @Ptr long data) {
			return apply(atom, type, Pointer.pointerToAddress(data));
		}
	};
	/** <i>native declaration : src/main/clingo/lib/c/clingo.h</i> */
	public static abstract class assume_callback extends Callback<assume_callback > {
		public boolean apply(Pointer<Integer > literals, @Ptr long size, Pointer<? > data) {
			return apply(Pointer.getPeer(literals), size, Pointer.getPeer(data));
		}
		public boolean apply(@Ptr long literals, @Ptr long size, @Ptr long data) {
			return apply((Pointer)Pointer.pointerToAddress(literals, Integer.class), size, Pointer.pointerToAddress(data));
		}
	};
	/** <i>native declaration : src/main/clingo/lib/c/clingo.h</i> */
	public static abstract class heuristic_callback extends Callback<heuristic_callback > {
		public boolean apply(int atom, int type, int bias, int priority, Pointer<Integer > condition, @Ptr long size, Pointer<? > data) {
			return apply(atom, type, bias, priority, Pointer.getPeer(condition), size, Pointer.getPeer(data));
		}
		public boolean apply(int atom, int type, int bias, int priority, @Ptr long condition, @Ptr long size, @Ptr long data) {
			return apply(atom, type, bias, priority, (Pointer)Pointer.pointerToAddress(condition, Integer.class), size, Pointer.pointerToAddress(data));
		}
	};
	/** <i>native declaration : src/main/clingo/lib/c/clingo.h</i> */
	public static abstract class acyc_edge_callback extends Callback<acyc_edge_callback > {
		public boolean apply(int node_u, int node_v, Pointer<Integer > condition, @Ptr long size, Pointer<? > data) {
			return apply(node_u, node_v, Pointer.getPeer(condition), size, Pointer.getPeer(data));
		}
		public boolean apply(int node_u, int node_v, @Ptr long condition, @Ptr long size, @Ptr long data) {
			return apply(node_u, node_v, (Pointer)Pointer.pointerToAddress(condition, Integer.class), size, Pointer.pointerToAddress(data));
		}
	};
	/** <i>native declaration : src/main/clingo/lib/c/clingo.h</i> */
	public static abstract class theory_term_number_callback extends Callback<theory_term_number_callback > {
		public boolean apply(int term_id, int number, Pointer<? > data) {
			return apply(term_id, number, Pointer.getPeer(data));
		}
		public boolean apply(int term_id, int number, @Ptr long data) {
			return apply(term_id, number, Pointer.pointerToAddress(data));
		}
	};
	/** <i>native declaration : src/main/clingo/lib/c/clingo.h</i> */
	public static abstract class theory_term_string_callback extends Callback<theory_term_string_callback > {
		public boolean apply(int term_id, Pointer<Byte > name, Pointer<? > data) {
			return apply(term_id, Pointer.getPeer(name), Pointer.getPeer(data));
		}
		public boolean apply(int term_id, @Ptr long name, @Ptr long data) {
			return apply(term_id, (Pointer)Pointer.pointerToAddress(name, Byte.class), Pointer.pointerToAddress(data));
		}
	};
	/** <i>native declaration : src/main/clingo/lib/c/clingo.h</i> */
	public static abstract class theory_term_compound_callback extends Callback<theory_term_compound_callback > {
		public boolean apply(int term_id, int name_id_or_type, Pointer<Integer > arguments, @Ptr long size, Pointer<? > data) {
			return apply(term_id, name_id_or_type, Pointer.getPeer(arguments), size, Pointer.getPeer(data));
		}
		public boolean apply(int term_id, int name_id_or_type, @Ptr long arguments, @Ptr long size, @Ptr long data) {
			return apply(term_id, name_id_or_type, (Pointer)Pointer.pointerToAddress(arguments, Integer.class), size, Pointer.pointerToAddress(data));
		}
	};
	/** <i>native declaration : src/main/clingo/lib/c/clingo.h</i> */
	public static abstract class theory_element_callback extends Callback<theory_element_callback > {
		public boolean apply(int element_id, Pointer<Integer > terms, @Ptr long terms_size, Pointer<Integer > condition, @Ptr long condition_size, Pointer<? > data) {
			return apply(element_id, Pointer.getPeer(terms), terms_size, Pointer.getPeer(condition), condition_size, Pointer.getPeer(data));
		}
		public boolean apply(int element_id, @Ptr long terms, @Ptr long terms_size, @Ptr long condition, @Ptr long condition_size, @Ptr long data) {
			return apply(element_id, (Pointer)Pointer.pointerToAddress(terms, Integer.class), terms_size, (Pointer)Pointer.pointerToAddress(condition, Integer.class), condition_size, Pointer.pointerToAddress(data));
		}
	};
	/** <i>native declaration : src/main/clingo/lib/c/clingo.h</i> */
	public static abstract class theory_atom_callback extends Callback<theory_atom_callback > {
		public boolean apply(int atom_id_or_zero, int term_id, Pointer<Integer > elements, @Ptr long size, Pointer<? > data) {
			return apply(atom_id_or_zero, term_id, Pointer.getPeer(elements), size, Pointer.getPeer(data));
		}
		public boolean apply(int atom_id_or_zero, int term_id, @Ptr long elements, @Ptr long size, @Ptr long data) {
			return apply(atom_id_or_zero, term_id, (Pointer)Pointer.pointerToAddress(elements, Integer.class), size, Pointer.pointerToAddress(data));
		}
	};
	/** <i>native declaration : src/main/clingo/lib/c/clingo.h</i> */
	public static abstract class theory_atom_with_guard_callback extends Callback<theory_atom_with_guard_callback > {
		public boolean apply(int atom_id_or_zero, int term_id, Pointer<Integer > elements, @Ptr long size, int operator_id, int right_hand_side_id, Pointer<? > data) {
			return apply(atom_id_or_zero, term_id, Pointer.getPeer(elements), size, operator_id, right_hand_side_id, Pointer.getPeer(data));
		}
		public boolean apply(int atom_id_or_zero, int term_id, @Ptr long elements, @Ptr long size, int operator_id, int right_hand_side_id, @Ptr long data) {
			return apply(atom_id_or_zero, term_id, (Pointer)Pointer.pointerToAddress(elements, Integer.class), size, operator_id, right_hand_side_id, Pointer.pointerToAddress(data));
		}
	};
	public clingo_ground_program_observer() {
		super();
	}
	public clingo_ground_program_observer(Pointer pointer) {
		super(pointer);
	}
}
