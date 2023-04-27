// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PangoAttrFontFeatures {
 *     PangoAttribute attr;
 *     gchar* features;
 * };
 * }
 */
public class _PangoAttrFontFeatures {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("klass"),
            Constants$root.C_INT$LAYOUT.withName("start_index"),
            Constants$root.C_INT$LAYOUT.withName("end_index")
        ).withName("attr"),
        Constants$root.C_POINTER$LAYOUT.withName("features")
    ).withName("_PangoAttrFontFeatures");
    public static MemoryLayout $LAYOUT() {
        return _PangoAttrFontFeatures.$struct$LAYOUT;
    }
    public static MemorySegment attr$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final VarHandle features$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("features"));
    public static VarHandle features$VH() {
        return _PangoAttrFontFeatures.features$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gchar* features;
     * }
     */
    public static MemorySegment features$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PangoAttrFontFeatures.features$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gchar* features;
     * }
     */
    public static void features$set(MemorySegment seg, MemorySegment x) {
        _PangoAttrFontFeatures.features$VH.set(seg, x);
    }
    public static MemorySegment features$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PangoAttrFontFeatures.features$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void features$set(MemorySegment seg, long index, MemorySegment x) {
        _PangoAttrFontFeatures.features$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


