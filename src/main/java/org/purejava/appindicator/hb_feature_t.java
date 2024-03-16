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
 * struct hb_feature_t {
 *     hb_tag_t tag;
 *     uint32_t value;
 *     unsigned int start;
 *     unsigned int end;
 * }
 * }
 */
public class hb_feature_t {

    hb_feature_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        app_indicator_h.C_INT.withName("tag"),
        app_indicator_h.C_INT.withName("value"),
        app_indicator_h.C_INT.withName("start"),
        app_indicator_h.C_INT.withName("end")
    ).withName("hb_feature_t");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt tag$LAYOUT = (OfInt)$LAYOUT.select(groupElement("tag"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * hb_tag_t tag
     * }
     */
    public static final OfInt tag$layout() {
        return tag$LAYOUT;
    }

    private static final long tag$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * hb_tag_t tag
     * }
     */
    public static final long tag$offset() {
        return tag$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * hb_tag_t tag
     * }
     */
    public static int tag(MemorySegment struct) {
        return struct.get(tag$LAYOUT, tag$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * hb_tag_t tag
     * }
     */
    public static void tag(MemorySegment struct, int fieldValue) {
        struct.set(tag$LAYOUT, tag$OFFSET, fieldValue);
    }

    private static final OfInt value$LAYOUT = (OfInt)$LAYOUT.select(groupElement("value"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t value
     * }
     */
    public static final OfInt value$layout() {
        return value$LAYOUT;
    }

    private static final long value$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t value
     * }
     */
    public static final long value$offset() {
        return value$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t value
     * }
     */
    public static int value(MemorySegment struct) {
        return struct.get(value$LAYOUT, value$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t value
     * }
     */
    public static void value(MemorySegment struct, int fieldValue) {
        struct.set(value$LAYOUT, value$OFFSET, fieldValue);
    }

    private static final OfInt start$LAYOUT = (OfInt)$LAYOUT.select(groupElement("start"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int start
     * }
     */
    public static final OfInt start$layout() {
        return start$LAYOUT;
    }

    private static final long start$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int start
     * }
     */
    public static final long start$offset() {
        return start$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int start
     * }
     */
    public static int start(MemorySegment struct) {
        return struct.get(start$LAYOUT, start$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int start
     * }
     */
    public static void start(MemorySegment struct, int fieldValue) {
        struct.set(start$LAYOUT, start$OFFSET, fieldValue);
    }

    private static final OfInt end$LAYOUT = (OfInt)$LAYOUT.select(groupElement("end"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int end
     * }
     */
    public static final OfInt end$layout() {
        return end$LAYOUT;
    }

    private static final long end$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int end
     * }
     */
    public static final long end$offset() {
        return end$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int end
     * }
     */
    public static int end(MemorySegment struct) {
        return struct.get(end$LAYOUT, end$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int end
     * }
     */
    public static void end(MemorySegment struct, int fieldValue) {
        struct.set(end$LAYOUT, end$OFFSET, fieldValue);
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

