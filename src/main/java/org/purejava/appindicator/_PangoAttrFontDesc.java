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
 * struct _PangoAttrFontDesc {
 *     PangoAttribute attr;
 *     PangoFontDescription *desc;
 * }
 * }
 */
public class _PangoAttrFontDesc {

    _PangoAttrFontDesc() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _PangoAttribute.layout().withName("attr"),
        app_indicator_h.C_POINTER.withName("desc")
    ).withName("_PangoAttrFontDesc");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout attr$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("attr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PangoAttribute attr
     * }
     */
    public static final GroupLayout attr$layout() {
        return attr$LAYOUT;
    }

    private static final long attr$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PangoAttribute attr
     * }
     */
    public static final long attr$offset() {
        return attr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PangoAttribute attr
     * }
     */
    public static MemorySegment attr(MemorySegment struct) {
        return struct.asSlice(attr$OFFSET, attr$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PangoAttribute attr
     * }
     */
    public static void attr(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, attr$OFFSET, attr$LAYOUT.byteSize());
    }

    private static final AddressLayout desc$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("desc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PangoFontDescription *desc
     * }
     */
    public static final AddressLayout desc$layout() {
        return desc$LAYOUT;
    }

    private static final long desc$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PangoFontDescription *desc
     * }
     */
    public static final long desc$offset() {
        return desc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PangoFontDescription *desc
     * }
     */
    public static MemorySegment desc(MemorySegment struct) {
        return struct.get(desc$LAYOUT, desc$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PangoFontDescription *desc
     * }
     */
    public static void desc(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(desc$LAYOUT, desc$OFFSET, fieldValue);
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

