// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct {
 *     double x_bearing;
 *     double y_bearing;
 *     double width;
 *     double height;
 *     double x_advance;
 *     double y_advance;
 * }
 * }
 */
public class cairo_text_extents_t {

    cairo_text_extents_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        app_indicator_h.C_DOUBLE.withName("x_bearing"),
        app_indicator_h.C_DOUBLE.withName("y_bearing"),
        app_indicator_h.C_DOUBLE.withName("width"),
        app_indicator_h.C_DOUBLE.withName("height"),
        app_indicator_h.C_DOUBLE.withName("x_advance"),
        app_indicator_h.C_DOUBLE.withName("y_advance")
    ).withName("$anon$1247:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfDouble x_bearing$LAYOUT = (OfDouble)$LAYOUT.select(groupElement("x_bearing"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * double x_bearing
     * }
     */
    public static final OfDouble x_bearing$layout() {
        return x_bearing$LAYOUT;
    }

    private static final long x_bearing$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * double x_bearing
     * }
     */
    public static final long x_bearing$offset() {
        return x_bearing$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * double x_bearing
     * }
     */
    public static double x_bearing(MemorySegment struct) {
        return struct.get(x_bearing$LAYOUT, x_bearing$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * double x_bearing
     * }
     */
    public static void x_bearing(MemorySegment struct, double fieldValue) {
        struct.set(x_bearing$LAYOUT, x_bearing$OFFSET, fieldValue);
    }

    private static final OfDouble y_bearing$LAYOUT = (OfDouble)$LAYOUT.select(groupElement("y_bearing"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * double y_bearing
     * }
     */
    public static final OfDouble y_bearing$layout() {
        return y_bearing$LAYOUT;
    }

    private static final long y_bearing$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * double y_bearing
     * }
     */
    public static final long y_bearing$offset() {
        return y_bearing$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * double y_bearing
     * }
     */
    public static double y_bearing(MemorySegment struct) {
        return struct.get(y_bearing$LAYOUT, y_bearing$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * double y_bearing
     * }
     */
    public static void y_bearing(MemorySegment struct, double fieldValue) {
        struct.set(y_bearing$LAYOUT, y_bearing$OFFSET, fieldValue);
    }

    private static final OfDouble width$LAYOUT = (OfDouble)$LAYOUT.select(groupElement("width"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * double width
     * }
     */
    public static final OfDouble width$layout() {
        return width$LAYOUT;
    }

    private static final long width$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * double width
     * }
     */
    public static final long width$offset() {
        return width$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * double width
     * }
     */
    public static double width(MemorySegment struct) {
        return struct.get(width$LAYOUT, width$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * double width
     * }
     */
    public static void width(MemorySegment struct, double fieldValue) {
        struct.set(width$LAYOUT, width$OFFSET, fieldValue);
    }

    private static final OfDouble height$LAYOUT = (OfDouble)$LAYOUT.select(groupElement("height"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * double height
     * }
     */
    public static final OfDouble height$layout() {
        return height$LAYOUT;
    }

    private static final long height$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * double height
     * }
     */
    public static final long height$offset() {
        return height$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * double height
     * }
     */
    public static double height(MemorySegment struct) {
        return struct.get(height$LAYOUT, height$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * double height
     * }
     */
    public static void height(MemorySegment struct, double fieldValue) {
        struct.set(height$LAYOUT, height$OFFSET, fieldValue);
    }

    private static final OfDouble x_advance$LAYOUT = (OfDouble)$LAYOUT.select(groupElement("x_advance"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * double x_advance
     * }
     */
    public static final OfDouble x_advance$layout() {
        return x_advance$LAYOUT;
    }

    private static final long x_advance$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * double x_advance
     * }
     */
    public static final long x_advance$offset() {
        return x_advance$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * double x_advance
     * }
     */
    public static double x_advance(MemorySegment struct) {
        return struct.get(x_advance$LAYOUT, x_advance$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * double x_advance
     * }
     */
    public static void x_advance(MemorySegment struct, double fieldValue) {
        struct.set(x_advance$LAYOUT, x_advance$OFFSET, fieldValue);
    }

    private static final OfDouble y_advance$LAYOUT = (OfDouble)$LAYOUT.select(groupElement("y_advance"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * double y_advance
     * }
     */
    public static final OfDouble y_advance$layout() {
        return y_advance$LAYOUT;
    }

    private static final long y_advance$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * double y_advance
     * }
     */
    public static final long y_advance$offset() {
        return y_advance$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * double y_advance
     * }
     */
    public static double y_advance(MemorySegment struct) {
        return struct.get(y_advance$LAYOUT, y_advance$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * double y_advance
     * }
     */
    public static void y_advance(MemorySegment struct, double fieldValue) {
        struct.set(y_advance$LAYOUT, y_advance$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

