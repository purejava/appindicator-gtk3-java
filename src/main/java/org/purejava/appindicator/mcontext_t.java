// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct mcontext_t {
 *     unsigned long long fault_address;
 *     unsigned long long regs[31];
 *     unsigned long long sp;
 *     unsigned long long pc;
 *     unsigned long long pstate;
 *     unsigned char __reserved[4096];
 * };
 * }
 */
public class mcontext_t {

    public static MemoryLayout $LAYOUT() {
        return constants$142.const$5;
    }
    public static VarHandle fault_address$VH() {
        return constants$143.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long long fault_address;
     * }
     */
    public static long fault_address$get(MemorySegment seg) {
        return (long)constants$143.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long long fault_address;
     * }
     */
    public static void fault_address$set(MemorySegment seg, long x) {
        constants$143.const$0.set(seg, x);
    }
    public static long fault_address$get(MemorySegment seg, long index) {
        return (long)constants$143.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void fault_address$set(MemorySegment seg, long index, long x) {
        constants$143.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment regs$slice(MemorySegment seg) {
        return seg.asSlice(8, 248);
    }
    public static VarHandle sp$VH() {
        return constants$143.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long long sp;
     * }
     */
    public static long sp$get(MemorySegment seg) {
        return (long)constants$143.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long long sp;
     * }
     */
    public static void sp$set(MemorySegment seg, long x) {
        constants$143.const$1.set(seg, x);
    }
    public static long sp$get(MemorySegment seg, long index) {
        return (long)constants$143.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void sp$set(MemorySegment seg, long index, long x) {
        constants$143.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pc$VH() {
        return constants$143.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long long pc;
     * }
     */
    public static long pc$get(MemorySegment seg) {
        return (long)constants$143.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long long pc;
     * }
     */
    public static void pc$set(MemorySegment seg, long x) {
        constants$143.const$2.set(seg, x);
    }
    public static long pc$get(MemorySegment seg, long index) {
        return (long)constants$143.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pc$set(MemorySegment seg, long index, long x) {
        constants$143.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pstate$VH() {
        return constants$143.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long long pstate;
     * }
     */
    public static long pstate$get(MemorySegment seg) {
        return (long)constants$143.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long long pstate;
     * }
     */
    public static void pstate$set(MemorySegment seg, long x) {
        constants$143.const$3.set(seg, x);
    }
    public static long pstate$get(MemorySegment seg, long index) {
        return (long)constants$143.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pstate$set(MemorySegment seg, long index, long x) {
        constants$143.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment __reserved$slice(MemorySegment seg) {
        return seg.asSlice(288, 4096);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

