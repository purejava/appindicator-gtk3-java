// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;

/**
 * {@snippet lang=c :
 * struct _GDebugControllerInterface {
 *     GTypeInterface g_iface;
 * }
 * }
 */
public class _GDebugControllerInterface {

    _GDebugControllerInterface() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _GTypeInterface.layout().withName("g_iface")
    ).withName("_GDebugControllerInterface");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout g_iface$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("g_iface"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GTypeInterface g_iface
     * }
     */
    public static final GroupLayout g_iface$layout() {
        return g_iface$LAYOUT;
    }

    private static final long g_iface$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GTypeInterface g_iface
     * }
     */
    public static final long g_iface$offset() {
        return g_iface$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GTypeInterface g_iface
     * }
     */
    public static MemorySegment g_iface(MemorySegment struct) {
        return struct.asSlice(g_iface$OFFSET, g_iface$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GTypeInterface g_iface
     * }
     */
    public static void g_iface(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, g_iface$OFFSET, g_iface$LAYOUT.byteSize());
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

