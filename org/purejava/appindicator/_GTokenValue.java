// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * union _GTokenValue {
 *     void* v_symbol;
 *     char* v_identifier;
 *     unsigned long v_binary;
 *     unsigned long v_octal;
 *     unsigned long v_int;
 *     unsigned long v_int64;
 *     double v_float;
 *     unsigned long v_hex;
 *     char* v_string;
 *     char* v_comment;
 *     unsigned char v_char;
 *     unsigned int v_error;
 * };
 * }
 */
public class _GTokenValue {

    public static MemoryLayout $LAYOUT() {
        return constants$420.const$3;
    }
    public static VarHandle v_symbol$VH() {
        return constants$420.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* v_symbol;
     * }
     */
    public static MemorySegment v_symbol$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$420.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* v_symbol;
     * }
     */
    public static void v_symbol$set(MemorySegment seg, MemorySegment x) {
        constants$420.const$4.set(seg, x);
    }
    public static MemorySegment v_symbol$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$420.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void v_symbol$set(MemorySegment seg, long index, MemorySegment x) {
        constants$420.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle v_identifier$VH() {
        return constants$420.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* v_identifier;
     * }
     */
    public static MemorySegment v_identifier$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$420.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* v_identifier;
     * }
     */
    public static void v_identifier$set(MemorySegment seg, MemorySegment x) {
        constants$420.const$5.set(seg, x);
    }
    public static MemorySegment v_identifier$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$420.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void v_identifier$set(MemorySegment seg, long index, MemorySegment x) {
        constants$420.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle v_binary$VH() {
        return constants$421.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long v_binary;
     * }
     */
    public static long v_binary$get(MemorySegment seg) {
        return (long)constants$421.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long v_binary;
     * }
     */
    public static void v_binary$set(MemorySegment seg, long x) {
        constants$421.const$0.set(seg, x);
    }
    public static long v_binary$get(MemorySegment seg, long index) {
        return (long)constants$421.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void v_binary$set(MemorySegment seg, long index, long x) {
        constants$421.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle v_octal$VH() {
        return constants$421.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long v_octal;
     * }
     */
    public static long v_octal$get(MemorySegment seg) {
        return (long)constants$421.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long v_octal;
     * }
     */
    public static void v_octal$set(MemorySegment seg, long x) {
        constants$421.const$1.set(seg, x);
    }
    public static long v_octal$get(MemorySegment seg, long index) {
        return (long)constants$421.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void v_octal$set(MemorySegment seg, long index, long x) {
        constants$421.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle v_int$VH() {
        return constants$421.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long v_int;
     * }
     */
    public static long v_int$get(MemorySegment seg) {
        return (long)constants$421.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long v_int;
     * }
     */
    public static void v_int$set(MemorySegment seg, long x) {
        constants$421.const$2.set(seg, x);
    }
    public static long v_int$get(MemorySegment seg, long index) {
        return (long)constants$421.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void v_int$set(MemorySegment seg, long index, long x) {
        constants$421.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle v_int64$VH() {
        return constants$421.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long v_int64;
     * }
     */
    public static long v_int64$get(MemorySegment seg) {
        return (long)constants$421.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long v_int64;
     * }
     */
    public static void v_int64$set(MemorySegment seg, long x) {
        constants$421.const$3.set(seg, x);
    }
    public static long v_int64$get(MemorySegment seg, long index) {
        return (long)constants$421.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void v_int64$set(MemorySegment seg, long index, long x) {
        constants$421.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle v_float$VH() {
        return constants$421.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double v_float;
     * }
     */
    public static double v_float$get(MemorySegment seg) {
        return (double)constants$421.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double v_float;
     * }
     */
    public static void v_float$set(MemorySegment seg, double x) {
        constants$421.const$4.set(seg, x);
    }
    public static double v_float$get(MemorySegment seg, long index) {
        return (double)constants$421.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void v_float$set(MemorySegment seg, long index, double x) {
        constants$421.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle v_hex$VH() {
        return constants$421.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long v_hex;
     * }
     */
    public static long v_hex$get(MemorySegment seg) {
        return (long)constants$421.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long v_hex;
     * }
     */
    public static void v_hex$set(MemorySegment seg, long x) {
        constants$421.const$5.set(seg, x);
    }
    public static long v_hex$get(MemorySegment seg, long index) {
        return (long)constants$421.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void v_hex$set(MemorySegment seg, long index, long x) {
        constants$421.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle v_string$VH() {
        return constants$422.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* v_string;
     * }
     */
    public static MemorySegment v_string$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$422.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* v_string;
     * }
     */
    public static void v_string$set(MemorySegment seg, MemorySegment x) {
        constants$422.const$0.set(seg, x);
    }
    public static MemorySegment v_string$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$422.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void v_string$set(MemorySegment seg, long index, MemorySegment x) {
        constants$422.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle v_comment$VH() {
        return constants$422.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* v_comment;
     * }
     */
    public static MemorySegment v_comment$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$422.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* v_comment;
     * }
     */
    public static void v_comment$set(MemorySegment seg, MemorySegment x) {
        constants$422.const$1.set(seg, x);
    }
    public static MemorySegment v_comment$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$422.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void v_comment$set(MemorySegment seg, long index, MemorySegment x) {
        constants$422.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle v_char$VH() {
        return constants$422.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned char v_char;
     * }
     */
    public static byte v_char$get(MemorySegment seg) {
        return (byte)constants$422.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned char v_char;
     * }
     */
    public static void v_char$set(MemorySegment seg, byte x) {
        constants$422.const$2.set(seg, x);
    }
    public static byte v_char$get(MemorySegment seg, long index) {
        return (byte)constants$422.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void v_char$set(MemorySegment seg, long index, byte x) {
        constants$422.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle v_error$VH() {
        return constants$422.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int v_error;
     * }
     */
    public static int v_error$get(MemorySegment seg) {
        return (int)constants$422.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int v_error;
     * }
     */
    public static void v_error$set(MemorySegment seg, int x) {
        constants$422.const$3.set(seg, x);
    }
    public static int v_error$get(MemorySegment seg, long index) {
        return (int)constants$422.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void v_error$set(MemorySegment seg, long index, int x) {
        constants$422.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

