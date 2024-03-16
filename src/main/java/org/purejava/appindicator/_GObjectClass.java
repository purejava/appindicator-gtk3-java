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
 * struct _GObjectClass {
 *     GTypeClass g_type_class;
 *     GSList *construct_properties;
 *     GObject *(*constructor)(GType, guint, GObjectConstructParam *);
 *     void (*set_property)(GObject *, guint, const GValue *, GParamSpec *);
 *     void (*get_property)(GObject *, guint, GValue *, GParamSpec *);
 *     void (*dispose)(GObject *);
 *     void (*finalize)(GObject *);
 *     void (*dispatch_properties_changed)(GObject *, guint, GParamSpec **);
 *     void (*notify)(GObject *, GParamSpec *);
 *     void (*constructed)(GObject *);
 *     gsize flags;
 *     gsize n_construct_properties;
 *     gpointer pspecs;
 *     gsize n_pspecs;
 *     gpointer pdummy[3];
 * }
 * }
 */
public class _GObjectClass {

    _GObjectClass() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _GTypeClass.layout().withName("g_type_class"),
        app_indicator_h.C_POINTER.withName("construct_properties"),
        app_indicator_h.C_POINTER.withName("constructor"),
        app_indicator_h.C_POINTER.withName("set_property"),
        app_indicator_h.C_POINTER.withName("get_property"),
        app_indicator_h.C_POINTER.withName("dispose"),
        app_indicator_h.C_POINTER.withName("finalize"),
        app_indicator_h.C_POINTER.withName("dispatch_properties_changed"),
        app_indicator_h.C_POINTER.withName("notify"),
        app_indicator_h.C_POINTER.withName("constructed"),
        app_indicator_h.C_LONG.withName("flags"),
        app_indicator_h.C_LONG.withName("n_construct_properties"),
        app_indicator_h.C_POINTER.withName("pspecs"),
        app_indicator_h.C_LONG.withName("n_pspecs"),
        MemoryLayout.sequenceLayout(3, app_indicator_h.C_POINTER).withName("pdummy")
    ).withName("_GObjectClass");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout g_type_class$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("g_type_class"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GTypeClass g_type_class
     * }
     */
    public static final GroupLayout g_type_class$layout() {
        return g_type_class$LAYOUT;
    }

    private static final long g_type_class$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GTypeClass g_type_class
     * }
     */
    public static final long g_type_class$offset() {
        return g_type_class$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GTypeClass g_type_class
     * }
     */
    public static MemorySegment g_type_class(MemorySegment struct) {
        return struct.asSlice(g_type_class$OFFSET, g_type_class$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GTypeClass g_type_class
     * }
     */
    public static void g_type_class(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, g_type_class$OFFSET, g_type_class$LAYOUT.byteSize());
    }

    private static final AddressLayout construct_properties$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("construct_properties"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GSList *construct_properties
     * }
     */
    public static final AddressLayout construct_properties$layout() {
        return construct_properties$LAYOUT;
    }

    private static final long construct_properties$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GSList *construct_properties
     * }
     */
    public static final long construct_properties$offset() {
        return construct_properties$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GSList *construct_properties
     * }
     */
    public static MemorySegment construct_properties(MemorySegment struct) {
        return struct.get(construct_properties$LAYOUT, construct_properties$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GSList *construct_properties
     * }
     */
    public static void construct_properties(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(construct_properties$LAYOUT, construct_properties$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * GObject *(*constructor)(GType, guint, GObjectConstructParam *)
     * }
     */
    public class constructor {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            MemorySegment apply(long _x0, int _x1, MemorySegment _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            app_indicator_h.C_POINTER,
            app_indicator_h.C_LONG,
            app_indicator_h.C_INT,
            app_indicator_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(constructor.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(constructor.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static MemorySegment invoke(MemorySegment funcPtr,long _x0, int _x1, MemorySegment _x2) {
            try {
                return (MemorySegment) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout constructor$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("constructor"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GObject *(*constructor)(GType, guint, GObjectConstructParam *)
     * }
     */
    public static final AddressLayout constructor$layout() {
        return constructor$LAYOUT;
    }

    private static final long constructor$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GObject *(*constructor)(GType, guint, GObjectConstructParam *)
     * }
     */
    public static final long constructor$offset() {
        return constructor$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GObject *(*constructor)(GType, guint, GObjectConstructParam *)
     * }
     */
    public static MemorySegment constructor(MemorySegment struct) {
        return struct.get(constructor$LAYOUT, constructor$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GObject *(*constructor)(GType, guint, GObjectConstructParam *)
     * }
     */
    public static void constructor(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(constructor$LAYOUT, constructor$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*set_property)(GObject *, guint, const GValue *, GParamSpec *)
     * }
     */
    public class set_property {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, int _x1, MemorySegment _x2, MemorySegment _x3);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            app_indicator_h.C_POINTER,
            app_indicator_h.C_INT,
            app_indicator_h.C_POINTER,
            app_indicator_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(set_property.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(set_property.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, int _x1, MemorySegment _x2, MemorySegment _x3) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout set_property$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("set_property"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*set_property)(GObject *, guint, const GValue *, GParamSpec *)
     * }
     */
    public static final AddressLayout set_property$layout() {
        return set_property$LAYOUT;
    }

    private static final long set_property$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*set_property)(GObject *, guint, const GValue *, GParamSpec *)
     * }
     */
    public static final long set_property$offset() {
        return set_property$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*set_property)(GObject *, guint, const GValue *, GParamSpec *)
     * }
     */
    public static MemorySegment set_property(MemorySegment struct) {
        return struct.get(set_property$LAYOUT, set_property$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*set_property)(GObject *, guint, const GValue *, GParamSpec *)
     * }
     */
    public static void set_property(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(set_property$LAYOUT, set_property$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*get_property)(GObject *, guint, GValue *, GParamSpec *)
     * }
     */
    public class get_property {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, int _x1, MemorySegment _x2, MemorySegment _x3);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            app_indicator_h.C_POINTER,
            app_indicator_h.C_INT,
            app_indicator_h.C_POINTER,
            app_indicator_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(get_property.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(get_property.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, int _x1, MemorySegment _x2, MemorySegment _x3) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout get_property$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("get_property"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*get_property)(GObject *, guint, GValue *, GParamSpec *)
     * }
     */
    public static final AddressLayout get_property$layout() {
        return get_property$LAYOUT;
    }

    private static final long get_property$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*get_property)(GObject *, guint, GValue *, GParamSpec *)
     * }
     */
    public static final long get_property$offset() {
        return get_property$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*get_property)(GObject *, guint, GValue *, GParamSpec *)
     * }
     */
    public static MemorySegment get_property(MemorySegment struct) {
        return struct.get(get_property$LAYOUT, get_property$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*get_property)(GObject *, guint, GValue *, GParamSpec *)
     * }
     */
    public static void get_property(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(get_property$LAYOUT, get_property$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*dispose)(GObject *)
     * }
     */
    public class dispose {

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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(dispose.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(dispose.Function fi, Arena arena) {
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

    private static final AddressLayout dispose$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("dispose"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*dispose)(GObject *)
     * }
     */
    public static final AddressLayout dispose$layout() {
        return dispose$LAYOUT;
    }

    private static final long dispose$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*dispose)(GObject *)
     * }
     */
    public static final long dispose$offset() {
        return dispose$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*dispose)(GObject *)
     * }
     */
    public static MemorySegment dispose(MemorySegment struct) {
        return struct.get(dispose$LAYOUT, dispose$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*dispose)(GObject *)
     * }
     */
    public static void dispose(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(dispose$LAYOUT, dispose$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*finalize)(GObject *)
     * }
     */
    public class finalize {

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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(finalize.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(finalize.Function fi, Arena arena) {
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

    private static final AddressLayout finalize$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("finalize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*finalize)(GObject *)
     * }
     */
    public static final AddressLayout finalize$layout() {
        return finalize$LAYOUT;
    }

    private static final long finalize$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*finalize)(GObject *)
     * }
     */
    public static final long finalize$offset() {
        return finalize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*finalize)(GObject *)
     * }
     */
    public static MemorySegment finalize(MemorySegment struct) {
        return struct.get(finalize$LAYOUT, finalize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*finalize)(GObject *)
     * }
     */
    public static void finalize(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(finalize$LAYOUT, finalize$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*dispatch_properties_changed)(GObject *, guint, GParamSpec **)
     * }
     */
    public class dispatch_properties_changed {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, int _x1, MemorySegment _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(dispatch_properties_changed.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(dispatch_properties_changed.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, int _x1, MemorySegment _x2) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout dispatch_properties_changed$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("dispatch_properties_changed"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*dispatch_properties_changed)(GObject *, guint, GParamSpec **)
     * }
     */
    public static final AddressLayout dispatch_properties_changed$layout() {
        return dispatch_properties_changed$LAYOUT;
    }

    private static final long dispatch_properties_changed$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*dispatch_properties_changed)(GObject *, guint, GParamSpec **)
     * }
     */
    public static final long dispatch_properties_changed$offset() {
        return dispatch_properties_changed$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*dispatch_properties_changed)(GObject *, guint, GParamSpec **)
     * }
     */
    public static MemorySegment dispatch_properties_changed(MemorySegment struct) {
        return struct.get(dispatch_properties_changed$LAYOUT, dispatch_properties_changed$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*dispatch_properties_changed)(GObject *, guint, GParamSpec **)
     * }
     */
    public static void dispatch_properties_changed(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(dispatch_properties_changed$LAYOUT, dispatch_properties_changed$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*notify)(GObject *, GParamSpec *)
     * }
     */
    public class notify {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, MemorySegment _x1);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            app_indicator_h.C_POINTER,
            app_indicator_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(notify.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(notify.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout notify$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("notify"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*notify)(GObject *, GParamSpec *)
     * }
     */
    public static final AddressLayout notify$layout() {
        return notify$LAYOUT;
    }

    private static final long notify$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*notify)(GObject *, GParamSpec *)
     * }
     */
    public static final long notify$offset() {
        return notify$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*notify)(GObject *, GParamSpec *)
     * }
     */
    public static MemorySegment notify(MemorySegment struct) {
        return struct.get(notify$LAYOUT, notify$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*notify)(GObject *, GParamSpec *)
     * }
     */
    public static void notify(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(notify$LAYOUT, notify$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*constructed)(GObject *)
     * }
     */
    public class constructed {

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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(constructed.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(constructed.Function fi, Arena arena) {
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

    private static final AddressLayout constructed$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("constructed"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*constructed)(GObject *)
     * }
     */
    public static final AddressLayout constructed$layout() {
        return constructed$LAYOUT;
    }

    private static final long constructed$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*constructed)(GObject *)
     * }
     */
    public static final long constructed$offset() {
        return constructed$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*constructed)(GObject *)
     * }
     */
    public static MemorySegment constructed(MemorySegment struct) {
        return struct.get(constructed$LAYOUT, constructed$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*constructed)(GObject *)
     * }
     */
    public static void constructed(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(constructed$LAYOUT, constructed$OFFSET, fieldValue);
    }

    private static final OfLong flags$LAYOUT = (OfLong)$LAYOUT.select(groupElement("flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gsize flags
     * }
     */
    public static final OfLong flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gsize flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gsize flags
     * }
     */
    public static long flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gsize flags
     * }
     */
    public static void flags(MemorySegment struct, long fieldValue) {
        struct.set(flags$LAYOUT, flags$OFFSET, fieldValue);
    }

    private static final OfLong n_construct_properties$LAYOUT = (OfLong)$LAYOUT.select(groupElement("n_construct_properties"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gsize n_construct_properties
     * }
     */
    public static final OfLong n_construct_properties$layout() {
        return n_construct_properties$LAYOUT;
    }

    private static final long n_construct_properties$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gsize n_construct_properties
     * }
     */
    public static final long n_construct_properties$offset() {
        return n_construct_properties$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gsize n_construct_properties
     * }
     */
    public static long n_construct_properties(MemorySegment struct) {
        return struct.get(n_construct_properties$LAYOUT, n_construct_properties$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gsize n_construct_properties
     * }
     */
    public static void n_construct_properties(MemorySegment struct, long fieldValue) {
        struct.set(n_construct_properties$LAYOUT, n_construct_properties$OFFSET, fieldValue);
    }

    private static final AddressLayout pspecs$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pspecs"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gpointer pspecs
     * }
     */
    public static final AddressLayout pspecs$layout() {
        return pspecs$LAYOUT;
    }

    private static final long pspecs$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gpointer pspecs
     * }
     */
    public static final long pspecs$offset() {
        return pspecs$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gpointer pspecs
     * }
     */
    public static MemorySegment pspecs(MemorySegment struct) {
        return struct.get(pspecs$LAYOUT, pspecs$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gpointer pspecs
     * }
     */
    public static void pspecs(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pspecs$LAYOUT, pspecs$OFFSET, fieldValue);
    }

    private static final OfLong n_pspecs$LAYOUT = (OfLong)$LAYOUT.select(groupElement("n_pspecs"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gsize n_pspecs
     * }
     */
    public static final OfLong n_pspecs$layout() {
        return n_pspecs$LAYOUT;
    }

    private static final long n_pspecs$OFFSET = 104;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gsize n_pspecs
     * }
     */
    public static final long n_pspecs$offset() {
        return n_pspecs$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gsize n_pspecs
     * }
     */
    public static long n_pspecs(MemorySegment struct) {
        return struct.get(n_pspecs$LAYOUT, n_pspecs$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gsize n_pspecs
     * }
     */
    public static void n_pspecs(MemorySegment struct, long fieldValue) {
        struct.set(n_pspecs$LAYOUT, n_pspecs$OFFSET, fieldValue);
    }

    private static final SequenceLayout pdummy$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("pdummy"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gpointer pdummy[3]
     * }
     */
    public static final SequenceLayout pdummy$layout() {
        return pdummy$LAYOUT;
    }

    private static final long pdummy$OFFSET = 112;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gpointer pdummy[3]
     * }
     */
    public static final long pdummy$offset() {
        return pdummy$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gpointer pdummy[3]
     * }
     */
    public static MemorySegment pdummy(MemorySegment struct) {
        return struct.asSlice(pdummy$OFFSET, pdummy$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gpointer pdummy[3]
     * }
     */
    public static void pdummy(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, pdummy$OFFSET, pdummy$LAYOUT.byteSize());
    }

    private static long[] pdummy$DIMS = { 3 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * gpointer pdummy[3]
     * }
     */
    public static long[] pdummy$dimensions() {
        return pdummy$DIMS;
    }
    private static final VarHandle pdummy$ELEM_HANDLE = pdummy$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * gpointer pdummy[3]
     * }
     */
    public static MemorySegment pdummy(MemorySegment struct, long index0) {
        return (MemorySegment)pdummy$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * gpointer pdummy[3]
     * }
     */
    public static void pdummy(MemorySegment struct, long index0, MemorySegment fieldValue) {
        pdummy$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

