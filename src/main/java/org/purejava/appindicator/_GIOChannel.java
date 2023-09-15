// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GIOChannel {
 *     int ref_count;
 *     struct _GIOFuncs* funcs;
 *     char* encoding;
 *     struct _GIConv* read_cd;
 *     struct _GIConv* write_cd;
 *     char* line_term;
 *     unsigned int line_term_len;
 *     unsigned long buf_size;
 *     struct _GString* read_buf;
 *     struct _GString* encoded_read_buf;
 *     struct _GString* write_buf;
 *     char partial_write_buf[6];
 *      *     unsigned int use_buffer;
 *     unsigned int do_encode;
 *     unsigned int close_on_unref;
 *     unsigned int is_readable;
 *     unsigned int is_writeable;
 *     unsigned int is_seekable;
 *     void* reserved1;
 *     void* reserved2;
 * };
 * }
 */
public class _GIOChannel {

    public static MemoryLayout $LAYOUT() {
        return constants$313.const$0;
    }
    public static VarHandle ref_count$VH() {
        return constants$313.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int ref_count;
     * }
     */
    public static int ref_count$get(MemorySegment seg) {
        return (int)constants$313.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int ref_count;
     * }
     */
    public static void ref_count$set(MemorySegment seg, int x) {
        constants$313.const$1.set(seg, x);
    }
    public static int ref_count$get(MemorySegment seg, long index) {
        return (int)constants$313.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void ref_count$set(MemorySegment seg, long index, int x) {
        constants$313.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle funcs$VH() {
        return constants$313.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GIOFuncs* funcs;
     * }
     */
    public static MemorySegment funcs$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$313.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GIOFuncs* funcs;
     * }
     */
    public static void funcs$set(MemorySegment seg, MemorySegment x) {
        constants$313.const$2.set(seg, x);
    }
    public static MemorySegment funcs$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$313.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void funcs$set(MemorySegment seg, long index, MemorySegment x) {
        constants$313.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle encoding$VH() {
        return constants$313.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* encoding;
     * }
     */
    public static MemorySegment encoding$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$313.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* encoding;
     * }
     */
    public static void encoding$set(MemorySegment seg, MemorySegment x) {
        constants$313.const$3.set(seg, x);
    }
    public static MemorySegment encoding$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$313.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void encoding$set(MemorySegment seg, long index, MemorySegment x) {
        constants$313.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle read_cd$VH() {
        return constants$313.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GIConv* read_cd;
     * }
     */
    public static MemorySegment read_cd$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$313.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GIConv* read_cd;
     * }
     */
    public static void read_cd$set(MemorySegment seg, MemorySegment x) {
        constants$313.const$4.set(seg, x);
    }
    public static MemorySegment read_cd$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$313.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void read_cd$set(MemorySegment seg, long index, MemorySegment x) {
        constants$313.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle write_cd$VH() {
        return constants$313.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GIConv* write_cd;
     * }
     */
    public static MemorySegment write_cd$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$313.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GIConv* write_cd;
     * }
     */
    public static void write_cd$set(MemorySegment seg, MemorySegment x) {
        constants$313.const$5.set(seg, x);
    }
    public static MemorySegment write_cd$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$313.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void write_cd$set(MemorySegment seg, long index, MemorySegment x) {
        constants$313.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle line_term$VH() {
        return constants$314.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* line_term;
     * }
     */
    public static MemorySegment line_term$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$314.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* line_term;
     * }
     */
    public static void line_term$set(MemorySegment seg, MemorySegment x) {
        constants$314.const$0.set(seg, x);
    }
    public static MemorySegment line_term$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$314.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void line_term$set(MemorySegment seg, long index, MemorySegment x) {
        constants$314.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle line_term_len$VH() {
        return constants$314.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int line_term_len;
     * }
     */
    public static int line_term_len$get(MemorySegment seg) {
        return (int)constants$314.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int line_term_len;
     * }
     */
    public static void line_term_len$set(MemorySegment seg, int x) {
        constants$314.const$1.set(seg, x);
    }
    public static int line_term_len$get(MemorySegment seg, long index) {
        return (int)constants$314.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void line_term_len$set(MemorySegment seg, long index, int x) {
        constants$314.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle buf_size$VH() {
        return constants$314.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long buf_size;
     * }
     */
    public static long buf_size$get(MemorySegment seg) {
        return (long)constants$314.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long buf_size;
     * }
     */
    public static void buf_size$set(MemorySegment seg, long x) {
        constants$314.const$2.set(seg, x);
    }
    public static long buf_size$get(MemorySegment seg, long index) {
        return (long)constants$314.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void buf_size$set(MemorySegment seg, long index, long x) {
        constants$314.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle read_buf$VH() {
        return constants$314.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GString* read_buf;
     * }
     */
    public static MemorySegment read_buf$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$314.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GString* read_buf;
     * }
     */
    public static void read_buf$set(MemorySegment seg, MemorySegment x) {
        constants$314.const$3.set(seg, x);
    }
    public static MemorySegment read_buf$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$314.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void read_buf$set(MemorySegment seg, long index, MemorySegment x) {
        constants$314.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle encoded_read_buf$VH() {
        return constants$314.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GString* encoded_read_buf;
     * }
     */
    public static MemorySegment encoded_read_buf$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$314.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GString* encoded_read_buf;
     * }
     */
    public static void encoded_read_buf$set(MemorySegment seg, MemorySegment x) {
        constants$314.const$4.set(seg, x);
    }
    public static MemorySegment encoded_read_buf$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$314.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void encoded_read_buf$set(MemorySegment seg, long index, MemorySegment x) {
        constants$314.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle write_buf$VH() {
        return constants$314.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GString* write_buf;
     * }
     */
    public static MemorySegment write_buf$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$314.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GString* write_buf;
     * }
     */
    public static void write_buf$set(MemorySegment seg, MemorySegment x) {
        constants$314.const$5.set(seg, x);
    }
    public static MemorySegment write_buf$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$314.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void write_buf$set(MemorySegment seg, long index, MemorySegment x) {
        constants$314.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment partial_write_buf$slice(MemorySegment seg) {
        return seg.asSlice(88, 6);
    }
    public static VarHandle reserved1$VH() {
        return constants$315.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* reserved1;
     * }
     */
    public static MemorySegment reserved1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$315.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* reserved1;
     * }
     */
    public static void reserved1$set(MemorySegment seg, MemorySegment x) {
        constants$315.const$0.set(seg, x);
    }
    public static MemorySegment reserved1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$315.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved1$set(MemorySegment seg, long index, MemorySegment x) {
        constants$315.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle reserved2$VH() {
        return constants$315.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* reserved2;
     * }
     */
    public static MemorySegment reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$315.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* reserved2;
     * }
     */
    public static void reserved2$set(MemorySegment seg, MemorySegment x) {
        constants$315.const$1.set(seg, x);
    }
    public static MemorySegment reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$315.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved2$set(MemorySegment seg, long index, MemorySegment x) {
        constants$315.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


