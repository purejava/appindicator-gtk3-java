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
 * struct _GtkIconViewClass {
 *     GtkContainerClass parent_class;
 *     void (*item_activated)(GtkIconView *, GtkTreePath *);
 *     void (*selection_changed)(GtkIconView *);
 *     void (*select_all)(GtkIconView *);
 *     void (*unselect_all)(GtkIconView *);
 *     void (*select_cursor_item)(GtkIconView *);
 *     void (*toggle_cursor_item)(GtkIconView *);
 *     gboolean (*move_cursor)(GtkIconView *, GtkMovementStep, gint);
 *     gboolean (*activate_cursor_item)(GtkIconView *);
 *     void (*_gtk_reserved1)(void);
 *     void (*_gtk_reserved2)(void);
 *     void (*_gtk_reserved3)(void);
 *     void (*_gtk_reserved4)(void);
 * }
 * }
 */
public class _GtkIconViewClass {

    _GtkIconViewClass() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _GtkContainerClass.layout().withName("parent_class"),
        app_indicator_h.C_POINTER.withName("item_activated"),
        app_indicator_h.C_POINTER.withName("selection_changed"),
        app_indicator_h.C_POINTER.withName("select_all"),
        app_indicator_h.C_POINTER.withName("unselect_all"),
        app_indicator_h.C_POINTER.withName("select_cursor_item"),
        app_indicator_h.C_POINTER.withName("toggle_cursor_item"),
        app_indicator_h.C_POINTER.withName("move_cursor"),
        app_indicator_h.C_POINTER.withName("activate_cursor_item"),
        app_indicator_h.C_POINTER.withName("_gtk_reserved1"),
        app_indicator_h.C_POINTER.withName("_gtk_reserved2"),
        app_indicator_h.C_POINTER.withName("_gtk_reserved3"),
        app_indicator_h.C_POINTER.withName("_gtk_reserved4")
    ).withName("_GtkIconViewClass");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout parent_class$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("parent_class"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GtkContainerClass parent_class
     * }
     */
    public static final GroupLayout parent_class$layout() {
        return parent_class$LAYOUT;
    }

    private static final long parent_class$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GtkContainerClass parent_class
     * }
     */
    public static final long parent_class$offset() {
        return parent_class$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GtkContainerClass parent_class
     * }
     */
    public static MemorySegment parent_class(MemorySegment struct) {
        return struct.asSlice(parent_class$OFFSET, parent_class$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GtkContainerClass parent_class
     * }
     */
    public static void parent_class(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, parent_class$OFFSET, parent_class$LAYOUT.byteSize());
    }

    /**
     * {@snippet lang=c :
     * void (*item_activated)(GtkIconView *, GtkTreePath *)
     * }
     */
    public class item_activated {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, MemorySegment _x1);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            app_indicator_h.C_POINTER,
            app_indicator_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(item_activated.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(item_activated.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout item_activated$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("item_activated"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*item_activated)(GtkIconView *, GtkTreePath *)
     * }
     */
    public static final AddressLayout item_activated$layout() {
        return item_activated$LAYOUT;
    }

    private static final long item_activated$OFFSET = 976;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*item_activated)(GtkIconView *, GtkTreePath *)
     * }
     */
    public static final long item_activated$offset() {
        return item_activated$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*item_activated)(GtkIconView *, GtkTreePath *)
     * }
     */
    public static MemorySegment item_activated(MemorySegment struct) {
        return struct.get(item_activated$LAYOUT, item_activated$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*item_activated)(GtkIconView *, GtkTreePath *)
     * }
     */
    public static void item_activated(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(item_activated$LAYOUT, item_activated$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*selection_changed)(GtkIconView *)
     * }
     */
    public class selection_changed {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            app_indicator_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(selection_changed.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(selection_changed.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout selection_changed$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("selection_changed"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*selection_changed)(GtkIconView *)
     * }
     */
    public static final AddressLayout selection_changed$layout() {
        return selection_changed$LAYOUT;
    }

    private static final long selection_changed$OFFSET = 984;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*selection_changed)(GtkIconView *)
     * }
     */
    public static final long selection_changed$offset() {
        return selection_changed$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*selection_changed)(GtkIconView *)
     * }
     */
    public static MemorySegment selection_changed(MemorySegment struct) {
        return struct.get(selection_changed$LAYOUT, selection_changed$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*selection_changed)(GtkIconView *)
     * }
     */
    public static void selection_changed(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(selection_changed$LAYOUT, selection_changed$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*select_all)(GtkIconView *)
     * }
     */
    public class select_all {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            app_indicator_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(select_all.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(select_all.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout select_all$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("select_all"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*select_all)(GtkIconView *)
     * }
     */
    public static final AddressLayout select_all$layout() {
        return select_all$LAYOUT;
    }

    private static final long select_all$OFFSET = 992;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*select_all)(GtkIconView *)
     * }
     */
    public static final long select_all$offset() {
        return select_all$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*select_all)(GtkIconView *)
     * }
     */
    public static MemorySegment select_all(MemorySegment struct) {
        return struct.get(select_all$LAYOUT, select_all$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*select_all)(GtkIconView *)
     * }
     */
    public static void select_all(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(select_all$LAYOUT, select_all$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*unselect_all)(GtkIconView *)
     * }
     */
    public class unselect_all {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            app_indicator_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(unselect_all.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(unselect_all.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout unselect_all$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("unselect_all"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*unselect_all)(GtkIconView *)
     * }
     */
    public static final AddressLayout unselect_all$layout() {
        return unselect_all$LAYOUT;
    }

    private static final long unselect_all$OFFSET = 1000;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*unselect_all)(GtkIconView *)
     * }
     */
    public static final long unselect_all$offset() {
        return unselect_all$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*unselect_all)(GtkIconView *)
     * }
     */
    public static MemorySegment unselect_all(MemorySegment struct) {
        return struct.get(unselect_all$LAYOUT, unselect_all$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*unselect_all)(GtkIconView *)
     * }
     */
    public static void unselect_all(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(unselect_all$LAYOUT, unselect_all$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*select_cursor_item)(GtkIconView *)
     * }
     */
    public class select_cursor_item {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            app_indicator_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(select_cursor_item.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(select_cursor_item.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout select_cursor_item$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("select_cursor_item"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*select_cursor_item)(GtkIconView *)
     * }
     */
    public static final AddressLayout select_cursor_item$layout() {
        return select_cursor_item$LAYOUT;
    }

    private static final long select_cursor_item$OFFSET = 1008;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*select_cursor_item)(GtkIconView *)
     * }
     */
    public static final long select_cursor_item$offset() {
        return select_cursor_item$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*select_cursor_item)(GtkIconView *)
     * }
     */
    public static MemorySegment select_cursor_item(MemorySegment struct) {
        return struct.get(select_cursor_item$LAYOUT, select_cursor_item$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*select_cursor_item)(GtkIconView *)
     * }
     */
    public static void select_cursor_item(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(select_cursor_item$LAYOUT, select_cursor_item$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*toggle_cursor_item)(GtkIconView *)
     * }
     */
    public class toggle_cursor_item {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            app_indicator_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(toggle_cursor_item.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(toggle_cursor_item.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout toggle_cursor_item$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("toggle_cursor_item"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*toggle_cursor_item)(GtkIconView *)
     * }
     */
    public static final AddressLayout toggle_cursor_item$layout() {
        return toggle_cursor_item$LAYOUT;
    }

    private static final long toggle_cursor_item$OFFSET = 1016;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*toggle_cursor_item)(GtkIconView *)
     * }
     */
    public static final long toggle_cursor_item$offset() {
        return toggle_cursor_item$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*toggle_cursor_item)(GtkIconView *)
     * }
     */
    public static MemorySegment toggle_cursor_item(MemorySegment struct) {
        return struct.get(toggle_cursor_item$LAYOUT, toggle_cursor_item$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*toggle_cursor_item)(GtkIconView *)
     * }
     */
    public static void toggle_cursor_item(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(toggle_cursor_item$LAYOUT, toggle_cursor_item$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * gboolean (*move_cursor)(GtkIconView *, GtkMovementStep, gint)
     * }
     */
    public class move_cursor {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, int _x1, int _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            app_indicator_h.C_INT,
            app_indicator_h.C_POINTER,
            app_indicator_h.C_INT,
            app_indicator_h.C_INT
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(move_cursor.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(move_cursor.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, int _x1, int _x2) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout move_cursor$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("move_cursor"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gboolean (*move_cursor)(GtkIconView *, GtkMovementStep, gint)
     * }
     */
    public static final AddressLayout move_cursor$layout() {
        return move_cursor$LAYOUT;
    }

    private static final long move_cursor$OFFSET = 1024;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gboolean (*move_cursor)(GtkIconView *, GtkMovementStep, gint)
     * }
     */
    public static final long move_cursor$offset() {
        return move_cursor$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gboolean (*move_cursor)(GtkIconView *, GtkMovementStep, gint)
     * }
     */
    public static MemorySegment move_cursor(MemorySegment struct) {
        return struct.get(move_cursor$LAYOUT, move_cursor$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gboolean (*move_cursor)(GtkIconView *, GtkMovementStep, gint)
     * }
     */
    public static void move_cursor(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(move_cursor$LAYOUT, move_cursor$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * gboolean (*activate_cursor_item)(GtkIconView *)
     * }
     */
    public class activate_cursor_item {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            app_indicator_h.C_INT,
            app_indicator_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(activate_cursor_item.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(activate_cursor_item.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout activate_cursor_item$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("activate_cursor_item"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gboolean (*activate_cursor_item)(GtkIconView *)
     * }
     */
    public static final AddressLayout activate_cursor_item$layout() {
        return activate_cursor_item$LAYOUT;
    }

    private static final long activate_cursor_item$OFFSET = 1032;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gboolean (*activate_cursor_item)(GtkIconView *)
     * }
     */
    public static final long activate_cursor_item$offset() {
        return activate_cursor_item$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gboolean (*activate_cursor_item)(GtkIconView *)
     * }
     */
    public static MemorySegment activate_cursor_item(MemorySegment struct) {
        return struct.get(activate_cursor_item$LAYOUT, activate_cursor_item$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gboolean (*activate_cursor_item)(GtkIconView *)
     * }
     */
    public static void activate_cursor_item(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(activate_cursor_item$LAYOUT, activate_cursor_item$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*_gtk_reserved1)(void)
     * }
     */
    public class _gtk_reserved1 {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply();
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid();

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(_gtk_reserved1.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(_gtk_reserved1.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr) {
            try {
                 DOWN$MH.invokeExact(funcPtr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout _gtk_reserved1$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_gtk_reserved1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*_gtk_reserved1)(void)
     * }
     */
    public static final AddressLayout _gtk_reserved1$layout() {
        return _gtk_reserved1$LAYOUT;
    }

    private static final long _gtk_reserved1$OFFSET = 1040;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*_gtk_reserved1)(void)
     * }
     */
    public static final long _gtk_reserved1$offset() {
        return _gtk_reserved1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*_gtk_reserved1)(void)
     * }
     */
    public static MemorySegment _gtk_reserved1(MemorySegment struct) {
        return struct.get(_gtk_reserved1$LAYOUT, _gtk_reserved1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*_gtk_reserved1)(void)
     * }
     */
    public static void _gtk_reserved1(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_gtk_reserved1$LAYOUT, _gtk_reserved1$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*_gtk_reserved2)(void)
     * }
     */
    public class _gtk_reserved2 {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply();
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid();

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(_gtk_reserved2.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(_gtk_reserved2.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr) {
            try {
                 DOWN$MH.invokeExact(funcPtr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout _gtk_reserved2$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_gtk_reserved2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*_gtk_reserved2)(void)
     * }
     */
    public static final AddressLayout _gtk_reserved2$layout() {
        return _gtk_reserved2$LAYOUT;
    }

    private static final long _gtk_reserved2$OFFSET = 1048;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*_gtk_reserved2)(void)
     * }
     */
    public static final long _gtk_reserved2$offset() {
        return _gtk_reserved2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*_gtk_reserved2)(void)
     * }
     */
    public static MemorySegment _gtk_reserved2(MemorySegment struct) {
        return struct.get(_gtk_reserved2$LAYOUT, _gtk_reserved2$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*_gtk_reserved2)(void)
     * }
     */
    public static void _gtk_reserved2(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_gtk_reserved2$LAYOUT, _gtk_reserved2$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*_gtk_reserved3)(void)
     * }
     */
    public class _gtk_reserved3 {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply();
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid();

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(_gtk_reserved3.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(_gtk_reserved3.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr) {
            try {
                 DOWN$MH.invokeExact(funcPtr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout _gtk_reserved3$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_gtk_reserved3"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*_gtk_reserved3)(void)
     * }
     */
    public static final AddressLayout _gtk_reserved3$layout() {
        return _gtk_reserved3$LAYOUT;
    }

    private static final long _gtk_reserved3$OFFSET = 1056;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*_gtk_reserved3)(void)
     * }
     */
    public static final long _gtk_reserved3$offset() {
        return _gtk_reserved3$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*_gtk_reserved3)(void)
     * }
     */
    public static MemorySegment _gtk_reserved3(MemorySegment struct) {
        return struct.get(_gtk_reserved3$LAYOUT, _gtk_reserved3$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*_gtk_reserved3)(void)
     * }
     */
    public static void _gtk_reserved3(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_gtk_reserved3$LAYOUT, _gtk_reserved3$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*_gtk_reserved4)(void)
     * }
     */
    public class _gtk_reserved4 {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply();
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid();

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(_gtk_reserved4.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(_gtk_reserved4.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr) {
            try {
                 DOWN$MH.invokeExact(funcPtr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout _gtk_reserved4$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_gtk_reserved4"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*_gtk_reserved4)(void)
     * }
     */
    public static final AddressLayout _gtk_reserved4$layout() {
        return _gtk_reserved4$LAYOUT;
    }

    private static final long _gtk_reserved4$OFFSET = 1064;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*_gtk_reserved4)(void)
     * }
     */
    public static final long _gtk_reserved4$offset() {
        return _gtk_reserved4$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*_gtk_reserved4)(void)
     * }
     */
    public static MemorySegment _gtk_reserved4(MemorySegment struct) {
        return struct.get(_gtk_reserved4$LAYOUT, _gtk_reserved4$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*_gtk_reserved4)(void)
     * }
     */
    public static void _gtk_reserved4(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_gtk_reserved4$LAYOUT, _gtk_reserved4$OFFSET, fieldValue);
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

