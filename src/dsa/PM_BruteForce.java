/*
 * 串模式匹配：蛮力算法
 * 若返回位置i > length(T) - length(P)，则说明失配
 * 否则，i为匹配位置
 */
package dsa;
import dsa.*;
import java.io.*;

public class PM_BruteForce {
//////////////////////////////////////////////////////////////////////////
// T:	0		1		.		.		.		i		i+1	.		.		.		i+j	.		.		n-1
//		--------------------|-------------------|------------
// P:											0		1		.		.		.		j		.		.
//												|-------------------|
//////////////////////////////////////////////////////////////////////////
	public static int PM(String T, String P) {
		int		i;//模式串相对于主串的起始位置
		int		j;//模式串当前字符的地址
	
		for (i=0; i <= T.length()-P.length(); i++) {//主串从第i个字符起，与
			for (j=0; j<P.length(); j++) {//模式串的当前字符逐次比较
				if (T.charAt(i+j) != P.charAt(j))	break;//若失配，模式串右移一个字符
			}
			if (j >= P.length())	break;//找到匹配子串
		}

		return(i);
	}
}
