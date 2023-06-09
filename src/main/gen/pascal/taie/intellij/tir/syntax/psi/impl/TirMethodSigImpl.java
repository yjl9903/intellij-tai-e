// This is a generated file. Not intended for manual editing.
package pascal.taie.intellij.tir.syntax.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static pascal.taie.intellij.tir.syntax.TirTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import pascal.taie.intellij.tir.syntax.psi.*;
import pascal.taie.intellij.tir.syntax.TirPsiUtil;

public class TirMethodSigImpl extends ASTWrapperPsiElement implements TirMethodSig {

  public TirMethodSigImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull TirVisitor visitor) {
    visitor.visitMethodSig(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TirVisitor) accept((TirVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public TirIdentifierMethod getIdentifierMethod() {
    return findNotNullChildByClass(TirIdentifierMethod.class);
  }

  @Override
  @NotNull
  public List<TirIdentifierType> getIdentifierTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TirIdentifierType.class);
  }

}
