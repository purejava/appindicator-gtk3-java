// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1243 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1243() {}
    static final FunctionDescriptor atk_table_cell_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle atk_table_cell_get_type$MH = RuntimeHelper.downcallHandle(
        "atk_table_cell_get_type",
        constants$1243.atk_table_cell_get_type$FUNC
    );
    static final FunctionDescriptor atk_table_cell_get_column_span$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_table_cell_get_column_span$MH = RuntimeHelper.downcallHandle(
        "atk_table_cell_get_column_span",
        constants$1243.atk_table_cell_get_column_span$FUNC
    );
    static final FunctionDescriptor atk_table_cell_get_column_header_cells$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_table_cell_get_column_header_cells$MH = RuntimeHelper.downcallHandle(
        "atk_table_cell_get_column_header_cells",
        constants$1243.atk_table_cell_get_column_header_cells$FUNC
    );
    static final FunctionDescriptor atk_table_cell_get_position$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_table_cell_get_position$MH = RuntimeHelper.downcallHandle(
        "atk_table_cell_get_position",
        constants$1243.atk_table_cell_get_position$FUNC
    );
    static final FunctionDescriptor atk_table_cell_get_row_span$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_table_cell_get_row_span$MH = RuntimeHelper.downcallHandle(
        "atk_table_cell_get_row_span",
        constants$1243.atk_table_cell_get_row_span$FUNC
    );
    static final FunctionDescriptor atk_table_cell_get_row_header_cells$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_table_cell_get_row_header_cells$MH = RuntimeHelper.downcallHandle(
        "atk_table_cell_get_row_header_cells",
        constants$1243.atk_table_cell_get_row_header_cells$FUNC
    );
}


