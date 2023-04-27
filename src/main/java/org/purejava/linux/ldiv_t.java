// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct {
 *     long quot;
 *     long rem;
 * };
 * }
 */
public class ldiv_t {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("quot"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("rem")
    );
    public static MemoryLayout $LAYOUT() {
        return ldiv_t.$struct$LAYOUT;
    }
    static final VarHandle quot$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("quot"));
    public static VarHandle quot$VH() {
        return ldiv_t.quot$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long quot;
     * }
     */
    public static long quot$get(MemorySegment seg) {
        return (long)ldiv_t.quot$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long quot;
     * }
     */
    public static void quot$set(MemorySegment seg, long x) {
        ldiv_t.quot$VH.set(seg, x);
    }
    public static long quot$get(MemorySegment seg, long index) {
        return (long)ldiv_t.quot$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void quot$set(MemorySegment seg, long index, long x) {
        ldiv_t.quot$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rem$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rem"));
    public static VarHandle rem$VH() {
        return ldiv_t.rem$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long rem;
     * }
     */
    public static long rem$get(MemorySegment seg) {
        return (long)ldiv_t.rem$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long rem;
     * }
     */
    public static void rem$set(MemorySegment seg, long x) {
        ldiv_t.rem$VH.set(seg, x);
    }
    public static long rem$get(MemorySegment seg, long index) {
        return (long)ldiv_t.rem$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rem$set(MemorySegment seg, long index, long x) {
        ldiv_t.rem$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


