/* Generated By:JJTree: Do not edit this line. OScAndOperator.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=O,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.orientechnologies.orient.core.sql.parser;

import com.orientechnologies.orient.core.sql.operator.OQueryOperator;

public
class OScAndOperator extends SimpleNode implements OBinaryCompareOperator {

  OQueryOperator lowLevelOperator = null;
  public OScAndOperator(int id) {
    super(id);
  }

  public OScAndOperator(OrientSql p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(OrientSqlVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }

  @Override
  public boolean execute(Object iLeft, Object iRight) {
    if(lowLevelOperator==null) {
      //TODO implement this!
    }
    if(lowLevelOperator==null) {
      throw new UnsupportedOperationException();
    }
    return false;
  }

  @Override
  public String toString() {
    return "&&";
  }

  @Override public boolean supportsBasicCalculation() {
    return true;
  }
}
/* JavaCC - OriginalChecksum=12592a24f576571470ce760aff503b30 (do not edit this line) */