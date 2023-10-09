// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkActionableInterface {
 *     struct _GTypeInterface g_iface;
 *     char* (*get_action_name)(struct _GtkActionable*);
 *     void (*set_action_name)(struct _GtkActionable*,char*);
 *     struct _GVariant* (*get_action_target_value)(struct _GtkActionable*);
 *     void (*set_action_target_value)(struct _GtkActionable*,struct _GVariant*);
 * };
 * }
 */
public class _GtkActionableInterface {

    public static MemoryLayout $LAYOUT() {
        return constants$2266.const$0;
    }
    public static MemorySegment g_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    /**
     * {@snippet :
 * char* (*get_action_name)(struct _GtkActionable*);
     * }
     */
    public interface get_action_name {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_action_name fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2266.const$1, fi, constants$5.const$2, scope);
        }
        static get_action_name ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle get_action_name$VH() {
        return constants$2266.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* (*get_action_name)(struct _GtkActionable*);
     * }
     */
    public static MemorySegment get_action_name$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2266.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* (*get_action_name)(struct _GtkActionable*);
     * }
     */
    public static void get_action_name$set(MemorySegment seg, MemorySegment x) {
        constants$2266.const$2.set(seg, x);
    }
    public static MemorySegment get_action_name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2266.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void get_action_name$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2266.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_action_name get_action_name(MemorySegment segment, Arena scope) {
        return get_action_name.ofAddress(get_action_name$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*set_action_name)(struct _GtkActionable*,char*);
     * }
     */
    public interface set_action_name {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(set_action_name fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2266.const$3, fi, constants$13.const$4, scope);
        }
        static set_action_name ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle set_action_name$VH() {
        return constants$2266.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*set_action_name)(struct _GtkActionable*,char*);
     * }
     */
    public static MemorySegment set_action_name$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2266.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*set_action_name)(struct _GtkActionable*,char*);
     * }
     */
    public static void set_action_name$set(MemorySegment seg, MemorySegment x) {
        constants$2266.const$4.set(seg, x);
    }
    public static MemorySegment set_action_name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2266.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void set_action_name$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2266.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static set_action_name set_action_name(MemorySegment segment, Arena scope) {
        return set_action_name.ofAddress(set_action_name$get(segment), scope);
    }
    /**
     * {@snippet :
 * struct _GVariant* (*get_action_target_value)(struct _GtkActionable*);
     * }
     */
    public interface get_action_target_value {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_action_target_value fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2266.const$5, fi, constants$5.const$2, scope);
        }
        static get_action_target_value ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle get_action_target_value$VH() {
        return constants$2267.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GVariant* (*get_action_target_value)(struct _GtkActionable*);
     * }
     */
    public static MemorySegment get_action_target_value$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2267.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GVariant* (*get_action_target_value)(struct _GtkActionable*);
     * }
     */
    public static void get_action_target_value$set(MemorySegment seg, MemorySegment x) {
        constants$2267.const$0.set(seg, x);
    }
    public static MemorySegment get_action_target_value$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2267.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void get_action_target_value$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2267.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_action_target_value get_action_target_value(MemorySegment segment, Arena scope) {
        return get_action_target_value.ofAddress(get_action_target_value$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*set_action_target_value)(struct _GtkActionable*,struct _GVariant*);
     * }
     */
    public interface set_action_target_value {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(set_action_target_value fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2267.const$1, fi, constants$13.const$4, scope);
        }
        static set_action_target_value ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle set_action_target_value$VH() {
        return constants$2267.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*set_action_target_value)(struct _GtkActionable*,struct _GVariant*);
     * }
     */
    public static MemorySegment set_action_target_value$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2267.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*set_action_target_value)(struct _GtkActionable*,struct _GVariant*);
     * }
     */
    public static void set_action_target_value$set(MemorySegment seg, MemorySegment x) {
        constants$2267.const$2.set(seg, x);
    }
    public static MemorySegment set_action_target_value$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2267.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void set_action_target_value$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2267.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static set_action_target_value set_action_target_value(MemorySegment segment, Arena scope) {
        return set_action_target_value.ofAddress(set_action_target_value$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

