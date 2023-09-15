// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GActionInterface {
 *     struct _GTypeInterface g_iface;
 *     char* (*get_name)(struct _GAction*);
 *     struct _GVariantType* (*get_parameter_type)(struct _GAction*);
 *     struct _GVariantType* (*get_state_type)(struct _GAction*);
 *     struct _GVariant* (*get_state_hint)(struct _GAction*);
 *     int (*get_enabled)(struct _GAction*);
 *     struct _GVariant* (*get_state)(struct _GAction*);
 *     void (*change_state)(struct _GAction*,struct _GVariant*);
 *     void (*activate)(struct _GAction*,struct _GVariant*);
 * };
 * }
 */
public class _GActionInterface {

    public static MemoryLayout $LAYOUT() {
        return constants$699.const$2;
    }
    public static MemorySegment g_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    /**
     * {@snippet :
 * char* (*get_name)(struct _GAction*);
     * }
     */
    public interface get_name {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_name fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$699.const$3, fi, constants$5.const$2, scope);
        }
        static get_name ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle get_name$VH() {
        return constants$699.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* (*get_name)(struct _GAction*);
     * }
     */
    public static MemorySegment get_name$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$699.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* (*get_name)(struct _GAction*);
     * }
     */
    public static void get_name$set(MemorySegment seg, MemorySegment x) {
        constants$699.const$4.set(seg, x);
    }
    public static MemorySegment get_name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$699.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void get_name$set(MemorySegment seg, long index, MemorySegment x) {
        constants$699.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_name get_name(MemorySegment segment, Arena scope) {
        return get_name.ofAddress(get_name$get(segment), scope);
    }
    /**
     * {@snippet :
 * struct _GVariantType* (*get_parameter_type)(struct _GAction*);
     * }
     */
    public interface get_parameter_type {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_parameter_type fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$699.const$5, fi, constants$5.const$2, scope);
        }
        static get_parameter_type ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle get_parameter_type$VH() {
        return constants$700.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GVariantType* (*get_parameter_type)(struct _GAction*);
     * }
     */
    public static MemorySegment get_parameter_type$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$700.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GVariantType* (*get_parameter_type)(struct _GAction*);
     * }
     */
    public static void get_parameter_type$set(MemorySegment seg, MemorySegment x) {
        constants$700.const$0.set(seg, x);
    }
    public static MemorySegment get_parameter_type$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$700.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void get_parameter_type$set(MemorySegment seg, long index, MemorySegment x) {
        constants$700.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_parameter_type get_parameter_type(MemorySegment segment, Arena scope) {
        return get_parameter_type.ofAddress(get_parameter_type$get(segment), scope);
    }
    /**
     * {@snippet :
 * struct _GVariantType* (*get_state_type)(struct _GAction*);
     * }
     */
    public interface get_state_type {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_state_type fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$700.const$1, fi, constants$5.const$2, scope);
        }
        static get_state_type ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle get_state_type$VH() {
        return constants$700.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GVariantType* (*get_state_type)(struct _GAction*);
     * }
     */
    public static MemorySegment get_state_type$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$700.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GVariantType* (*get_state_type)(struct _GAction*);
     * }
     */
    public static void get_state_type$set(MemorySegment seg, MemorySegment x) {
        constants$700.const$2.set(seg, x);
    }
    public static MemorySegment get_state_type$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$700.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void get_state_type$set(MemorySegment seg, long index, MemorySegment x) {
        constants$700.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_state_type get_state_type(MemorySegment segment, Arena scope) {
        return get_state_type.ofAddress(get_state_type$get(segment), scope);
    }
    /**
     * {@snippet :
 * struct _GVariant* (*get_state_hint)(struct _GAction*);
     * }
     */
    public interface get_state_hint {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_state_hint fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$700.const$3, fi, constants$5.const$2, scope);
        }
        static get_state_hint ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle get_state_hint$VH() {
        return constants$700.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GVariant* (*get_state_hint)(struct _GAction*);
     * }
     */
    public static MemorySegment get_state_hint$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$700.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GVariant* (*get_state_hint)(struct _GAction*);
     * }
     */
    public static void get_state_hint$set(MemorySegment seg, MemorySegment x) {
        constants$700.const$4.set(seg, x);
    }
    public static MemorySegment get_state_hint$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$700.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void get_state_hint$set(MemorySegment seg, long index, MemorySegment x) {
        constants$700.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_state_hint get_state_hint(MemorySegment segment, Arena scope) {
        return get_state_hint.ofAddress(get_state_hint$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*get_enabled)(struct _GAction*);
     * }
     */
    public interface get_enabled {

        int apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_enabled fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$700.const$5, fi, constants$10.const$5, scope);
        }
        static get_enabled ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (int)constants$14.const$2.invokeExact(symbol, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle get_enabled$VH() {
        return constants$701.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*get_enabled)(struct _GAction*);
     * }
     */
    public static MemorySegment get_enabled$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$701.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*get_enabled)(struct _GAction*);
     * }
     */
    public static void get_enabled$set(MemorySegment seg, MemorySegment x) {
        constants$701.const$0.set(seg, x);
    }
    public static MemorySegment get_enabled$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$701.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void get_enabled$set(MemorySegment seg, long index, MemorySegment x) {
        constants$701.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_enabled get_enabled(MemorySegment segment, Arena scope) {
        return get_enabled.ofAddress(get_enabled$get(segment), scope);
    }
    /**
     * {@snippet :
 * struct _GVariant* (*get_state)(struct _GAction*);
     * }
     */
    public interface get_state {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_state fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$701.const$1, fi, constants$5.const$2, scope);
        }
        static get_state ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle get_state$VH() {
        return constants$701.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GVariant* (*get_state)(struct _GAction*);
     * }
     */
    public static MemorySegment get_state$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$701.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GVariant* (*get_state)(struct _GAction*);
     * }
     */
    public static void get_state$set(MemorySegment seg, MemorySegment x) {
        constants$701.const$2.set(seg, x);
    }
    public static MemorySegment get_state$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$701.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void get_state$set(MemorySegment seg, long index, MemorySegment x) {
        constants$701.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_state get_state(MemorySegment segment, Arena scope) {
        return get_state.ofAddress(get_state$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*change_state)(struct _GAction*,struct _GVariant*);
     * }
     */
    public interface change_state {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(change_state fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$701.const$3, fi, constants$13.const$4, scope);
        }
        static change_state ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle change_state$VH() {
        return constants$701.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*change_state)(struct _GAction*,struct _GVariant*);
     * }
     */
    public static MemorySegment change_state$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$701.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*change_state)(struct _GAction*,struct _GVariant*);
     * }
     */
    public static void change_state$set(MemorySegment seg, MemorySegment x) {
        constants$701.const$4.set(seg, x);
    }
    public static MemorySegment change_state$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$701.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void change_state$set(MemorySegment seg, long index, MemorySegment x) {
        constants$701.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static change_state change_state(MemorySegment segment, Arena scope) {
        return change_state.ofAddress(change_state$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*activate)(struct _GAction*,struct _GVariant*);
     * }
     */
    public interface activate {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(activate fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$701.const$5, fi, constants$13.const$4, scope);
        }
        static activate ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle activate$VH() {
        return constants$702.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*activate)(struct _GAction*,struct _GVariant*);
     * }
     */
    public static MemorySegment activate$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$702.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*activate)(struct _GAction*,struct _GVariant*);
     * }
     */
    public static void activate$set(MemorySegment seg, MemorySegment x) {
        constants$702.const$0.set(seg, x);
    }
    public static MemorySegment activate$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$702.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void activate$set(MemorySegment seg, long index, MemorySegment x) {
        constants$702.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static activate activate(MemorySegment segment, Arena scope) {
        return activate.ofAddress(activate$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


