// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct hb_draw_state_t {
 *     hb_bool_t path_open;
 *     float path_start_x;
 *     float path_start_y;
 *     float current_x;
 *     float current_y;
 *     hb_var_num_t reserved1;
 *     hb_var_num_t reserved2;
 *     hb_var_num_t reserved3;
 *     hb_var_num_t reserved4;
 *     hb_var_num_t reserved5;
 *     hb_var_num_t reserved6;
 *     hb_var_num_t reserved7;
 * };
 * }
 */
public class hb_draw_state_t {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("path_open"),
        Constants$root.C_FLOAT$LAYOUT.withName("path_start_x"),
        Constants$root.C_FLOAT$LAYOUT.withName("path_start_y"),
        Constants$root.C_FLOAT$LAYOUT.withName("current_x"),
        Constants$root.C_FLOAT$LAYOUT.withName("current_y"),
        MemoryLayout.unionLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("f"),
            Constants$root.C_INT$LAYOUT.withName("u32"),
            Constants$root.C_INT$LAYOUT.withName("i32"),
            MemoryLayout.sequenceLayout(2, Constants$root.C_SHORT$LAYOUT).withName("u16"),
            MemoryLayout.sequenceLayout(2, Constants$root.C_SHORT$LAYOUT).withName("i16"),
            MemoryLayout.sequenceLayout(4, Constants$root.C_CHAR$LAYOUT).withName("u8"),
            MemoryLayout.sequenceLayout(4, Constants$root.C_CHAR$LAYOUT).withName("i8")
        ).withName("reserved1"),
        MemoryLayout.unionLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("f"),
            Constants$root.C_INT$LAYOUT.withName("u32"),
            Constants$root.C_INT$LAYOUT.withName("i32"),
            MemoryLayout.sequenceLayout(2, Constants$root.C_SHORT$LAYOUT).withName("u16"),
            MemoryLayout.sequenceLayout(2, Constants$root.C_SHORT$LAYOUT).withName("i16"),
            MemoryLayout.sequenceLayout(4, Constants$root.C_CHAR$LAYOUT).withName("u8"),
            MemoryLayout.sequenceLayout(4, Constants$root.C_CHAR$LAYOUT).withName("i8")
        ).withName("reserved2"),
        MemoryLayout.unionLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("f"),
            Constants$root.C_INT$LAYOUT.withName("u32"),
            Constants$root.C_INT$LAYOUT.withName("i32"),
            MemoryLayout.sequenceLayout(2, Constants$root.C_SHORT$LAYOUT).withName("u16"),
            MemoryLayout.sequenceLayout(2, Constants$root.C_SHORT$LAYOUT).withName("i16"),
            MemoryLayout.sequenceLayout(4, Constants$root.C_CHAR$LAYOUT).withName("u8"),
            MemoryLayout.sequenceLayout(4, Constants$root.C_CHAR$LAYOUT).withName("i8")
        ).withName("reserved3"),
        MemoryLayout.unionLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("f"),
            Constants$root.C_INT$LAYOUT.withName("u32"),
            Constants$root.C_INT$LAYOUT.withName("i32"),
            MemoryLayout.sequenceLayout(2, Constants$root.C_SHORT$LAYOUT).withName("u16"),
            MemoryLayout.sequenceLayout(2, Constants$root.C_SHORT$LAYOUT).withName("i16"),
            MemoryLayout.sequenceLayout(4, Constants$root.C_CHAR$LAYOUT).withName("u8"),
            MemoryLayout.sequenceLayout(4, Constants$root.C_CHAR$LAYOUT).withName("i8")
        ).withName("reserved4"),
        MemoryLayout.unionLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("f"),
            Constants$root.C_INT$LAYOUT.withName("u32"),
            Constants$root.C_INT$LAYOUT.withName("i32"),
            MemoryLayout.sequenceLayout(2, Constants$root.C_SHORT$LAYOUT).withName("u16"),
            MemoryLayout.sequenceLayout(2, Constants$root.C_SHORT$LAYOUT).withName("i16"),
            MemoryLayout.sequenceLayout(4, Constants$root.C_CHAR$LAYOUT).withName("u8"),
            MemoryLayout.sequenceLayout(4, Constants$root.C_CHAR$LAYOUT).withName("i8")
        ).withName("reserved5"),
        MemoryLayout.unionLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("f"),
            Constants$root.C_INT$LAYOUT.withName("u32"),
            Constants$root.C_INT$LAYOUT.withName("i32"),
            MemoryLayout.sequenceLayout(2, Constants$root.C_SHORT$LAYOUT).withName("u16"),
            MemoryLayout.sequenceLayout(2, Constants$root.C_SHORT$LAYOUT).withName("i16"),
            MemoryLayout.sequenceLayout(4, Constants$root.C_CHAR$LAYOUT).withName("u8"),
            MemoryLayout.sequenceLayout(4, Constants$root.C_CHAR$LAYOUT).withName("i8")
        ).withName("reserved6"),
        MemoryLayout.unionLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("f"),
            Constants$root.C_INT$LAYOUT.withName("u32"),
            Constants$root.C_INT$LAYOUT.withName("i32"),
            MemoryLayout.sequenceLayout(2, Constants$root.C_SHORT$LAYOUT).withName("u16"),
            MemoryLayout.sequenceLayout(2, Constants$root.C_SHORT$LAYOUT).withName("i16"),
            MemoryLayout.sequenceLayout(4, Constants$root.C_CHAR$LAYOUT).withName("u8"),
            MemoryLayout.sequenceLayout(4, Constants$root.C_CHAR$LAYOUT).withName("i8")
        ).withName("reserved7")
    ).withName("hb_draw_state_t");
    public static MemoryLayout $LAYOUT() {
        return hb_draw_state_t.$struct$LAYOUT;
    }
    static final VarHandle path_open$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("path_open"));
    public static VarHandle path_open$VH() {
        return hb_draw_state_t.path_open$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * hb_bool_t path_open;
     * }
     */
    public static int path_open$get(MemorySegment seg) {
        return (int)hb_draw_state_t.path_open$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * hb_bool_t path_open;
     * }
     */
    public static void path_open$set(MemorySegment seg, int x) {
        hb_draw_state_t.path_open$VH.set(seg, x);
    }
    public static int path_open$get(MemorySegment seg, long index) {
        return (int)hb_draw_state_t.path_open$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void path_open$set(MemorySegment seg, long index, int x) {
        hb_draw_state_t.path_open$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle path_start_x$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("path_start_x"));
    public static VarHandle path_start_x$VH() {
        return hb_draw_state_t.path_start_x$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * float path_start_x;
     * }
     */
    public static float path_start_x$get(MemorySegment seg) {
        return (float)hb_draw_state_t.path_start_x$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * float path_start_x;
     * }
     */
    public static void path_start_x$set(MemorySegment seg, float x) {
        hb_draw_state_t.path_start_x$VH.set(seg, x);
    }
    public static float path_start_x$get(MemorySegment seg, long index) {
        return (float)hb_draw_state_t.path_start_x$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void path_start_x$set(MemorySegment seg, long index, float x) {
        hb_draw_state_t.path_start_x$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle path_start_y$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("path_start_y"));
    public static VarHandle path_start_y$VH() {
        return hb_draw_state_t.path_start_y$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * float path_start_y;
     * }
     */
    public static float path_start_y$get(MemorySegment seg) {
        return (float)hb_draw_state_t.path_start_y$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * float path_start_y;
     * }
     */
    public static void path_start_y$set(MemorySegment seg, float x) {
        hb_draw_state_t.path_start_y$VH.set(seg, x);
    }
    public static float path_start_y$get(MemorySegment seg, long index) {
        return (float)hb_draw_state_t.path_start_y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void path_start_y$set(MemorySegment seg, long index, float x) {
        hb_draw_state_t.path_start_y$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle current_x$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("current_x"));
    public static VarHandle current_x$VH() {
        return hb_draw_state_t.current_x$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * float current_x;
     * }
     */
    public static float current_x$get(MemorySegment seg) {
        return (float)hb_draw_state_t.current_x$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * float current_x;
     * }
     */
    public static void current_x$set(MemorySegment seg, float x) {
        hb_draw_state_t.current_x$VH.set(seg, x);
    }
    public static float current_x$get(MemorySegment seg, long index) {
        return (float)hb_draw_state_t.current_x$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void current_x$set(MemorySegment seg, long index, float x) {
        hb_draw_state_t.current_x$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle current_y$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("current_y"));
    public static VarHandle current_y$VH() {
        return hb_draw_state_t.current_y$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * float current_y;
     * }
     */
    public static float current_y$get(MemorySegment seg) {
        return (float)hb_draw_state_t.current_y$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * float current_y;
     * }
     */
    public static void current_y$set(MemorySegment seg, float x) {
        hb_draw_state_t.current_y$VH.set(seg, x);
    }
    public static float current_y$get(MemorySegment seg, long index) {
        return (float)hb_draw_state_t.current_y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void current_y$set(MemorySegment seg, long index, float x) {
        hb_draw_state_t.current_y$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment reserved1$slice(MemorySegment seg) {
        return seg.asSlice(20, 4);
    }
    public static MemorySegment reserved2$slice(MemorySegment seg) {
        return seg.asSlice(24, 4);
    }
    public static MemorySegment reserved3$slice(MemorySegment seg) {
        return seg.asSlice(28, 4);
    }
    public static MemorySegment reserved4$slice(MemorySegment seg) {
        return seg.asSlice(32, 4);
    }
    public static MemorySegment reserved5$slice(MemorySegment seg) {
        return seg.asSlice(36, 4);
    }
    public static MemorySegment reserved6$slice(MemorySegment seg) {
        return seg.asSlice(40, 4);
    }
    public static MemorySegment reserved7$slice(MemorySegment seg) {
        return seg.asSlice(44, 4);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


