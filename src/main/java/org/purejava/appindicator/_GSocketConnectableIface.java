// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GSocketConnectableIface {
 *     struct _GTypeInterface g_iface;
 *     struct _GSocketAddressEnumerator* (*enumerate)(struct _GSocketConnectable*);
 *     struct _GSocketAddressEnumerator* (*proxy_enumerate)(struct _GSocketConnectable*);
 *     char* (*to_string)(struct _GSocketConnectable*);
 * };
 * }
 */
public class _GSocketConnectableIface {

    public static MemoryLayout $LAYOUT() {
        return constants$1299.const$1;
    }
    public static MemorySegment g_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    /**
     * {@snippet :
 * struct _GSocketAddressEnumerator* (*enumerate)(struct _GSocketConnectable*);
     * }
     */
    public interface enumerate {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(enumerate fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1299.const$2, fi, constants$5.const$2, scope);
        }
        static enumerate ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle enumerate$VH() {
        return constants$1299.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GSocketAddressEnumerator* (*enumerate)(struct _GSocketConnectable*);
     * }
     */
    public static MemorySegment enumerate$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1299.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GSocketAddressEnumerator* (*enumerate)(struct _GSocketConnectable*);
     * }
     */
    public static void enumerate$set(MemorySegment seg, MemorySegment x) {
        constants$1299.const$3.set(seg, x);
    }
    public static MemorySegment enumerate$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1299.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void enumerate$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1299.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static enumerate enumerate(MemorySegment segment, Arena scope) {
        return enumerate.ofAddress(enumerate$get(segment), scope);
    }
    /**
     * {@snippet :
 * struct _GSocketAddressEnumerator* (*proxy_enumerate)(struct _GSocketConnectable*);
     * }
     */
    public interface proxy_enumerate {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(proxy_enumerate fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1299.const$4, fi, constants$5.const$2, scope);
        }
        static proxy_enumerate ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle proxy_enumerate$VH() {
        return constants$1299.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GSocketAddressEnumerator* (*proxy_enumerate)(struct _GSocketConnectable*);
     * }
     */
    public static MemorySegment proxy_enumerate$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1299.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GSocketAddressEnumerator* (*proxy_enumerate)(struct _GSocketConnectable*);
     * }
     */
    public static void proxy_enumerate$set(MemorySegment seg, MemorySegment x) {
        constants$1299.const$5.set(seg, x);
    }
    public static MemorySegment proxy_enumerate$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1299.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void proxy_enumerate$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1299.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static proxy_enumerate proxy_enumerate(MemorySegment segment, Arena scope) {
        return proxy_enumerate.ofAddress(proxy_enumerate$get(segment), scope);
    }
    /**
     * {@snippet :
 * char* (*to_string)(struct _GSocketConnectable*);
     * }
     */
    public interface to_string {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(to_string fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1300.const$0, fi, constants$5.const$2, scope);
        }
        static to_string ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle to_string$VH() {
        return constants$1300.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* (*to_string)(struct _GSocketConnectable*);
     * }
     */
    public static MemorySegment to_string$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1300.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* (*to_string)(struct _GSocketConnectable*);
     * }
     */
    public static void to_string$set(MemorySegment seg, MemorySegment x) {
        constants$1300.const$1.set(seg, x);
    }
    public static MemorySegment to_string$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1300.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void to_string$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1300.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static to_string to_string(MemorySegment segment, Arena scope) {
        return to_string.ofAddress(to_string$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

