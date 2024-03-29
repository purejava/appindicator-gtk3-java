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
 * struct _PangoGlyphInfo {
 *     PangoGlyph glyph;
 *     PangoGlyphGeometry geometry;
 *     PangoGlyphVisAttr attr;
 * }
 * }
 */
public class _PangoGlyphInfo {

    _PangoGlyphInfo() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        app_indicator_h.C_INT.withName("glyph"),
        _PangoGlyphGeometry.layout().withName("geometry"),
        _PangoGlyphVisAttr.layout().withName("attr")
    ).withName("_PangoGlyphInfo");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt glyph$LAYOUT = (OfInt)$LAYOUT.select(groupElement("glyph"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PangoGlyph glyph
     * }
     */
    public static final OfInt glyph$layout() {
        return glyph$LAYOUT;
    }

    private static final long glyph$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PangoGlyph glyph
     * }
     */
    public static final long glyph$offset() {
        return glyph$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PangoGlyph glyph
     * }
     */
    public static int glyph(MemorySegment struct) {
        return struct.get(glyph$LAYOUT, glyph$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PangoGlyph glyph
     * }
     */
    public static void glyph(MemorySegment struct, int fieldValue) {
        struct.set(glyph$LAYOUT, glyph$OFFSET, fieldValue);
    }

    private static final GroupLayout geometry$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("geometry"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PangoGlyphGeometry geometry
     * }
     */
    public static final GroupLayout geometry$layout() {
        return geometry$LAYOUT;
    }

    private static final long geometry$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PangoGlyphGeometry geometry
     * }
     */
    public static final long geometry$offset() {
        return geometry$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PangoGlyphGeometry geometry
     * }
     */
    public static MemorySegment geometry(MemorySegment struct) {
        return struct.asSlice(geometry$OFFSET, geometry$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PangoGlyphGeometry geometry
     * }
     */
    public static void geometry(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, geometry$OFFSET, geometry$LAYOUT.byteSize());
    }

    private static final GroupLayout attr$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("attr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PangoGlyphVisAttr attr
     * }
     */
    public static final GroupLayout attr$layout() {
        return attr$LAYOUT;
    }

    private static final long attr$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PangoGlyphVisAttr attr
     * }
     */
    public static final long attr$offset() {
        return attr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PangoGlyphVisAttr attr
     * }
     */
    public static MemorySegment attr(MemorySegment struct) {
        return struct.asSlice(attr$OFFSET, attr$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PangoGlyphVisAttr attr
     * }
     */
    public static void attr(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, attr$OFFSET, attr$LAYOUT.byteSize());
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

