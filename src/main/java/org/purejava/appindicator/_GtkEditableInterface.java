// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct _GtkEditableInterface {
 *     GTypeInterface base_iface;
 *     void (*insert_text)(GtkEditable *, const gchar *, gint, gint *);
 *     void (*delete_text)(GtkEditable *, gint, gint);
 *     void (*changed)(GtkEditable *);
 *     void (*do_insert_text)(GtkEditable *, const gchar *, gint, gint *);
 *     void (*do_delete_text)(GtkEditable *, gint, gint);
 *     gchar *(*get_chars)(GtkEditable *, gint, gint);
 *     void (*set_selection_bounds)(GtkEditable *, gint, gint);
 *     gboolean (*get_selection_bounds)(GtkEditable *, gint *, gint *);
 *     void (*set_position)(GtkEditable *, gint);
 *     gint (*get_position)(GtkEditable *);
 * }
 * }
 */
public class _GtkEditableInterface {

    _GtkEditableInterface() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _GTypeInterface.layout().withName("base_iface"),
        app_indicator_h.C_POINTER.withName("insert_text"),
        app_indicator_h.C_POINTER.withName("delete_text"),
        app_indicator_h.C_POINTER.withName("changed"),
        app_indicator_h.C_POINTER.withName("do_insert_text"),
        app_indicator_h.C_POINTER.withName("do_delete_text"),
        app_indicator_h.C_POINTER.withName("get_chars"),
        app_indicator_h.C_POINTER.withName("set_selection_bounds"),
        app_indicator_h.C_POINTER.withName("get_selection_bounds"),
        app_indicator_h.C_POINTER.withName("set_position"),
        app_indicator_h.C_POINTER.withName("get_position")
    ).withName("_GtkEditableInterface");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout base_iface$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("base_iface"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GTypeInterface base_iface
     * }
     */
    public static final GroupLayout base_iface$layout() {
        return base_iface$LAYOUT;
    }

    private static final long base_iface$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GTypeInterface base_iface
     * }
     */
    public static final long base_iface$offset() {
        return base_iface$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GTypeInterface base_iface
     * }
     */
    public static MemorySegment base_iface(MemorySegment struct) {
        return struct.asSlice(base_iface$OFFSET, base_iface$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GTypeInterface base_iface
     * }
     */
    public static void base_iface(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, base_iface$OFFSET, base_iface$LAYOUT.byteSize());
    }

    /**
     * {@snippet lang=c :
     * void (*insert_text)(GtkEditable *, const gchar *, gint, gint *)
     * }
     */
    public class insert_text {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, MemorySegment _x1, int _x2, MemorySegment _x3);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            app_indicator_h.C_POINTER,
            app_indicator_h.C_POINTER,
            app_indicator_h.C_INT,
            app_indicator_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(insert_text.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(insert_text.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, int _x2, MemorySegment _x3) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout insert_text$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("insert_text"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*insert_text)(GtkEditable *, const gchar *, gint, gint *)
     * }
     */
    public static final AddressLayout insert_text$layout() {
        return insert_text$LAYOUT;
    }

    private static final long insert_text$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*insert_text)(GtkEditable *, const gchar *, gint, gint *)
     * }
     */
    public static final long insert_text$offset() {
        return insert_text$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*insert_text)(GtkEditable *, const gchar *, gint, gint *)
     * }
     */
    public static MemorySegment insert_text(MemorySegment struct) {
        return struct.get(insert_text$LAYOUT, insert_text$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*insert_text)(GtkEditable *, const gchar *, gint, gint *)
     * }
     */
    public static void insert_text(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(insert_text$LAYOUT, insert_text$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*delete_text)(GtkEditable *, gint, gint)
     * }
     */
    public class delete_text {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, int _x1, int _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            app_indicator_h.C_POINTER,
            app_indicator_h.C_INT,
            app_indicator_h.C_INT
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(delete_text.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(delete_text.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, int _x1, int _x2) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout delete_text$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("delete_text"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*delete_text)(GtkEditable *, gint, gint)
     * }
     */
    public static final AddressLayout delete_text$layout() {
        return delete_text$LAYOUT;
    }

    private static final long delete_text$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*delete_text)(GtkEditable *, gint, gint)
     * }
     */
    public static final long delete_text$offset() {
        return delete_text$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*delete_text)(GtkEditable *, gint, gint)
     * }
     */
    public static MemorySegment delete_text(MemorySegment struct) {
        return struct.get(delete_text$LAYOUT, delete_text$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*delete_text)(GtkEditable *, gint, gint)
     * }
     */
    public static void delete_text(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(delete_text$LAYOUT, delete_text$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*changed)(GtkEditable *)
     * }
     */
    public class changed {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            app_indicator_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(changed.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(changed.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout changed$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("changed"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*changed)(GtkEditable *)
     * }
     */
    public static final AddressLayout changed$layout() {
        return changed$LAYOUT;
    }

    private static final long changed$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*changed)(GtkEditable *)
     * }
     */
    public static final long changed$offset() {
        return changed$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*changed)(GtkEditable *)
     * }
     */
    public static MemorySegment changed(MemorySegment struct) {
        return struct.get(changed$LAYOUT, changed$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*changed)(GtkEditable *)
     * }
     */
    public static void changed(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(changed$LAYOUT, changed$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*do_insert_text)(GtkEditable *, const gchar *, gint, gint *)
     * }
     */
    public class do_insert_text {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, MemorySegment _x1, int _x2, MemorySegment _x3);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            app_indicator_h.C_POINTER,
            app_indicator_h.C_POINTER,
            app_indicator_h.C_INT,
            app_indicator_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(do_insert_text.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(do_insert_text.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, int _x2, MemorySegment _x3) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout do_insert_text$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("do_insert_text"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*do_insert_text)(GtkEditable *, const gchar *, gint, gint *)
     * }
     */
    public static final AddressLayout do_insert_text$layout() {
        return do_insert_text$LAYOUT;
    }

    private static final long do_insert_text$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*do_insert_text)(GtkEditable *, const gchar *, gint, gint *)
     * }
     */
    public static final long do_insert_text$offset() {
        return do_insert_text$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*do_insert_text)(GtkEditable *, const gchar *, gint, gint *)
     * }
     */
    public static MemorySegment do_insert_text(MemorySegment struct) {
        return struct.get(do_insert_text$LAYOUT, do_insert_text$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*do_insert_text)(GtkEditable *, const gchar *, gint, gint *)
     * }
     */
    public static void do_insert_text(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(do_insert_text$LAYOUT, do_insert_text$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*do_delete_text)(GtkEditable *, gint, gint)
     * }
     */
    public class do_delete_text {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, int _x1, int _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            app_indicator_h.C_POINTER,
            app_indicator_h.C_INT,
            app_indicator_h.C_INT
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(do_delete_text.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(do_delete_text.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, int _x1, int _x2) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout do_delete_text$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("do_delete_text"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*do_delete_text)(GtkEditable *, gint, gint)
     * }
     */
    public static final AddressLayout do_delete_text$layout() {
        return do_delete_text$LAYOUT;
    }

    private static final long do_delete_text$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*do_delete_text)(GtkEditable *, gint, gint)
     * }
     */
    public static final long do_delete_text$offset() {
        return do_delete_text$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*do_delete_text)(GtkEditable *, gint, gint)
     * }
     */
    public static MemorySegment do_delete_text(MemorySegment struct) {
        return struct.get(do_delete_text$LAYOUT, do_delete_text$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*do_delete_text)(GtkEditable *, gint, gint)
     * }
     */
    public static void do_delete_text(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(do_delete_text$LAYOUT, do_delete_text$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * gchar *(*get_chars)(GtkEditable *, gint, gint)
     * }
     */
    public class get_chars {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            MemorySegment apply(MemorySegment _x0, int _x1, int _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            app_indicator_h.C_POINTER,
            app_indicator_h.C_POINTER,
            app_indicator_h.C_INT,
            app_indicator_h.C_INT
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(get_chars.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(get_chars.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static MemorySegment invoke(MemorySegment funcPtr,MemorySegment _x0, int _x1, int _x2) {
            try {
                return (MemorySegment) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout get_chars$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("get_chars"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gchar *(*get_chars)(GtkEditable *, gint, gint)
     * }
     */
    public static final AddressLayout get_chars$layout() {
        return get_chars$LAYOUT;
    }

    private static final long get_chars$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gchar *(*get_chars)(GtkEditable *, gint, gint)
     * }
     */
    public static final long get_chars$offset() {
        return get_chars$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gchar *(*get_chars)(GtkEditable *, gint, gint)
     * }
     */
    public static MemorySegment get_chars(MemorySegment struct) {
        return struct.get(get_chars$LAYOUT, get_chars$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gchar *(*get_chars)(GtkEditable *, gint, gint)
     * }
     */
    public static void get_chars(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(get_chars$LAYOUT, get_chars$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*set_selection_bounds)(GtkEditable *, gint, gint)
     * }
     */
    public class set_selection_bounds {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, int _x1, int _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            app_indicator_h.C_POINTER,
            app_indicator_h.C_INT,
            app_indicator_h.C_INT
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(set_selection_bounds.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(set_selection_bounds.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, int _x1, int _x2) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout set_selection_bounds$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("set_selection_bounds"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*set_selection_bounds)(GtkEditable *, gint, gint)
     * }
     */
    public static final AddressLayout set_selection_bounds$layout() {
        return set_selection_bounds$LAYOUT;
    }

    private static final long set_selection_bounds$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*set_selection_bounds)(GtkEditable *, gint, gint)
     * }
     */
    public static final long set_selection_bounds$offset() {
        return set_selection_bounds$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*set_selection_bounds)(GtkEditable *, gint, gint)
     * }
     */
    public static MemorySegment set_selection_bounds(MemorySegment struct) {
        return struct.get(set_selection_bounds$LAYOUT, set_selection_bounds$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*set_selection_bounds)(GtkEditable *, gint, gint)
     * }
     */
    public static void set_selection_bounds(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(set_selection_bounds$LAYOUT, set_selection_bounds$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * gboolean (*get_selection_bounds)(GtkEditable *, gint *, gint *)
     * }
     */
    public class get_selection_bounds {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            app_indicator_h.C_INT,
            app_indicator_h.C_POINTER,
            app_indicator_h.C_POINTER,
            app_indicator_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(get_selection_bounds.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(get_selection_bounds.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, MemorySegment _x2) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout get_selection_bounds$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("get_selection_bounds"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gboolean (*get_selection_bounds)(GtkEditable *, gint *, gint *)
     * }
     */
    public static final AddressLayout get_selection_bounds$layout() {
        return get_selection_bounds$LAYOUT;
    }

    private static final long get_selection_bounds$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gboolean (*get_selection_bounds)(GtkEditable *, gint *, gint *)
     * }
     */
    public static final long get_selection_bounds$offset() {
        return get_selection_bounds$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gboolean (*get_selection_bounds)(GtkEditable *, gint *, gint *)
     * }
     */
    public static MemorySegment get_selection_bounds(MemorySegment struct) {
        return struct.get(get_selection_bounds$LAYOUT, get_selection_bounds$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gboolean (*get_selection_bounds)(GtkEditable *, gint *, gint *)
     * }
     */
    public static void get_selection_bounds(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(get_selection_bounds$LAYOUT, get_selection_bounds$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*set_position)(GtkEditable *, gint)
     * }
     */
    public class set_position {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, int _x1);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            app_indicator_h.C_POINTER,
            app_indicator_h.C_INT
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(set_position.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(set_position.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, int _x1) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout set_position$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("set_position"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*set_position)(GtkEditable *, gint)
     * }
     */
    public static final AddressLayout set_position$layout() {
        return set_position$LAYOUT;
    }

    private static final long set_position$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*set_position)(GtkEditable *, gint)
     * }
     */
    public static final long set_position$offset() {
        return set_position$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*set_position)(GtkEditable *, gint)
     * }
     */
    public static MemorySegment set_position(MemorySegment struct) {
        return struct.get(set_position$LAYOUT, set_position$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*set_position)(GtkEditable *, gint)
     * }
     */
    public static void set_position(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(set_position$LAYOUT, set_position$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * gint (*get_position)(GtkEditable *)
     * }
     */
    public class get_position {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            app_indicator_h.C_INT,
            app_indicator_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(get_position.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(get_position.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout get_position$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("get_position"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gint (*get_position)(GtkEditable *)
     * }
     */
    public static final AddressLayout get_position$layout() {
        return get_position$LAYOUT;
    }

    private static final long get_position$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gint (*get_position)(GtkEditable *)
     * }
     */
    public static final long get_position$offset() {
        return get_position$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gint (*get_position)(GtkEditable *)
     * }
     */
    public static MemorySegment get_position(MemorySegment struct) {
        return struct.get(get_position$LAYOUT, get_position$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gint (*get_position)(GtkEditable *)
     * }
     */
    public static void get_position(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(get_position$LAYOUT, get_position$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

