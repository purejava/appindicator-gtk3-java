// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.VarHandle;
import java.lang.foreign.*;

/**
 * {@snippet :
 * struct {
 *     gboolean test_initialized;
 *     gboolean test_quick;
 *     gboolean test_perf;
 *     gboolean test_verbose;
 *     gboolean test_quiet;
 *     gboolean test_undefined;
 * };
 * }
 */
public class GTestConfig {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("test_initialized"),
        Constants$root.C_INT$LAYOUT.withName("test_quick"),
        Constants$root.C_INT$LAYOUT.withName("test_perf"),
        Constants$root.C_INT$LAYOUT.withName("test_verbose"),
        Constants$root.C_INT$LAYOUT.withName("test_quiet"),
        Constants$root.C_INT$LAYOUT.withName("test_undefined")
    );
    public static MemoryLayout $LAYOUT() {
        return GTestConfig.$struct$LAYOUT;
    }
    static final VarHandle test_initialized$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("test_initialized"));
    public static VarHandle test_initialized$VH() {
        return GTestConfig.test_initialized$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gboolean test_initialized;
     * }
     */
    public static int test_initialized$get(MemorySegment seg) {
        return (int)GTestConfig.test_initialized$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gboolean test_initialized;
     * }
     */
    public static void test_initialized$set(MemorySegment seg, int x) {
        GTestConfig.test_initialized$VH.set(seg, x);
    }
    public static int test_initialized$get(MemorySegment seg, long index) {
        return (int)GTestConfig.test_initialized$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void test_initialized$set(MemorySegment seg, long index, int x) {
        GTestConfig.test_initialized$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle test_quick$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("test_quick"));
    public static VarHandle test_quick$VH() {
        return GTestConfig.test_quick$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gboolean test_quick;
     * }
     */
    public static int test_quick$get(MemorySegment seg) {
        return (int)GTestConfig.test_quick$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gboolean test_quick;
     * }
     */
    public static void test_quick$set(MemorySegment seg, int x) {
        GTestConfig.test_quick$VH.set(seg, x);
    }
    public static int test_quick$get(MemorySegment seg, long index) {
        return (int)GTestConfig.test_quick$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void test_quick$set(MemorySegment seg, long index, int x) {
        GTestConfig.test_quick$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle test_perf$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("test_perf"));
    public static VarHandle test_perf$VH() {
        return GTestConfig.test_perf$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gboolean test_perf;
     * }
     */
    public static int test_perf$get(MemorySegment seg) {
        return (int)GTestConfig.test_perf$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gboolean test_perf;
     * }
     */
    public static void test_perf$set(MemorySegment seg, int x) {
        GTestConfig.test_perf$VH.set(seg, x);
    }
    public static int test_perf$get(MemorySegment seg, long index) {
        return (int)GTestConfig.test_perf$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void test_perf$set(MemorySegment seg, long index, int x) {
        GTestConfig.test_perf$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle test_verbose$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("test_verbose"));
    public static VarHandle test_verbose$VH() {
        return GTestConfig.test_verbose$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gboolean test_verbose;
     * }
     */
    public static int test_verbose$get(MemorySegment seg) {
        return (int)GTestConfig.test_verbose$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gboolean test_verbose;
     * }
     */
    public static void test_verbose$set(MemorySegment seg, int x) {
        GTestConfig.test_verbose$VH.set(seg, x);
    }
    public static int test_verbose$get(MemorySegment seg, long index) {
        return (int)GTestConfig.test_verbose$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void test_verbose$set(MemorySegment seg, long index, int x) {
        GTestConfig.test_verbose$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle test_quiet$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("test_quiet"));
    public static VarHandle test_quiet$VH() {
        return GTestConfig.test_quiet$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gboolean test_quiet;
     * }
     */
    public static int test_quiet$get(MemorySegment seg) {
        return (int)GTestConfig.test_quiet$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gboolean test_quiet;
     * }
     */
    public static void test_quiet$set(MemorySegment seg, int x) {
        GTestConfig.test_quiet$VH.set(seg, x);
    }
    public static int test_quiet$get(MemorySegment seg, long index) {
        return (int)GTestConfig.test_quiet$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void test_quiet$set(MemorySegment seg, long index, int x) {
        GTestConfig.test_quiet$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle test_undefined$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("test_undefined"));
    public static VarHandle test_undefined$VH() {
        return GTestConfig.test_undefined$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gboolean test_undefined;
     * }
     */
    public static int test_undefined$get(MemorySegment seg) {
        return (int)GTestConfig.test_undefined$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gboolean test_undefined;
     * }
     */
    public static void test_undefined$set(MemorySegment seg, int x) {
        GTestConfig.test_undefined$VH.set(seg, x);
    }
    public static int test_undefined$get(MemorySegment seg, long index) {
        return (int)GTestConfig.test_undefined$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void test_undefined$set(MemorySegment seg, long index, int x) {
        GTestConfig.test_undefined$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

