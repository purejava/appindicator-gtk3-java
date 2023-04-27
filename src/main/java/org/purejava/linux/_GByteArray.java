// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GByteArray {
 *     guint8* data;
 *     guint len;
 * };
 * }
 */
public class _GByteArray {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("data"),
        Constants$root.C_INT$LAYOUT.withName("len"),
        MemoryLayout.paddingLayout(32)
    ).withName("_GByteArray");
    public static MemoryLayout $LAYOUT() {
        return _GByteArray.$struct$LAYOUT;
    }
    static final VarHandle data$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("data"));
    public static VarHandle data$VH() {
        return _GByteArray.data$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * guint8* data;
     * }
     */
    public static MemorySegment data$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GByteArray.data$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * guint8* data;
     * }
     */
    public static void data$set(MemorySegment seg, MemorySegment x) {
        _GByteArray.data$VH.set(seg, x);
    }
    public static MemorySegment data$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GByteArray.data$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void data$set(MemorySegment seg, long index, MemorySegment x) {
        _GByteArray.data$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle len$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("len"));
    public static VarHandle len$VH() {
        return _GByteArray.len$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * guint len;
     * }
     */
    public static int len$get(MemorySegment seg) {
        return (int)_GByteArray.len$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * guint len;
     * }
     */
    public static void len$set(MemorySegment seg, int x) {
        _GByteArray.len$VH.set(seg, x);
    }
    public static int len$get(MemorySegment seg, long index) {
        return (int)_GByteArray.len$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void len$set(MemorySegment seg, long index, int x) {
        _GByteArray.len$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


