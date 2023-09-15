// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkRadioActionEntry {
 *     char* name;
 *     char* stock_id;
 *     char* label;
 *     char* accelerator;
 *     char* tooltip;
 *     int value;
 * };
 * }
 */
public class _GtkRadioActionEntry {

    public static MemoryLayout $LAYOUT() {
        return constants$3266.const$1;
    }
    public static VarHandle name$VH() {
        return constants$3266.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* name;
     * }
     */
    public static MemorySegment name$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3266.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* name;
     * }
     */
    public static void name$set(MemorySegment seg, MemorySegment x) {
        constants$3266.const$2.set(seg, x);
    }
    public static MemorySegment name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3266.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void name$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3266.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle stock_id$VH() {
        return constants$3266.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* stock_id;
     * }
     */
    public static MemorySegment stock_id$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3266.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* stock_id;
     * }
     */
    public static void stock_id$set(MemorySegment seg, MemorySegment x) {
        constants$3266.const$3.set(seg, x);
    }
    public static MemorySegment stock_id$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3266.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void stock_id$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3266.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle label$VH() {
        return constants$3266.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* label;
     * }
     */
    public static MemorySegment label$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3266.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* label;
     * }
     */
    public static void label$set(MemorySegment seg, MemorySegment x) {
        constants$3266.const$4.set(seg, x);
    }
    public static MemorySegment label$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3266.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void label$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3266.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle accelerator$VH() {
        return constants$3266.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* accelerator;
     * }
     */
    public static MemorySegment accelerator$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3266.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* accelerator;
     * }
     */
    public static void accelerator$set(MemorySegment seg, MemorySegment x) {
        constants$3266.const$5.set(seg, x);
    }
    public static MemorySegment accelerator$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3266.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void accelerator$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3266.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle tooltip$VH() {
        return constants$3267.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* tooltip;
     * }
     */
    public static MemorySegment tooltip$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3267.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* tooltip;
     * }
     */
    public static void tooltip$set(MemorySegment seg, MemorySegment x) {
        constants$3267.const$0.set(seg, x);
    }
    public static MemorySegment tooltip$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3267.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void tooltip$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3267.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle value$VH() {
        return constants$3267.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int value;
     * }
     */
    public static int value$get(MemorySegment seg) {
        return (int)constants$3267.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int value;
     * }
     */
    public static void value$set(MemorySegment seg, int x) {
        constants$3267.const$1.set(seg, x);
    }
    public static int value$get(MemorySegment seg, long index) {
        return (int)constants$3267.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void value$set(MemorySegment seg, long index, int x) {
        constants$3267.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


