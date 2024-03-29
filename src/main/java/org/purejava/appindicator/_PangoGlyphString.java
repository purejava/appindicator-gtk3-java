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
 * struct _PangoGlyphString {
 *     int num_glyphs;
 *     PangoGlyphInfo *glyphs;
 *     int *log_clusters;
 *     int space;
 * }
 * }
 */
public class _PangoGlyphString {

    _PangoGlyphString() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        app_indicator_h.C_INT.withName("num_glyphs"),
        MemoryLayout.paddingLayout(4),
        app_indicator_h.C_POINTER.withName("glyphs"),
        app_indicator_h.C_POINTER.withName("log_clusters"),
        app_indicator_h.C_INT.withName("space"),
        MemoryLayout.paddingLayout(4)
    ).withName("_PangoGlyphString");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt num_glyphs$LAYOUT = (OfInt)$LAYOUT.select(groupElement("num_glyphs"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int num_glyphs
     * }
     */
    public static final OfInt num_glyphs$layout() {
        return num_glyphs$LAYOUT;
    }

    private static final long num_glyphs$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int num_glyphs
     * }
     */
    public static final long num_glyphs$offset() {
        return num_glyphs$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int num_glyphs
     * }
     */
    public static int num_glyphs(MemorySegment struct) {
        return struct.get(num_glyphs$LAYOUT, num_glyphs$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int num_glyphs
     * }
     */
    public static void num_glyphs(MemorySegment struct, int fieldValue) {
        struct.set(num_glyphs$LAYOUT, num_glyphs$OFFSET, fieldValue);
    }

    private static final AddressLayout glyphs$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("glyphs"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PangoGlyphInfo *glyphs
     * }
     */
    public static final AddressLayout glyphs$layout() {
        return glyphs$LAYOUT;
    }

    private static final long glyphs$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PangoGlyphInfo *glyphs
     * }
     */
    public static final long glyphs$offset() {
        return glyphs$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PangoGlyphInfo *glyphs
     * }
     */
    public static MemorySegment glyphs(MemorySegment struct) {
        return struct.get(glyphs$LAYOUT, glyphs$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PangoGlyphInfo *glyphs
     * }
     */
    public static void glyphs(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(glyphs$LAYOUT, glyphs$OFFSET, fieldValue);
    }

    private static final AddressLayout log_clusters$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("log_clusters"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int *log_clusters
     * }
     */
    public static final AddressLayout log_clusters$layout() {
        return log_clusters$LAYOUT;
    }

    private static final long log_clusters$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int *log_clusters
     * }
     */
    public static final long log_clusters$offset() {
        return log_clusters$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int *log_clusters
     * }
     */
    public static MemorySegment log_clusters(MemorySegment struct) {
        return struct.get(log_clusters$LAYOUT, log_clusters$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int *log_clusters
     * }
     */
    public static void log_clusters(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(log_clusters$LAYOUT, log_clusters$OFFSET, fieldValue);
    }

    private static final OfInt space$LAYOUT = (OfInt)$LAYOUT.select(groupElement("space"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int space
     * }
     */
    public static final OfInt space$layout() {
        return space$LAYOUT;
    }

    private static final long space$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int space
     * }
     */
    public static final long space$offset() {
        return space$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int space
     * }
     */
    public static int space(MemorySegment struct) {
        return struct.get(space$LAYOUT, space$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int space
     * }
     */
    public static void space(MemorySegment struct, int fieldValue) {
        struct.set(space$LAYOUT, space$OFFSET, fieldValue);
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

