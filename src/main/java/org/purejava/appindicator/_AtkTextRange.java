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
 * struct _AtkTextRange {
 *     AtkTextRectangle bounds;
 *     gint start_offset;
 *     gint end_offset;
 *     gchar *content;
 * }
 * }
 */
public class _AtkTextRange {

    _AtkTextRange() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _AtkTextRectangle.layout().withName("bounds"),
        app_indicator_h.C_INT.withName("start_offset"),
        app_indicator_h.C_INT.withName("end_offset"),
        app_indicator_h.C_POINTER.withName("content")
    ).withName("_AtkTextRange");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout bounds$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("bounds"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * AtkTextRectangle bounds
     * }
     */
    public static final GroupLayout bounds$layout() {
        return bounds$LAYOUT;
    }

    private static final long bounds$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * AtkTextRectangle bounds
     * }
     */
    public static final long bounds$offset() {
        return bounds$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * AtkTextRectangle bounds
     * }
     */
    public static MemorySegment bounds(MemorySegment struct) {
        return struct.asSlice(bounds$OFFSET, bounds$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * AtkTextRectangle bounds
     * }
     */
    public static void bounds(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, bounds$OFFSET, bounds$LAYOUT.byteSize());
    }

    private static final OfInt start_offset$LAYOUT = (OfInt)$LAYOUT.select(groupElement("start_offset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gint start_offset
     * }
     */
    public static final OfInt start_offset$layout() {
        return start_offset$LAYOUT;
    }

    private static final long start_offset$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gint start_offset
     * }
     */
    public static final long start_offset$offset() {
        return start_offset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gint start_offset
     * }
     */
    public static int start_offset(MemorySegment struct) {
        return struct.get(start_offset$LAYOUT, start_offset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gint start_offset
     * }
     */
    public static void start_offset(MemorySegment struct, int fieldValue) {
        struct.set(start_offset$LAYOUT, start_offset$OFFSET, fieldValue);
    }

    private static final OfInt end_offset$LAYOUT = (OfInt)$LAYOUT.select(groupElement("end_offset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gint end_offset
     * }
     */
    public static final OfInt end_offset$layout() {
        return end_offset$LAYOUT;
    }

    private static final long end_offset$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gint end_offset
     * }
     */
    public static final long end_offset$offset() {
        return end_offset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gint end_offset
     * }
     */
    public static int end_offset(MemorySegment struct) {
        return struct.get(end_offset$LAYOUT, end_offset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gint end_offset
     * }
     */
    public static void end_offset(MemorySegment struct, int fieldValue) {
        struct.set(end_offset$LAYOUT, end_offset$OFFSET, fieldValue);
    }

    private static final AddressLayout content$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("content"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gchar *content
     * }
     */
    public static final AddressLayout content$layout() {
        return content$LAYOUT;
    }

    private static final long content$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gchar *content
     * }
     */
    public static final long content$offset() {
        return content$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gchar *content
     * }
     */
    public static MemorySegment content(MemorySegment struct) {
        return struct.get(content$LAYOUT, content$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gchar *content
     * }
     */
    public static void content(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(content$LAYOUT, content$OFFSET, fieldValue);
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

