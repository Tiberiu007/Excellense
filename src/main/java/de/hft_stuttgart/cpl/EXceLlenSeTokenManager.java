/* EXceLlenSeTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. EXceLlenSeTokenManager.java */
package de.hft_stuttgart.cpl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.HashMap;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

/** Token Manager. */
@SuppressWarnings ("unused")
public class EXceLlenSeTokenManager implements EXceLlenSeConstants {

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x6000L) != 0L)
            return 51;
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 37:
         return jjStopAtPos(0, 15);
      case 38:
         return jjStopAtPos(0, 12);
      case 40:
         return jjStopAtPos(0, 28);
      case 41:
         return jjStopAtPos(0, 29);
      case 42:
         return jjStopAtPos(0, 17);
      case 43:
         return jjStartNfaWithStates_0(0, 13, 51);
      case 45:
         return jjStartNfaWithStates_0(0, 14, 51);
      case 47:
         return jjStopAtPos(0, 16);
      case 61:
         return jjStopAtPos(0, 4);
      case 67:
      case 99:
         return jjStopAtPos(0, 26);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa1_0(0x8e0L);
      case 82:
      case 114:
         return jjStopAtPos(0, 27);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa1_0(0x100L);
      default :
         return jjMoveNfa_0(7, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 78:
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x400L);
      case 79:
      case 111:
         if ((active0 & 0x100L) != 0L)
            return jjStopAtPos(1, 8);
         else if ((active0 & 0x200L) != 0L)
            return jjStopAtPos(1, 9);
         return jjMoveStringLiteralDfa2_0(active0, 0x60L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x80L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 68:
      case 100:
         if ((active0 & 0x400L) != 0L)
            return jjStopAtPos(2, 10);
         break;
      case 78:
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x80L);
      case 82:
      case 114:
         if ((active0 & 0x40L) != 0L)
         {
            jjmatchedKind = 6;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x20L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 67:
      case 99:
         if ((active0 & 0x800L) != 0L)
            return jjStopAtPos(3, 11);
         break;
      case 77:
      case 109:
         if ((active0 & 0x80L) != 0L)
            return jjStopAtPos(3, 7);
         return jjMoveStringLiteralDfa4_0(active0, 0x20L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x20L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 84:
      case 116:
         return jjMoveStringLiteralDfa6_0(active0, 0x20L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 84:
      case 116:
         return jjMoveStringLiteralDfa7_0(active0, 0x20L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         return jjMoveStringLiteralDfa8_0(active0, 0x20L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 68:
      case 100:
         if ((active0 & 0x20L) != 0L)
            return jjStopAtPos(8, 5);
         break;
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 51;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 51:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(44, 45); }
                  else if (curChar == 46)
                     { jjCheckNAdd(3); }
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(40, 41); }
                  if ((0x3fe000000000000L & l) != 0L)
                  {
                     if (kind > 18)
                        kind = 18;
                     { jjCheckNAdd(1); }
                  }
                  break;
               case 7:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddStates(0, 3); }
                  else if ((0x7000000000000000L & l) != 0L)
                  {
                     if (kind > 25)
                        kind = 25;
                  }
                  else if ((0x280000000000L & l) != 0L)
                     { jjCheckNAddStates(4, 7); }
                  else if (curChar == 39)
                     { jjCheckNAddStates(8, 10); }
                  else if (curChar == 46)
                     { jjCheckNAdd(3); }
                  if ((0x3fe000000000000L & l) != 0L)
                  {
                     if (kind > 18)
                        kind = 18;
                     { jjCheckNAdd(1); }
                  }
                  else if (curChar == 60)
                     { jjCheckNAddTwoStates(35, 38); }
                  else if (curChar == 62)
                     { jjCheckNAdd(35); }
                  break;
               case 0:
                  if ((0x3fe000000000000L & l) == 0L)
                     break;
                  if (kind > 18)
                     kind = 18;
                  { jjCheckNAdd(1); }
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 18)
                     kind = 18;
                  { jjCheckNAdd(1); }
                  break;
               case 2:
                  if (curChar == 46)
                     { jjCheckNAdd(3); }
                  break;
               case 3:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 20)
                     kind = 20;
                  { jjCheckNAddTwoStates(3, 4); }
                  break;
               case 5:
                  if ((0x280000000000L & l) != 0L)
                     { jjCheckNAdd(6); }
                  break;
               case 6:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 20)
                     kind = 20;
                  { jjCheckNAdd(6); }
                  break;
               case 8:
                  if (curChar == 39)
                     { jjCheckNAddStates(8, 10); }
                  break;
               case 9:
                  if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 10:
                  if ((0xffffff7fffffffffL & l) != 0L)
                     { jjCheckNAddStates(8, 10); }
                  break;
               case 11:
                  if (curChar == 39 && kind > 22)
                     kind = 22;
                  break;
               case 13:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 14:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 15:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 16:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 17;
                  break;
               case 17:
                  if (curChar == 45)
                     jjstateSet[jjnewStateCnt++] = 18;
                  break;
               case 18:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 19;
                  break;
               case 19:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 20:
                  if (curChar == 45)
                     jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 21:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 22:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 23;
                  break;
               case 23:
                  if (curChar == 32)
                     jjstateSet[jjnewStateCnt++] = 24;
                  break;
               case 24:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 25;
                  break;
               case 25:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 26;
                  break;
               case 26:
                  if (curChar == 58)
                     jjstateSet[jjnewStateCnt++] = 27;
                  break;
               case 27:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 28;
                  break;
               case 28:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 29;
                  break;
               case 29:
                  if (curChar == 58)
                     jjstateSet[jjnewStateCnt++] = 30;
                  break;
               case 30:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 31;
                  break;
               case 31:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 32;
                  break;
               case 34:
                  if ((0x7000000000000000L & l) != 0L && kind > 25)
                     kind = 25;
                  break;
               case 35:
                  if (curChar == 61 && kind > 25)
                     kind = 25;
                  break;
               case 36:
                  if (curChar == 62)
                     { jjCheckNAdd(35); }
                  break;
               case 37:
                  if (curChar == 60)
                     { jjCheckNAddTwoStates(35, 38); }
                  break;
               case 38:
                  if (curChar == 62 && kind > 25)
                     kind = 25;
                  break;
               case 39:
                  if ((0x280000000000L & l) != 0L)
                     { jjCheckNAddStates(4, 7); }
                  break;
               case 40:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(40, 41); }
                  break;
               case 42:
                  if ((0x280000000000L & l) != 0L)
                     { jjCheckNAdd(43); }
                  break;
               case 43:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 19)
                     kind = 19;
                  { jjCheckNAdd(43); }
                  break;
               case 44:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(44, 45); }
                  break;
               case 45:
                  if (curChar != 46)
                     break;
                  if (kind > 21)
                     kind = 21;
                  { jjCheckNAddTwoStates(46, 47); }
                  break;
               case 46:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 21)
                     kind = 21;
                  { jjCheckNAddTwoStates(46, 47); }
                  break;
               case 48:
                  if ((0x280000000000L & l) != 0L)
                     { jjCheckNAdd(49); }
                  break;
               case 49:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 21)
                     kind = 21;
                  { jjCheckNAdd(49); }
                  break;
               case 50:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddStates(0, 3); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 7:
                  if ((0x7e0000007e00L & l) != 0L)
                  {
                     if (kind > 24)
                        kind = 24;
                  }
                  else if (curChar == 123)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 4:
                  if ((0x2000000020L & l) != 0L)
                     { jjAddStates(11, 12); }
                  break;
               case 10:
                  { jjAddStates(8, 10); }
                  break;
               case 12:
                  if (curChar == 123)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 32:
                  if (curChar == 125 && kind > 23)
                     kind = 23;
                  break;
               case 33:
                  if ((0x7e0000007e00L & l) != 0L && kind > 24)
                     kind = 24;
                  break;
               case 41:
                  if ((0x2000000020L & l) != 0L)
                     { jjAddStates(13, 14); }
                  break;
               case 47:
                  if ((0x2000000020L & l) != 0L)
                     { jjAddStates(15, 16); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 10:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjAddStates(8, 10); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 51 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, "\75", null, null, null, null, null, null, null, "\46", 
"\53", "\55", "\45", "\57", "\52", null, null, null, null, null, null, null, null, 
null, null, "\50", "\51", };
protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}
static final int[] jjnextStates = {
   40, 41, 44, 45, 0, 40, 2, 44, 9, 10, 11, 5, 6, 42, 43, 48, 
   49, 
};

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(Exception e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002200L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
void MoreLexicalActions()
{
   jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

    /** Constructor. */
    public EXceLlenSeTokenManager(SimpleCharStream stream){

      if (SimpleCharStream.staticFlag)
            throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");

    input_stream = stream;
  }

  /** Constructor. */
  public EXceLlenSeTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  
  public void ReInit(SimpleCharStream stream)
  {


    jjmatchedPos =
    jjnewStateCnt =
    0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 51; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  public void ReInit(SimpleCharStream stream, int lexState)
  
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }


/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x3ffffff1L, 
};
static final long[] jjtoSkip = {
   0xeL, 
};
static final long[] jjtoSpecial = {
   0x0L, 
};
static final long[] jjtoMore = {
   0x0L, 
};
    protected SimpleCharStream  input_stream;

    private final int[] jjrounds = new int[51];
    private final int[] jjstateSet = new int[2 * 51];
    private final StringBuilder jjimage = new StringBuilder();
    private StringBuilder image = jjimage;
    private int jjimageLen;
    private int lengthOfMatch;
    protected int curChar;
}
