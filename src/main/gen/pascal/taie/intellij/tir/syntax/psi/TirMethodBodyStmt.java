// This is a generated file. Not intended for manual editing.
package pascal.taie.intellij.tir.syntax.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TirMethodBodyStmt extends PsiElement {

  @Nullable
  TirBinaryExpr getBinaryExpr();

  @Nullable
  TirIdentifierType getIdentifierType();

  @Nullable
  TirIdentifierVariable getIdentifierVariable();

  @Nullable
  TirInvokeExpr getInvokeExpr();

  @Nullable
  TirLvalue getLvalue();

  @Nullable
  TirRvalue getRvalue();

  @Nullable
  TirUnaryExpr getUnaryExpr();

}
