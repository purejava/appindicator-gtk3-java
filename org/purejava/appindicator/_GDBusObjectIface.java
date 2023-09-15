// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GDBusObjectIface {
 *     struct _GTypeInterface parent_iface;
 *     char* (*get_object_path)(struct _GDBusObject*);
 *     struct _GList* (*get_interfaces)(struct _GDBusObject*);
 *     struct _GDBusInterface* (*get_interface)(struct _GDBusObject*,char*);
 *     void (*interface_added)(struct _GDBusObject*,struct _GDBusInterface*);
 *     void (*interface_removed)(struct _GDBusObject*,struct _GDBusInterface*);
 * };
 * }
 */
public class _GDBusObjectIface {

    public static MemoryLayout $LAYOUT() {
        return constants$909.const$2;
    }
    public static MemorySegment parent_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    /**
     * {@snippet :
 * char* (*get_object_path)(struct _GDBusObject*);
     * }
     */
    public interface get_object_path {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_object_path fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$909.const$3, fi, constants$5.const$2, scope);
        }
        static get_object_path ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)constants$99.const$0.invokeExact(symbol, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle get_object_path$VH() {
        return constants$909.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* (*get_object_path)(struct _GDBusObject*);
     * }
     */
    public static MemorySegment get_object_path$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$909.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* (*get_object_path)(struct _GDBusObject*);
     * }
     */
    public static void get_object_path$set(MemorySegment seg, MemorySegment x) {
        constants$909.const$4.set(seg, x);
    }
    public static MemorySegment get_object_path$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$909.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void get_object_path$set(MemorySegment seg, long index, MemorySegment x) {
        constants$909.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_object_path get_object_path(MemorySegment segment, Arena scope) {
        return get_object_path.ofAddress(get_object_path$get(segment), scope);
    }
    /**
     * {@snippet :
 * struct _GList* (*get_interfaces)(struct _GDBusObject*);
     * }
     */
    public interface get_interfaces {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_interfaces fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$909.const$5, fi, constants$5.const$2, scope);
        }
        static get_interfaces ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)constants$99.const$0.invokeExact(symbol, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle get_interfaces$VH() {
        return constants$910.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GList* (*get_interfaces)(struct _GDBusObject*);
     * }
     */
    public static MemorySegment get_interfaces$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$910.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GList* (*get_interfaces)(struct _GDBusObject*);
     * }
     */
    public static void get_interfaces$set(MemorySegment seg, MemorySegment x) {
        constants$910.const$0.set(seg, x);
    }
    public static MemorySegment get_interfaces$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$910.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void get_interfaces$set(MemorySegment seg, long index, MemorySegment x) {
        constants$910.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_interfaces get_interfaces(MemorySegment segment, Arena scope) {
        return get_interfaces.ofAddress(get_interfaces$get(segment), scope);
    }
    /**
     * {@snippet :
 * struct _GDBusInterface* (*get_interface)(struct _GDBusObject*,char*);
     * }
     */
    public interface get_interface {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment path, java.lang.foreign.MemorySegment func_data);
        static MemorySegment allocate(get_interface fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$910.const$1, fi, constants$5.const$5, scope);
        }
        static get_interface ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _path, java.lang.foreign.MemorySegment _func_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)constants$15.const$1.invokeExact(symbol, _path, _func_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle get_interface$VH() {
        return constants$910.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GDBusInterface* (*get_interface)(struct _GDBusObject*,char*);
     * }
     */
    public static MemorySegment get_interface$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$910.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GDBusInterface* (*get_interface)(struct _GDBusObject*,char*);
     * }
     */
    public static void get_interface$set(MemorySegment seg, MemorySegment x) {
        constants$910.const$2.set(seg, x);
    }
    public static MemorySegment get_interface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$910.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void get_interface$set(MemorySegment seg, long index, MemorySegment x) {
        constants$910.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_interface get_interface(MemorySegment segment, Arena scope) {
        return get_interface.ofAddress(get_interface$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*interface_added)(struct _GDBusObject*,struct _GDBusInterface*);
     * }
     */
    public interface interface_added {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(interface_added fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$910.const$3, fi, constants$13.const$4, scope);
        }
        static interface_added ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _tag, java.lang.foreign.MemorySegment _data) -> {
                try {
                    constants$14.const$0.invokeExact(symbol, _tag, _data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle interface_added$VH() {
        return constants$910.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*interface_added)(struct _GDBusObject*,struct _GDBusInterface*);
     * }
     */
    public static MemorySegment interface_added$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$910.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*interface_added)(struct _GDBusObject*,struct _GDBusInterface*);
     * }
     */
    public static void interface_added$set(MemorySegment seg, MemorySegment x) {
        constants$910.const$4.set(seg, x);
    }
    public static MemorySegment interface_added$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$910.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void interface_added$set(MemorySegment seg, long index, MemorySegment x) {
        constants$910.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static interface_added interface_added(MemorySegment segment, Arena scope) {
        return interface_added.ofAddress(interface_added$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*interface_removed)(struct _GDBusObject*,struct _GDBusInterface*);
     * }
     */
    public interface interface_removed {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(interface_removed fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$910.const$5, fi, constants$13.const$4, scope);
        }
        static interface_removed ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _tag, java.lang.foreign.MemorySegment _data) -> {
                try {
                    constants$14.const$0.invokeExact(symbol, _tag, _data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle interface_removed$VH() {
        return constants$911.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*interface_removed)(struct _GDBusObject*,struct _GDBusInterface*);
     * }
     */
    public static MemorySegment interface_removed$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$911.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*interface_removed)(struct _GDBusObject*,struct _GDBusInterface*);
     * }
     */
    public static void interface_removed$set(MemorySegment seg, MemorySegment x) {
        constants$911.const$0.set(seg, x);
    }
    public static MemorySegment interface_removed$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$911.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void interface_removed$set(MemorySegment seg, long index, MemorySegment x) {
        constants$911.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static interface_removed interface_removed(MemorySegment segment, Arena scope) {
        return interface_removed.ofAddress(interface_removed$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


