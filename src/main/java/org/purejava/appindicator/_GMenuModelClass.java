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
 * struct _GMenuModelClass {
 *     GObjectClass parent_class;
 *     gboolean (*is_mutable)(GMenuModel *);
 *     gint (*get_n_items)(GMenuModel *);
 *     void (*get_item_attributes)(GMenuModel *, gint, GHashTable **);
 *     GMenuAttributeIter *(*iterate_item_attributes)(GMenuModel *, gint);
 *     GVariant *(*get_item_attribute_value)(GMenuModel *, gint, const gchar *, const GVariantType *);
 *     void (*get_item_links)(GMenuModel *, gint, GHashTable **);
 *     GMenuLinkIter *(*iterate_item_links)(GMenuModel *, gint);
 *     GMenuModel *(*get_item_link)(GMenuModel *, gint, const gchar *);
 * }
 * }
 */
public class _GMenuModelClass {

    _GMenuModelClass() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _GObjectClass.layout().withName("parent_class"),
        app_indicator_h.C_POINTER.withName("is_mutable"),
        app_indicator_h.C_POINTER.withName("get_n_items"),
        app_indicator_h.C_POINTER.withName("get_item_attributes"),
        app_indicator_h.C_POINTER.withName("iterate_item_attributes"),
        app_indicator_h.C_POINTER.withName("get_item_attribute_value"),
        app_indicator_h.C_POINTER.withName("get_item_links"),
        app_indicator_h.C_POINTER.withName("iterate_item_links"),
        app_indicator_h.C_POINTER.withName("get_item_link")
    ).withName("_GMenuModelClass");

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
     * GObjectClass parent_class
     * }
     */
    public static final GroupLayout parent_class$layout() {
        return parent_class$LAYOUT;
    }

    private static final long parent_class$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GObjectClass parent_class
     * }
     */
    public static final long parent_class$offset() {
        return parent_class$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GObjectClass parent_class
     * }
     */
    public static MemorySegment parent_class(MemorySegment struct) {
        return struct.asSlice(parent_class$OFFSET, parent_class$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GObjectClass parent_class
     * }
     */
    public static void parent_class(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, parent_class$OFFSET, parent_class$LAYOUT.byteSize());
    }

    /**
     * {@snippet lang=c :
     * gboolean (*is_mutable)(GMenuModel *)
     * }
     */
    public class is_mutable {

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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(is_mutable.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(is_mutable.Function fi, Arena arena) {
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

    private static final AddressLayout is_mutable$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("is_mutable"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gboolean (*is_mutable)(GMenuModel *)
     * }
     */
    public static final AddressLayout is_mutable$layout() {
        return is_mutable$LAYOUT;
    }

    private static final long is_mutable$OFFSET = 136;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gboolean (*is_mutable)(GMenuModel *)
     * }
     */
    public static final long is_mutable$offset() {
        return is_mutable$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gboolean (*is_mutable)(GMenuModel *)
     * }
     */
    public static MemorySegment is_mutable(MemorySegment struct) {
        return struct.get(is_mutable$LAYOUT, is_mutable$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gboolean (*is_mutable)(GMenuModel *)
     * }
     */
    public static void is_mutable(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(is_mutable$LAYOUT, is_mutable$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * gint (*get_n_items)(GMenuModel *)
     * }
     */
    public class get_n_items {

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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(get_n_items.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(get_n_items.Function fi, Arena arena) {
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

    private static final AddressLayout get_n_items$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("get_n_items"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gint (*get_n_items)(GMenuModel *)
     * }
     */
    public static final AddressLayout get_n_items$layout() {
        return get_n_items$LAYOUT;
    }

    private static final long get_n_items$OFFSET = 144;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gint (*get_n_items)(GMenuModel *)
     * }
     */
    public static final long get_n_items$offset() {
        return get_n_items$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gint (*get_n_items)(GMenuModel *)
     * }
     */
    public static MemorySegment get_n_items(MemorySegment struct) {
        return struct.get(get_n_items$LAYOUT, get_n_items$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gint (*get_n_items)(GMenuModel *)
     * }
     */
    public static void get_n_items(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(get_n_items$LAYOUT, get_n_items$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*get_item_attributes)(GMenuModel *, gint, GHashTable **)
     * }
     */
    public class get_item_attributes {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, int _x1, MemorySegment _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            app_indicator_h.C_POINTER,
            app_indicator_h.C_INT,
            app_indicator_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(get_item_attributes.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(get_item_attributes.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, int _x1, MemorySegment _x2) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout get_item_attributes$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("get_item_attributes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*get_item_attributes)(GMenuModel *, gint, GHashTable **)
     * }
     */
    public static final AddressLayout get_item_attributes$layout() {
        return get_item_attributes$LAYOUT;
    }

    private static final long get_item_attributes$OFFSET = 152;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*get_item_attributes)(GMenuModel *, gint, GHashTable **)
     * }
     */
    public static final long get_item_attributes$offset() {
        return get_item_attributes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*get_item_attributes)(GMenuModel *, gint, GHashTable **)
     * }
     */
    public static MemorySegment get_item_attributes(MemorySegment struct) {
        return struct.get(get_item_attributes$LAYOUT, get_item_attributes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*get_item_attributes)(GMenuModel *, gint, GHashTable **)
     * }
     */
    public static void get_item_attributes(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(get_item_attributes$LAYOUT, get_item_attributes$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * GMenuAttributeIter *(*iterate_item_attributes)(GMenuModel *, gint)
     * }
     */
    public class iterate_item_attributes {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            MemorySegment apply(MemorySegment _x0, int _x1);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            app_indicator_h.C_POINTER,
            app_indicator_h.C_POINTER,
            app_indicator_h.C_INT
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(iterate_item_attributes.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(iterate_item_attributes.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static MemorySegment invoke(MemorySegment funcPtr,MemorySegment _x0, int _x1) {
            try {
                return (MemorySegment) DOWN$MH.invokeExact(funcPtr, _x0, _x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout iterate_item_attributes$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("iterate_item_attributes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GMenuAttributeIter *(*iterate_item_attributes)(GMenuModel *, gint)
     * }
     */
    public static final AddressLayout iterate_item_attributes$layout() {
        return iterate_item_attributes$LAYOUT;
    }

    private static final long iterate_item_attributes$OFFSET = 160;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GMenuAttributeIter *(*iterate_item_attributes)(GMenuModel *, gint)
     * }
     */
    public static final long iterate_item_attributes$offset() {
        return iterate_item_attributes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GMenuAttributeIter *(*iterate_item_attributes)(GMenuModel *, gint)
     * }
     */
    public static MemorySegment iterate_item_attributes(MemorySegment struct) {
        return struct.get(iterate_item_attributes$LAYOUT, iterate_item_attributes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GMenuAttributeIter *(*iterate_item_attributes)(GMenuModel *, gint)
     * }
     */
    public static void iterate_item_attributes(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(iterate_item_attributes$LAYOUT, iterate_item_attributes$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * GVariant *(*get_item_attribute_value)(GMenuModel *, gint, const gchar *, const GVariantType *)
     * }
     */
    public class get_item_attribute_value {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            MemorySegment apply(MemorySegment _x0, int _x1, MemorySegment _x2, MemorySegment _x3);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            app_indicator_h.C_POINTER,
            app_indicator_h.C_POINTER,
            app_indicator_h.C_INT,
            app_indicator_h.C_POINTER,
            app_indicator_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(get_item_attribute_value.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(get_item_attribute_value.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static MemorySegment invoke(MemorySegment funcPtr,MemorySegment _x0, int _x1, MemorySegment _x2, MemorySegment _x3) {
            try {
                return (MemorySegment) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout get_item_attribute_value$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("get_item_attribute_value"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GVariant *(*get_item_attribute_value)(GMenuModel *, gint, const gchar *, const GVariantType *)
     * }
     */
    public static final AddressLayout get_item_attribute_value$layout() {
        return get_item_attribute_value$LAYOUT;
    }

    private static final long get_item_attribute_value$OFFSET = 168;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GVariant *(*get_item_attribute_value)(GMenuModel *, gint, const gchar *, const GVariantType *)
     * }
     */
    public static final long get_item_attribute_value$offset() {
        return get_item_attribute_value$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GVariant *(*get_item_attribute_value)(GMenuModel *, gint, const gchar *, const GVariantType *)
     * }
     */
    public static MemorySegment get_item_attribute_value(MemorySegment struct) {
        return struct.get(get_item_attribute_value$LAYOUT, get_item_attribute_value$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GVariant *(*get_item_attribute_value)(GMenuModel *, gint, const gchar *, const GVariantType *)
     * }
     */
    public static void get_item_attribute_value(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(get_item_attribute_value$LAYOUT, get_item_attribute_value$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*get_item_links)(GMenuModel *, gint, GHashTable **)
     * }
     */
    public class get_item_links {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, int _x1, MemorySegment _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            app_indicator_h.C_POINTER,
            app_indicator_h.C_INT,
            app_indicator_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(get_item_links.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(get_item_links.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, int _x1, MemorySegment _x2) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout get_item_links$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("get_item_links"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*get_item_links)(GMenuModel *, gint, GHashTable **)
     * }
     */
    public static final AddressLayout get_item_links$layout() {
        return get_item_links$LAYOUT;
    }

    private static final long get_item_links$OFFSET = 176;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*get_item_links)(GMenuModel *, gint, GHashTable **)
     * }
     */
    public static final long get_item_links$offset() {
        return get_item_links$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*get_item_links)(GMenuModel *, gint, GHashTable **)
     * }
     */
    public static MemorySegment get_item_links(MemorySegment struct) {
        return struct.get(get_item_links$LAYOUT, get_item_links$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*get_item_links)(GMenuModel *, gint, GHashTable **)
     * }
     */
    public static void get_item_links(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(get_item_links$LAYOUT, get_item_links$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * GMenuLinkIter *(*iterate_item_links)(GMenuModel *, gint)
     * }
     */
    public class iterate_item_links {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            MemorySegment apply(MemorySegment _x0, int _x1);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            app_indicator_h.C_POINTER,
            app_indicator_h.C_POINTER,
            app_indicator_h.C_INT
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(iterate_item_links.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(iterate_item_links.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static MemorySegment invoke(MemorySegment funcPtr,MemorySegment _x0, int _x1) {
            try {
                return (MemorySegment) DOWN$MH.invokeExact(funcPtr, _x0, _x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout iterate_item_links$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("iterate_item_links"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GMenuLinkIter *(*iterate_item_links)(GMenuModel *, gint)
     * }
     */
    public static final AddressLayout iterate_item_links$layout() {
        return iterate_item_links$LAYOUT;
    }

    private static final long iterate_item_links$OFFSET = 184;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GMenuLinkIter *(*iterate_item_links)(GMenuModel *, gint)
     * }
     */
    public static final long iterate_item_links$offset() {
        return iterate_item_links$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GMenuLinkIter *(*iterate_item_links)(GMenuModel *, gint)
     * }
     */
    public static MemorySegment iterate_item_links(MemorySegment struct) {
        return struct.get(iterate_item_links$LAYOUT, iterate_item_links$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GMenuLinkIter *(*iterate_item_links)(GMenuModel *, gint)
     * }
     */
    public static void iterate_item_links(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(iterate_item_links$LAYOUT, iterate_item_links$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * GMenuModel *(*get_item_link)(GMenuModel *, gint, const gchar *)
     * }
     */
    public class get_item_link {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            MemorySegment apply(MemorySegment _x0, int _x1, MemorySegment _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            app_indicator_h.C_POINTER,
            app_indicator_h.C_POINTER,
            app_indicator_h.C_INT,
            app_indicator_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(get_item_link.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(get_item_link.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static MemorySegment invoke(MemorySegment funcPtr,MemorySegment _x0, int _x1, MemorySegment _x2) {
            try {
                return (MemorySegment) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout get_item_link$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("get_item_link"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GMenuModel *(*get_item_link)(GMenuModel *, gint, const gchar *)
     * }
     */
    public static final AddressLayout get_item_link$layout() {
        return get_item_link$LAYOUT;
    }

    private static final long get_item_link$OFFSET = 192;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GMenuModel *(*get_item_link)(GMenuModel *, gint, const gchar *)
     * }
     */
    public static final long get_item_link$offset() {
        return get_item_link$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GMenuModel *(*get_item_link)(GMenuModel *, gint, const gchar *)
     * }
     */
    public static MemorySegment get_item_link(MemorySegment struct) {
        return struct.get(get_item_link$LAYOUT, get_item_link$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GMenuModel *(*get_item_link)(GMenuModel *, gint, const gchar *)
     * }
     */
    public static void get_item_link(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(get_item_link$LAYOUT, get_item_link$OFFSET, fieldValue);
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

