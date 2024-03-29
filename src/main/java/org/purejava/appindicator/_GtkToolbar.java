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
 * struct _GtkToolbar {
 *     GtkContainer container;
 *     GtkToolbarPrivate *priv;
 * }
 * }
 */
public class _GtkToolbar {

    _GtkToolbar() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _GtkContainer.layout().withName("container"),
        app_indicator_h.C_POINTER.withName("priv")
    ).withName("_GtkToolbar");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout container$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("container"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GtkContainer container
     * }
     */
    public static final GroupLayout container$layout() {
        return container$LAYOUT;
    }

    private static final long container$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GtkContainer container
     * }
     */
    public static final long container$offset() {
        return container$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GtkContainer container
     * }
     */
    public static MemorySegment container(MemorySegment struct) {
        return struct.asSlice(container$OFFSET, container$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GtkContainer container
     * }
     */
    public static void container(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, container$OFFSET, container$LAYOUT.byteSize());
    }

    private static final AddressLayout priv$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("priv"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GtkToolbarPrivate *priv
     * }
     */
    public static final AddressLayout priv$layout() {
        return priv$LAYOUT;
    }

    private static final long priv$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GtkToolbarPrivate *priv
     * }
     */
    public static final long priv$offset() {
        return priv$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GtkToolbarPrivate *priv
     * }
     */
    public static MemorySegment priv(MemorySegment struct) {
        return struct.get(priv$LAYOUT, priv$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GtkToolbarPrivate *priv
     * }
     */
    public static void priv(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(priv$LAYOUT, priv$OFFSET, fieldValue);
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

