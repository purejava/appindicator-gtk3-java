// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GVariantDict {
 *     union  u;
 * };
 * }
 */
public class _GVariantDict {

    public static MemoryLayout $LAYOUT() {
        return constants$369.const$1;
    }
    /**
     * {@snippet :
     * union {
     *     struct  s;
     *     unsigned long x[16];
     * };
     * }
     */
    public static final class u {

        // Suppresses default constructor, ensuring non-instantiability.
        private u() {}
        public static MemoryLayout $LAYOUT() {
            return constants$369.const$2;
        }
        /**
         * {@snippet :
         * struct {
         *     struct _GVariant* asv;
         *     unsigned long partial_magic;
         *     unsigned long y[14];
         * };
         * }
         */
        public static final class s {

            // Suppresses default constructor, ensuring non-instantiability.
            private s() {}
            public static MemoryLayout $LAYOUT() {
                return constants$369.const$3;
            }
            public static VarHandle asv$VH() {
                return constants$369.const$4;
            }
            /**
             * Getter for field:
             * {@snippet :
             * struct _GVariant* asv;
             * }
             */
            public static MemorySegment asv$get(MemorySegment seg) {
                return (java.lang.foreign.MemorySegment)constants$369.const$4.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * struct _GVariant* asv;
             * }
             */
            public static void asv$set(MemorySegment seg, MemorySegment x) {
                constants$369.const$4.set(seg, x);
            }
            public static MemorySegment asv$get(MemorySegment seg, long index) {
                return (java.lang.foreign.MemorySegment)constants$369.const$4.get(seg.asSlice(index*sizeof()));
            }
            public static void asv$set(MemorySegment seg, long index, MemorySegment x) {
                constants$369.const$4.set(seg.asSlice(index*sizeof()), x);
            }
            public static VarHandle partial_magic$VH() {
                return constants$369.const$5;
            }
            /**
             * Getter for field:
             * {@snippet :
             * unsigned long partial_magic;
             * }
             */
            public static long partial_magic$get(MemorySegment seg) {
                return (long)constants$369.const$5.get(seg);
            }
            /**
             * Setter for field:
             * {@snippet :
             * unsigned long partial_magic;
             * }
             */
            public static void partial_magic$set(MemorySegment seg, long x) {
                constants$369.const$5.set(seg, x);
            }
            public static long partial_magic$get(MemorySegment seg, long index) {
                return (long)constants$369.const$5.get(seg.asSlice(index*sizeof()));
            }
            public static void partial_magic$set(MemorySegment seg, long index, long x) {
                constants$369.const$5.set(seg.asSlice(index*sizeof()), x);
            }
            public static MemorySegment y$slice(MemorySegment seg) {
                return seg.asSlice(16, 112);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
        }

        public static MemorySegment s$slice(MemorySegment seg) {
            return seg.asSlice(0, 128);
        }
        public static MemorySegment x$slice(MemorySegment seg) {
            return seg.asSlice(0, 128);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
    }

    public static MemorySegment u$slice(MemorySegment seg) {
        return seg.asSlice(0, 128);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

