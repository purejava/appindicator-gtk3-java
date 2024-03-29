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
 * struct _GDBusObjectManagerIface {
 *     GTypeInterface parent_iface;
 *     const gchar *(*get_object_path)(GDBusObjectManager *);
 *     GList *(*get_objects)(GDBusObjectManager *);
 *     GDBusObject *(*get_object)(GDBusObjectManager *, const gchar *);
 *     GDBusInterface *(*get_interface)(GDBusObjectManager *, const gchar *, const gchar *);
 *     void (*object_added)(GDBusObjectManager *, GDBusObject *);
 *     void (*object_removed)(GDBusObjectManager *, GDBusObject *);
 *     void (*interface_added)(GDBusObjectManager *, GDBusObject *, GDBusInterface *);
 *     void (*interface_removed)(GDBusObjectManager *, GDBusObject *, GDBusInterface *);
 * }
 * }
 */
public class _GDBusObjectManagerIface {

    _GDBusObjectManagerIface() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _GTypeInterface.layout().withName("parent_iface"),
        app_indicator_h.C_POINTER.withName("get_object_path"),
        app_indicator_h.C_POINTER.withName("get_objects"),
        app_indicator_h.C_POINTER.withName("get_object"),
        app_indicator_h.C_POINTER.withName("get_interface"),
        app_indicator_h.C_POINTER.withName("object_added"),
        app_indicator_h.C_POINTER.withName("object_removed"),
        app_indicator_h.C_POINTER.withName("interface_added"),
        app_indicator_h.C_POINTER.withName("interface_removed")
    ).withName("_GDBusObjectManagerIface");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout parent_iface$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("parent_iface"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GTypeInterface parent_iface
     * }
     */
    public static final GroupLayout parent_iface$layout() {
        return parent_iface$LAYOUT;
    }

    private static final long parent_iface$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GTypeInterface parent_iface
     * }
     */
    public static final long parent_iface$offset() {
        return parent_iface$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GTypeInterface parent_iface
     * }
     */
    public static MemorySegment parent_iface(MemorySegment struct) {
        return struct.asSlice(parent_iface$OFFSET, parent_iface$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GTypeInterface parent_iface
     * }
     */
    public static void parent_iface(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, parent_iface$OFFSET, parent_iface$LAYOUT.byteSize());
    }

    /**
     * {@snippet lang=c :
     * const gchar *(*get_object_path)(GDBusObjectManager *)
     * }
     */
    public class get_object_path {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            MemorySegment apply(MemorySegment _x0);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            app_indicator_h.C_POINTER,
            app_indicator_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(get_object_path.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(get_object_path.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static MemorySegment invoke(MemorySegment funcPtr,MemorySegment _x0) {
            try {
                return (MemorySegment) DOWN$MH.invokeExact(funcPtr, _x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout get_object_path$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("get_object_path"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const gchar *(*get_object_path)(GDBusObjectManager *)
     * }
     */
    public static final AddressLayout get_object_path$layout() {
        return get_object_path$LAYOUT;
    }

    private static final long get_object_path$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const gchar *(*get_object_path)(GDBusObjectManager *)
     * }
     */
    public static final long get_object_path$offset() {
        return get_object_path$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const gchar *(*get_object_path)(GDBusObjectManager *)
     * }
     */
    public static MemorySegment get_object_path(MemorySegment struct) {
        return struct.get(get_object_path$LAYOUT, get_object_path$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const gchar *(*get_object_path)(GDBusObjectManager *)
     * }
     */
    public static void get_object_path(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(get_object_path$LAYOUT, get_object_path$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * GList *(*get_objects)(GDBusObjectManager *)
     * }
     */
    public class get_objects {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            MemorySegment apply(MemorySegment _x0);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            app_indicator_h.C_POINTER,
            app_indicator_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(get_objects.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(get_objects.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static MemorySegment invoke(MemorySegment funcPtr,MemorySegment _x0) {
            try {
                return (MemorySegment) DOWN$MH.invokeExact(funcPtr, _x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout get_objects$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("get_objects"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GList *(*get_objects)(GDBusObjectManager *)
     * }
     */
    public static final AddressLayout get_objects$layout() {
        return get_objects$LAYOUT;
    }

    private static final long get_objects$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GList *(*get_objects)(GDBusObjectManager *)
     * }
     */
    public static final long get_objects$offset() {
        return get_objects$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GList *(*get_objects)(GDBusObjectManager *)
     * }
     */
    public static MemorySegment get_objects(MemorySegment struct) {
        return struct.get(get_objects$LAYOUT, get_objects$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GList *(*get_objects)(GDBusObjectManager *)
     * }
     */
    public static void get_objects(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(get_objects$LAYOUT, get_objects$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * GDBusObject *(*get_object)(GDBusObjectManager *, const gchar *)
     * }
     */
    public class get_object {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            MemorySegment apply(MemorySegment _x0, MemorySegment _x1);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(get_object.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(get_object.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static MemorySegment invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1) {
            try {
                return (MemorySegment) DOWN$MH.invokeExact(funcPtr, _x0, _x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout get_object$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("get_object"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GDBusObject *(*get_object)(GDBusObjectManager *, const gchar *)
     * }
     */
    public static final AddressLayout get_object$layout() {
        return get_object$LAYOUT;
    }

    private static final long get_object$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GDBusObject *(*get_object)(GDBusObjectManager *, const gchar *)
     * }
     */
    public static final long get_object$offset() {
        return get_object$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GDBusObject *(*get_object)(GDBusObjectManager *, const gchar *)
     * }
     */
    public static MemorySegment get_object(MemorySegment struct) {
        return struct.get(get_object$LAYOUT, get_object$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GDBusObject *(*get_object)(GDBusObjectManager *, const gchar *)
     * }
     */
    public static void get_object(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(get_object$LAYOUT, get_object$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * GDBusInterface *(*get_interface)(GDBusObjectManager *, const gchar *, const gchar *)
     * }
     */
    public class get_interface {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            MemorySegment apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            app_indicator_h.C_POINTER,
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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(get_interface.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(get_interface.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static MemorySegment invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, MemorySegment _x2) {
            try {
                return (MemorySegment) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout get_interface$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("get_interface"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GDBusInterface *(*get_interface)(GDBusObjectManager *, const gchar *, const gchar *)
     * }
     */
    public static final AddressLayout get_interface$layout() {
        return get_interface$LAYOUT;
    }

    private static final long get_interface$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GDBusInterface *(*get_interface)(GDBusObjectManager *, const gchar *, const gchar *)
     * }
     */
    public static final long get_interface$offset() {
        return get_interface$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GDBusInterface *(*get_interface)(GDBusObjectManager *, const gchar *, const gchar *)
     * }
     */
    public static MemorySegment get_interface(MemorySegment struct) {
        return struct.get(get_interface$LAYOUT, get_interface$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GDBusInterface *(*get_interface)(GDBusObjectManager *, const gchar *, const gchar *)
     * }
     */
    public static void get_interface(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(get_interface$LAYOUT, get_interface$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*object_added)(GDBusObjectManager *, GDBusObject *)
     * }
     */
    public class object_added {

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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(object_added.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(object_added.Function fi, Arena arena) {
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

    private static final AddressLayout object_added$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("object_added"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*object_added)(GDBusObjectManager *, GDBusObject *)
     * }
     */
    public static final AddressLayout object_added$layout() {
        return object_added$LAYOUT;
    }

    private static final long object_added$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*object_added)(GDBusObjectManager *, GDBusObject *)
     * }
     */
    public static final long object_added$offset() {
        return object_added$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*object_added)(GDBusObjectManager *, GDBusObject *)
     * }
     */
    public static MemorySegment object_added(MemorySegment struct) {
        return struct.get(object_added$LAYOUT, object_added$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*object_added)(GDBusObjectManager *, GDBusObject *)
     * }
     */
    public static void object_added(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(object_added$LAYOUT, object_added$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*object_removed)(GDBusObjectManager *, GDBusObject *)
     * }
     */
    public class object_removed {

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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(object_removed.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(object_removed.Function fi, Arena arena) {
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

    private static final AddressLayout object_removed$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("object_removed"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*object_removed)(GDBusObjectManager *, GDBusObject *)
     * }
     */
    public static final AddressLayout object_removed$layout() {
        return object_removed$LAYOUT;
    }

    private static final long object_removed$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*object_removed)(GDBusObjectManager *, GDBusObject *)
     * }
     */
    public static final long object_removed$offset() {
        return object_removed$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*object_removed)(GDBusObjectManager *, GDBusObject *)
     * }
     */
    public static MemorySegment object_removed(MemorySegment struct) {
        return struct.get(object_removed$LAYOUT, object_removed$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*object_removed)(GDBusObjectManager *, GDBusObject *)
     * }
     */
    public static void object_removed(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(object_removed$LAYOUT, object_removed$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*interface_added)(GDBusObjectManager *, GDBusObject *, GDBusInterface *)
     * }
     */
    public class interface_added {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(interface_added.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(interface_added.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, MemorySegment _x2) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout interface_added$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("interface_added"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*interface_added)(GDBusObjectManager *, GDBusObject *, GDBusInterface *)
     * }
     */
    public static final AddressLayout interface_added$layout() {
        return interface_added$LAYOUT;
    }

    private static final long interface_added$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*interface_added)(GDBusObjectManager *, GDBusObject *, GDBusInterface *)
     * }
     */
    public static final long interface_added$offset() {
        return interface_added$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*interface_added)(GDBusObjectManager *, GDBusObject *, GDBusInterface *)
     * }
     */
    public static MemorySegment interface_added(MemorySegment struct) {
        return struct.get(interface_added$LAYOUT, interface_added$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*interface_added)(GDBusObjectManager *, GDBusObject *, GDBusInterface *)
     * }
     */
    public static void interface_added(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(interface_added$LAYOUT, interface_added$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*interface_removed)(GDBusObjectManager *, GDBusObject *, GDBusInterface *)
     * }
     */
    public class interface_removed {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(interface_removed.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(interface_removed.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, MemorySegment _x2) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout interface_removed$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("interface_removed"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*interface_removed)(GDBusObjectManager *, GDBusObject *, GDBusInterface *)
     * }
     */
    public static final AddressLayout interface_removed$layout() {
        return interface_removed$LAYOUT;
    }

    private static final long interface_removed$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*interface_removed)(GDBusObjectManager *, GDBusObject *, GDBusInterface *)
     * }
     */
    public static final long interface_removed$offset() {
        return interface_removed$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*interface_removed)(GDBusObjectManager *, GDBusObject *, GDBusInterface *)
     * }
     */
    public static MemorySegment interface_removed(MemorySegment struct) {
        return struct.get(interface_removed$LAYOUT, interface_removed$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*interface_removed)(GDBusObjectManager *, GDBusObject *, GDBusInterface *)
     * }
     */
    public static void interface_removed(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(interface_removed$LAYOUT, interface_removed$OFFSET, fieldValue);
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

