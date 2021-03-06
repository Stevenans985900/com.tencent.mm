package com.tencent.mm.ad;

import com.tencent.mm.a.c;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.d.a.cm;
import com.tencent.mm.d.a.fu;
import com.tencent.mm.model.ax;
import com.tencent.mm.model.b;
import com.tencent.mm.network.r;
import com.tencent.mm.protocal.b.ik;
import com.tencent.mm.protocal.b.il;
import com.tencent.mm.protocal.b.jy;
import com.tencent.mm.protocal.b.kb;
import com.tencent.mm.protocal.b.kc;
import com.tencent.mm.protocal.b.zr;
import com.tencent.mm.q.a.a;
import com.tencent.mm.q.a.b;
import com.tencent.mm.q.a.c;
import com.tencent.mm.q.d;
import com.tencent.mm.q.j.a;
import com.tencent.mm.q.j.b;
import com.tencent.mm.q.l;
import com.tencent.mm.s.p;
import com.tencent.mm.sdk.platformtools.bn;
import com.tencent.mm.storage.h;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public final class j
  extends com.tencent.mm.q.j
  implements r, com.tencent.mm.q.k
{
  private d apI;
  private com.tencent.mm.q.a apJ;
  private int auW;
  public int bIj;
  private int offset;
  
  public j(int paramInt1, int paramInt2)
  {
    bIj = paramInt1;
    auW = paramInt2;
    offset = 0;
    Object localObject = t.zY().J(paramInt1, paramInt2);
    if (localObject == null)
    {
      com.tencent.mm.sdk.platformtools.t.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "doScene get info null, id:" + paramInt1);
      return;
    }
    status = 3;
    aqq = 64;
    t.zY().b((m)localObject);
    if (paramInt2 == 5)
    {
      localObject = tlcachePath;
      c.deleteFile((String)localObject + "brand_i18n.apk");
      return;
    }
    localObject = t.zY();
    c.deleteFile(n.zV() + ((n)localObject).L(paramInt1, paramInt2));
  }
  
  /* Error */
  private boolean M(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 117	com/tencent/mm/sdk/platformtools/bn:iW	(Ljava/lang/String;)Z
    //   4: ifne +10 -> 14
    //   7: aload_2
    //   8: invokestatic 117	com/tencent/mm/sdk/platformtools/bn:iW	(Ljava/lang/String;)Z
    //   11: ifeq +63 -> 74
    //   14: ldc 41
    //   16: new 43	java/lang/StringBuilder
    //   19: dup
    //   20: ldc 119
    //   22: invokespecial 48	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   25: aload_1
    //   26: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   29: ldc 121
    //   31: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   34: aload_2
    //   35: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   38: invokevirtual 56	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   41: invokestatic 62	com/tencent/mm/sdk/platformtools/t:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   44: invokestatic 33	com/tencent/mm/ad/t:zY	()Lcom/tencent/mm/ad/n;
    //   47: aload_0
    //   48: getfield 23	com/tencent/mm/ad/j:bIj	I
    //   51: aload_0
    //   52: getfield 25	com/tencent/mm/ad/j:auW	I
    //   55: invokevirtual 124	com/tencent/mm/ad/n:N	(II)V
    //   58: aload_0
    //   59: getfield 126	com/tencent/mm/ad/j:apI	Lcom/tencent/mm/q/d;
    //   62: iconst_3
    //   63: iconst_0
    //   64: ldc -128
    //   66: aload_0
    //   67: invokeinterface 134 5 0
    //   72: iconst_0
    //   73: ireturn
    //   74: new 136	java/io/File
    //   77: dup
    //   78: new 43	java/lang/StringBuilder
    //   81: dup
    //   82: invokespecial 87	java/lang/StringBuilder:<init>	()V
    //   85: aload_1
    //   86: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   89: aload_2
    //   90: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   93: invokevirtual 56	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   96: invokespecial 137	java/io/File:<init>	(Ljava/lang/String;)V
    //   99: astore 6
    //   101: aload 6
    //   103: invokevirtual 141	java/io/File:exists	()Z
    //   106: ifne +63 -> 169
    //   109: ldc 41
    //   111: new 43	java/lang/StringBuilder
    //   114: dup
    //   115: ldc -113
    //   117: invokespecial 48	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   120: aload_1
    //   121: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: ldc 121
    //   126: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   129: aload_2
    //   130: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   133: invokevirtual 56	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   136: invokestatic 62	com/tencent/mm/sdk/platformtools/t:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   139: invokestatic 33	com/tencent/mm/ad/t:zY	()Lcom/tencent/mm/ad/n;
    //   142: aload_0
    //   143: getfield 23	com/tencent/mm/ad/j:bIj	I
    //   146: aload_0
    //   147: getfield 25	com/tencent/mm/ad/j:auW	I
    //   150: invokevirtual 124	com/tencent/mm/ad/n:N	(II)V
    //   153: aload_0
    //   154: getfield 126	com/tencent/mm/ad/j:apI	Lcom/tencent/mm/q/d;
    //   157: iconst_3
    //   158: iconst_0
    //   159: ldc -111
    //   161: aload_0
    //   162: invokeinterface 134 5 0
    //   167: iconst_0
    //   168: ireturn
    //   169: aconst_null
    //   170: astore_3
    //   171: new 147	java/util/HashMap
    //   174: dup
    //   175: invokespecial 148	java/util/HashMap:<init>	()V
    //   178: astore 5
    //   180: new 150	java/io/FileInputStream
    //   183: dup
    //   184: aload 6
    //   186: invokespecial 153	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   189: astore_2
    //   190: aload_2
    //   191: astore_1
    //   192: new 155	java/io/InputStreamReader
    //   195: dup
    //   196: aload_2
    //   197: ldc -99
    //   199: invokespecial 160	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   202: astore 7
    //   204: aload_2
    //   205: astore_1
    //   206: new 162	java/io/BufferedReader
    //   209: dup
    //   210: aload 7
    //   212: invokespecial 165	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   215: astore 8
    //   217: aload_2
    //   218: astore_1
    //   219: aload 8
    //   221: invokevirtual 168	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   224: astore_3
    //   225: aload_3
    //   226: ifnull +471 -> 697
    //   229: aload_2
    //   230: astore_1
    //   231: aload_3
    //   232: invokevirtual 173	java/lang/String:trim	()Ljava/lang/String;
    //   235: ldc -81
    //   237: invokevirtual 179	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   240: astore 9
    //   242: aload_2
    //   243: astore_1
    //   244: aload 9
    //   246: arraylength
    //   247: iconst_2
    //   248: if_icmplt +27 -> 275
    //   251: aload_2
    //   252: astore_1
    //   253: aload 9
    //   255: iconst_0
    //   256: aaload
    //   257: invokestatic 117	com/tencent/mm/sdk/platformtools/bn:iW	(Ljava/lang/String;)Z
    //   260: ifne +15 -> 275
    //   263: aload_2
    //   264: astore_1
    //   265: aload 9
    //   267: iconst_1
    //   268: aaload
    //   269: invokestatic 117	com/tencent/mm/sdk/platformtools/bn:iW	(Ljava/lang/String;)Z
    //   272: ifeq +156 -> 428
    //   275: aload_2
    //   276: astore_1
    //   277: ldc 41
    //   279: new 43	java/lang/StringBuilder
    //   282: dup
    //   283: ldc -75
    //   285: invokespecial 48	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   288: aload_3
    //   289: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   292: invokevirtual 56	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   295: invokestatic 62	com/tencent/mm/sdk/platformtools/t:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   298: goto -81 -> 217
    //   301: astore_3
    //   302: aload_2
    //   303: astore_1
    //   304: ldc 41
    //   306: ldc -73
    //   308: iconst_1
    //   309: anewarray 185	java/lang/Object
    //   312: dup
    //   313: iconst_0
    //   314: aload_3
    //   315: invokestatic 188	com/tencent/mm/sdk/platformtools/bn:a	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   318: aastore
    //   319: invokestatic 191	com/tencent/mm/sdk/platformtools/t:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   322: aload_2
    //   323: astore_1
    //   324: invokestatic 33	com/tencent/mm/ad/t:zY	()Lcom/tencent/mm/ad/n;
    //   327: aload_0
    //   328: getfield 23	com/tencent/mm/ad/j:bIj	I
    //   331: aload_0
    //   332: getfield 25	com/tencent/mm/ad/j:auW	I
    //   335: invokevirtual 124	com/tencent/mm/ad/n:N	(II)V
    //   338: aload_2
    //   339: astore_1
    //   340: aload_0
    //   341: getfield 126	com/tencent/mm/ad/j:apI	Lcom/tencent/mm/q/d;
    //   344: iconst_3
    //   345: iconst_0
    //   346: aload_3
    //   347: invokevirtual 194	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   350: aload_0
    //   351: invokeinterface 134 5 0
    //   356: aload_2
    //   357: ifnull +7 -> 364
    //   360: aload_2
    //   361: invokevirtual 199	java/io/InputStream:close	()V
    //   364: aload 5
    //   366: invokeinterface 205 1 0
    //   371: invokeinterface 211 1 0
    //   376: astore_1
    //   377: aload_1
    //   378: invokeinterface 216 1 0
    //   383: ifeq +43 -> 426
    //   386: aload_1
    //   387: invokeinterface 220 1 0
    //   392: checkcast 222	java/io/BufferedWriter
    //   395: astore_2
    //   396: aload_2
    //   397: ifnull -20 -> 377
    //   400: aload_2
    //   401: invokevirtual 223	java/io/BufferedWriter:close	()V
    //   404: goto -27 -> 377
    //   407: astore_1
    //   408: ldc 41
    //   410: ldc -73
    //   412: iconst_1
    //   413: anewarray 185	java/lang/Object
    //   416: dup
    //   417: iconst_0
    //   418: aload_1
    //   419: invokestatic 188	com/tencent/mm/sdk/platformtools/bn:a	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   422: aastore
    //   423: invokestatic 191	com/tencent/mm/sdk/platformtools/t:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   426: iconst_0
    //   427: ireturn
    //   428: aload_2
    //   429: astore_1
    //   430: aload 5
    //   432: aload 9
    //   434: iconst_0
    //   435: aaload
    //   436: invokeinterface 227 2 0
    //   441: checkcast 222	java/io/BufferedWriter
    //   444: astore 4
    //   446: aload 4
    //   448: astore_3
    //   449: aload 4
    //   451: ifnonnull +177 -> 628
    //   454: aload_2
    //   455: astore_1
    //   456: invokestatic 233	com/tencent/mm/storage/RegionCodeDecoder:aIc	()Lcom/tencent/mm/storage/RegionCodeDecoder;
    //   459: pop
    //   460: aload_2
    //   461: astore_1
    //   462: aload 9
    //   464: iconst_0
    //   465: aaload
    //   466: invokestatic 237	com/tencent/mm/storage/RegionCodeDecoder:zZ	(Ljava/lang/String;)Ljava/lang/String;
    //   469: astore_3
    //   470: aload_2
    //   471: astore_1
    //   472: aload_3
    //   473: invokestatic 117	com/tencent/mm/sdk/platformtools/bn:iW	(Ljava/lang/String;)Z
    //   476: ifeq +92 -> 568
    //   479: aload_2
    //   480: astore_1
    //   481: ldc 41
    //   483: ldc -17
    //   485: invokestatic 62	com/tencent/mm/sdk/platformtools/t:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   488: goto -271 -> 217
    //   491: astore_2
    //   492: aload_1
    //   493: astore_3
    //   494: aload_2
    //   495: astore_1
    //   496: aload_3
    //   497: ifnull +7 -> 504
    //   500: aload_3
    //   501: invokevirtual 199	java/io/InputStream:close	()V
    //   504: aload 5
    //   506: invokeinterface 205 1 0
    //   511: invokeinterface 211 1 0
    //   516: astore_2
    //   517: aload_2
    //   518: invokeinterface 216 1 0
    //   523: ifeq +43 -> 566
    //   526: aload_2
    //   527: invokeinterface 220 1 0
    //   532: checkcast 222	java/io/BufferedWriter
    //   535: astore_3
    //   536: aload_3
    //   537: ifnull -20 -> 517
    //   540: aload_3
    //   541: invokevirtual 223	java/io/BufferedWriter:close	()V
    //   544: goto -27 -> 517
    //   547: astore_2
    //   548: ldc 41
    //   550: ldc -73
    //   552: iconst_1
    //   553: anewarray 185	java/lang/Object
    //   556: dup
    //   557: iconst_0
    //   558: aload_2
    //   559: invokestatic 188	com/tencent/mm/sdk/platformtools/bn:a	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   562: aastore
    //   563: invokestatic 191	com/tencent/mm/sdk/platformtools/t:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   566: aload_1
    //   567: athrow
    //   568: aload_2
    //   569: astore_1
    //   570: new 136	java/io/File
    //   573: dup
    //   574: aload_3
    //   575: invokespecial 137	java/io/File:<init>	(Ljava/lang/String;)V
    //   578: astore_3
    //   579: aload_2
    //   580: astore_1
    //   581: aload_3
    //   582: invokevirtual 141	java/io/File:exists	()Z
    //   585: ifne +10 -> 595
    //   588: aload_2
    //   589: astore_1
    //   590: aload_3
    //   591: invokevirtual 242	java/io/File:createNewFile	()Z
    //   594: pop
    //   595: aload_2
    //   596: astore_1
    //   597: new 222	java/io/BufferedWriter
    //   600: dup
    //   601: new 244	java/io/FileWriter
    //   604: dup
    //   605: aload_3
    //   606: invokespecial 245	java/io/FileWriter:<init>	(Ljava/io/File;)V
    //   609: invokespecial 248	java/io/BufferedWriter:<init>	(Ljava/io/Writer;)V
    //   612: astore_3
    //   613: aload_2
    //   614: astore_1
    //   615: aload 5
    //   617: aload 9
    //   619: iconst_0
    //   620: aaload
    //   621: aload_3
    //   622: invokeinterface 252 3 0
    //   627: pop
    //   628: aload_2
    //   629: astore_1
    //   630: new 254	java/lang/StringBuffer
    //   633: dup
    //   634: invokespecial 255	java/lang/StringBuffer:<init>	()V
    //   637: astore 4
    //   639: aload_2
    //   640: astore_1
    //   641: aload 4
    //   643: aload 9
    //   645: iconst_1
    //   646: aaload
    //   647: invokevirtual 258	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   650: pop
    //   651: aload_2
    //   652: astore_1
    //   653: aload 4
    //   655: bipush 124
    //   657: invokevirtual 261	java/lang/StringBuffer:append	(C)Ljava/lang/StringBuffer;
    //   660: pop
    //   661: aload_2
    //   662: astore_1
    //   663: aload 4
    //   665: aload 9
    //   667: iconst_2
    //   668: aaload
    //   669: invokevirtual 258	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   672: pop
    //   673: aload_2
    //   674: astore_1
    //   675: aload 4
    //   677: bipush 10
    //   679: invokevirtual 261	java/lang/StringBuffer:append	(C)Ljava/lang/StringBuffer;
    //   682: pop
    //   683: aload_2
    //   684: astore_1
    //   685: aload_3
    //   686: aload 4
    //   688: invokevirtual 262	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   691: invokevirtual 265	java/io/BufferedWriter:write	(Ljava/lang/String;)V
    //   694: goto -477 -> 217
    //   697: aload_2
    //   698: astore_1
    //   699: aload 8
    //   701: invokevirtual 266	java/io/BufferedReader:close	()V
    //   704: aload_2
    //   705: astore_1
    //   706: aload 7
    //   708: invokevirtual 267	java/io/InputStreamReader:close	()V
    //   711: aload_2
    //   712: astore_1
    //   713: aload 6
    //   715: invokevirtual 270	java/io/File:delete	()Z
    //   718: pop
    //   719: aload_2
    //   720: invokevirtual 199	java/io/InputStream:close	()V
    //   723: aload 5
    //   725: invokeinterface 205 1 0
    //   730: invokeinterface 211 1 0
    //   735: astore_1
    //   736: aload_1
    //   737: invokeinterface 216 1 0
    //   742: ifeq +43 -> 785
    //   745: aload_1
    //   746: invokeinterface 220 1 0
    //   751: checkcast 222	java/io/BufferedWriter
    //   754: astore_2
    //   755: aload_2
    //   756: ifnull -20 -> 736
    //   759: aload_2
    //   760: invokevirtual 223	java/io/BufferedWriter:close	()V
    //   763: goto -27 -> 736
    //   766: astore_1
    //   767: ldc 41
    //   769: ldc -73
    //   771: iconst_1
    //   772: anewarray 185	java/lang/Object
    //   775: dup
    //   776: iconst_0
    //   777: aload_1
    //   778: invokestatic 188	com/tencent/mm/sdk/platformtools/bn:a	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   781: aastore
    //   782: invokestatic 191	com/tencent/mm/sdk/platformtools/t:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   785: iconst_1
    //   786: ireturn
    //   787: astore_1
    //   788: goto -292 -> 496
    //   791: astore_3
    //   792: aconst_null
    //   793: astore_2
    //   794: goto -492 -> 302
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	797	0	this	j
    //   0	797	1	paramString1	String
    //   0	797	2	paramString2	String
    //   170	119	3	str	String
    //   301	46	3	localException1	Exception
    //   448	238	3	localObject1	Object
    //   791	1	3	localException2	Exception
    //   444	243	4	localObject2	Object
    //   178	546	5	localHashMap	java.util.HashMap
    //   99	615	6	localFile	File
    //   202	505	7	localInputStreamReader	java.io.InputStreamReader
    //   215	485	8	localBufferedReader	java.io.BufferedReader
    //   240	426	9	arrayOfString	String[]
    // Exception table:
    //   from	to	target	type
    //   192	204	301	java/lang/Exception
    //   206	217	301	java/lang/Exception
    //   219	225	301	java/lang/Exception
    //   231	242	301	java/lang/Exception
    //   244	251	301	java/lang/Exception
    //   253	263	301	java/lang/Exception
    //   265	275	301	java/lang/Exception
    //   277	298	301	java/lang/Exception
    //   430	446	301	java/lang/Exception
    //   456	460	301	java/lang/Exception
    //   462	470	301	java/lang/Exception
    //   472	479	301	java/lang/Exception
    //   481	488	301	java/lang/Exception
    //   570	579	301	java/lang/Exception
    //   581	588	301	java/lang/Exception
    //   590	595	301	java/lang/Exception
    //   597	613	301	java/lang/Exception
    //   615	628	301	java/lang/Exception
    //   630	639	301	java/lang/Exception
    //   641	651	301	java/lang/Exception
    //   653	661	301	java/lang/Exception
    //   663	673	301	java/lang/Exception
    //   675	683	301	java/lang/Exception
    //   685	694	301	java/lang/Exception
    //   699	704	301	java/lang/Exception
    //   706	711	301	java/lang/Exception
    //   713	719	301	java/lang/Exception
    //   360	364	407	java/io/IOException
    //   364	377	407	java/io/IOException
    //   377	396	407	java/io/IOException
    //   400	404	407	java/io/IOException
    //   192	204	491	finally
    //   206	217	491	finally
    //   219	225	491	finally
    //   231	242	491	finally
    //   244	251	491	finally
    //   253	263	491	finally
    //   265	275	491	finally
    //   277	298	491	finally
    //   304	322	491	finally
    //   324	338	491	finally
    //   340	356	491	finally
    //   430	446	491	finally
    //   456	460	491	finally
    //   462	470	491	finally
    //   472	479	491	finally
    //   481	488	491	finally
    //   570	579	491	finally
    //   581	588	491	finally
    //   590	595	491	finally
    //   597	613	491	finally
    //   615	628	491	finally
    //   630	639	491	finally
    //   641	651	491	finally
    //   653	661	491	finally
    //   663	673	491	finally
    //   675	683	491	finally
    //   685	694	491	finally
    //   699	704	491	finally
    //   706	711	491	finally
    //   713	719	491	finally
    //   500	504	547	java/io/IOException
    //   504	517	547	java/io/IOException
    //   517	536	547	java/io/IOException
    //   540	544	547	java/io/IOException
    //   719	736	766	java/io/IOException
    //   736	755	766	java/io/IOException
    //   759	763	766	java/io/IOException
    //   180	190	787	finally
    //   180	190	791	java/lang/Exception
  }
  
  private static boolean hg(String paramString)
  {
    com.tencent.mm.sdk.platformtools.t.d("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "[oneliang][updateExposeScene]update expose scene,xml:%s", new Object[] { paramString });
    com.tencent.mm.sdk.platformtools.t.i("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "[oneliang][updateExposeScene]update expose scene start");
    Object localObject1 = DocumentBuilderFactory.newInstance();
    for (;;)
    {
      jy localjy;
      int i;
      NamedNodeMap localNamedNodeMap;
      ArrayList localArrayList;
      Object localObject2;
      int m;
      int j;
      Node localNode;
      try
      {
        paramString = ((DocumentBuilderFactory)localObject1).newDocumentBuilder().parse(new InputSource(new ByteArrayInputStream(paramString.getBytes("utf-8"))));
        paramString.normalize();
        localObject1 = paramString.getDocumentElement().getElementsByTagName("scene");
        if (localObject1 == null) {
          break label583;
        }
        localjy = new jy();
        int k = ((NodeList)localObject1).getLength();
        i = 0;
        if (i >= k) {
          break label563;
        }
        paramString = ((NodeList)localObject1).item(i);
        localNamedNodeMap = paramString.getAttributes();
        localArrayList = new ArrayList();
        localObject2 = paramString.getChildNodes();
        if (localObject2 == null) {
          break label406;
        }
        m = ((NodeList)localObject2).getLength();
        j = 0;
        if (j >= m) {
          break label406;
        }
        localNode = ((NodeList)localObject2).item(j);
        kb localkb = new kb();
        if ((localNode == null) || (localNode.getNodeName() == null) || ((!localNode.getNodeName().equals("reason")) && (!localNode.getNodeName().equals("link")))) {
          break label593;
        }
        paramString = localNode.getAttributes().getNamedItem("id");
        if (paramString != null) {}
        try
        {
          id = Integer.parseInt(paramString.getNodeValue());
          if (!bn.iW(localNode.getTextContent()))
          {
            paramString = localNode.getTextContent().trim();
            value = paramString;
            if (localNode.getNodeName().equals("link")) {
              htD = 1;
            }
            localArrayList.add(localkb);
          }
        }
        catch (NumberFormatException paramString)
        {
          com.tencent.mm.sdk.platformtools.t.i("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "[oneliang][updateExposeScene]reason id parse exception." + paramString.getMessage());
          continue;
        }
        paramString = "";
      }
      catch (Exception paramString)
      {
        com.tencent.mm.sdk.platformtools.t.i("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "[oneliang]update expose scene exception:%s", new Object[] { paramString.getMessage() });
        com.tencent.mm.sdk.platformtools.t.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "exception:%s", new Object[] { bn.a(paramString) });
        return false;
      }
      continue;
      label406:
      paramString = localNamedNodeMap.getNamedItem("id");
      if (paramString != null)
      {
        paramString = paramString.getNodeValue().split(",");
        m = paramString.length;
        j = 0;
        for (;;)
        {
          if (j >= m) {
            break label607;
          }
          localNode = paramString[j];
          if (!bn.iW(localNode))
          {
            localObject2 = new kc();
            try
            {
              id = Integer.parseInt(localNode);
              localNode = localNamedNodeMap.getNamedItem("value");
              if (localNode != null) {
                value = localNode.getNodeValue();
              }
              htE.addAll(localArrayList);
              bDC.add(localObject2);
            }
            catch (NumberFormatException localNumberFormatException)
            {
              for (;;)
              {
                com.tencent.mm.sdk.platformtools.t.i("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "[oneliang][updateExposeScene]scene id parse exception." + localNumberFormatException.getMessage());
              }
            }
            label563:
            ax.tl().rf().set(327760, bn.aI(localjy.toByteArray()));
            label583:
            com.tencent.mm.sdk.platformtools.t.i("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "[oneliang]update expose scene end");
            return true;
            label593:
            j += 1;
            break;
          }
          j += 1;
        }
      }
      label607:
      i += 1;
    }
  }
  
  public final int a(com.tencent.mm.network.m paramm, d paramd)
  {
    apI = paramd;
    com.tencent.mm.sdk.platformtools.t.d("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "dkregcode doScene pkgId:%d packageType:%d", new Object[] { Integer.valueOf(bIj), Integer.valueOf(auW) });
    paramd = t.zY().J(bIj, auW);
    if (paramd == null)
    {
      com.tencent.mm.sdk.platformtools.t.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "doScene get Theme failed id:" + bIj + " type:" + auW);
      return -1;
    }
    if (status != 3)
    {
      com.tencent.mm.sdk.platformtools.t.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "doScene get Theme stat failed id:" + bIj + " stat:" + status);
      return -1;
    }
    if (size <= 0)
    {
      com.tencent.mm.sdk.platformtools.t.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "doScene Theme size err id:" + bIj + " size:" + size);
      return -1;
    }
    Object localObject = new a.a();
    bsW = new ik();
    bsX = new il();
    uri = "/cgi-bin/micromsg-bin/downloadpackage";
    bsV = 160;
    bsY = 0;
    bsZ = 0;
    apJ = ((a.a)localObject).vh();
    localObject = (ik)apJ.bsT.btb;
    zr localzr = new zr();
    htI = id;
    hth = version;
    hsd = localzr;
    hlv = offset;
    hse = 65536;
    cVl = auW;
    return a(paramm, apJ, this);
  }
  
  protected final int a(com.tencent.mm.network.w paramw)
  {
    paramw = (ik)bsT.btb;
    m localm = t.zY().J(bIj, auW);
    if (localm == null)
    {
      com.tencent.mm.sdk.platformtools.t.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "securityVerificationChecked get Theme failed id:" + bIj);
      return j.b.btA;
    }
    if ((hsd.htI != bIj) || (hlv != offset) || (hlv >= size) || (hse != 65536) || (size <= 0) || (status != 3))
    {
      com.tencent.mm.sdk.platformtools.t.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "securityVerificationChecked Theme failed id:" + bIj);
      return j.b.btA;
    }
    return j.b.btz;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.w paramw, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.t.d("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "onGYNetEnd id:" + bIj + " + id:" + paramInt1 + " errtype:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 != 0) && (paramInt3 != 0))
    {
      com.tencent.mm.sdk.platformtools.t.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "onGYNetEnd, errType = " + paramInt2 + ", errCode = " + paramInt3);
      t.zY().N(bIj, auW);
      apI.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    paramw = (il)bsU.btb;
    if (cVl != auW)
    {
      com.tencent.mm.sdk.platformtools.t.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "packageType is not consistent");
      t.zY().N(bIj, auW);
      apI.a(3, -1, "", this);
      return;
    }
    byte[] arrayOfByte = com.tencent.mm.platformtools.w.a(hsf);
    if ((arrayOfByte == null) || (arrayOfByte.length == 0))
    {
      com.tencent.mm.sdk.platformtools.t.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "onGYNetEnd get pkgBuf failed id:" + bIj);
      t.zY().N(bIj, auW);
      apI.a(3, -1, paramString, this);
      return;
    }
    m localm = t.zY().J(bIj, auW);
    if (localm == null)
    {
      com.tencent.mm.sdk.platformtools.t.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "onGYNetEnd info is null, pkgId = " + bIj);
      t.zY().N(bIj, auW);
      apI.a(3, -1, paramString, this);
      return;
    }
    if (size != hsg)
    {
      com.tencent.mm.sdk.platformtools.t.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "onGYNetEnd totalSize is incorrect");
      t.zY().N(bIj, auW);
      paramw = new k(auW);
      ax.tm().d(paramw);
      apI.a(3, -1, paramString, this);
      return;
    }
    if (auW == 5) {
      paramArrayOfByte = tlcachePath;
    }
    for (paramw = "brand_i18n.apk";; paramw = t.zY().L(bIj, auW))
    {
      com.tencent.mm.sdk.platformtools.t.d("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "packagePath " + paramArrayOfByte);
      com.tencent.mm.sdk.platformtools.t.d("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "packageName " + paramw);
      paramInt1 = c.c(paramArrayOfByte, paramw, arrayOfByte);
      if (paramInt1 == 0) {
        break;
      }
      t.zY().N(bIj, auW);
      com.tencent.mm.sdk.platformtools.t.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "onGYNetEnd write file fail, ret = " + paramInt1);
      apI.a(3, -1, paramString, this);
      return;
      t.zY();
      paramArrayOfByte = n.zV();
    }
    offset += arrayOfByte.length;
    boolean bool1;
    if (offset >= size)
    {
      bool1 = false;
      if (auW == 1)
      {
        paramString = t.zY().M(bIj, auW);
        paramInt1 = bn.bu(paramArrayOfByte + paramw, paramString);
        if (paramInt1 < 0)
        {
          com.tencent.mm.sdk.platformtools.t.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "unzip fail, ret = " + paramInt1 + ", zipFilePath = " + paramArrayOfByte + paramw + ", unzipPath = " + paramString);
          t.zY().N(bIj, auW);
          apI.a(3, 0, "unzip fail", this);
          bool1 = false;
        }
      }
      else
      {
        label733:
        if (auW == 8) {
          bool1 = M(paramArrayOfByte, paramw);
        }
        if (auW == 23)
        {
          if ((!bn.iW(paramArrayOfByte)) && (!bn.iW(paramw))) {
            break label1165;
          }
          com.tencent.mm.sdk.platformtools.t.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "update permission pkg failed, packagePath: %s, packageName: %s", new Object[] { paramArrayOfByte, paramw });
          t.zY().N(bIj, auW);
          apI.a(3, 0, "open permission pkg failed", this);
          bool1 = false;
        }
        label831:
        if (auW == 7) {
          bool1 = true;
        }
        if (auW == 9) {
          bool1 = true;
        }
        if (auW == 5)
        {
          bool1 = true;
          p.wZ();
        }
        if (auW == 12)
        {
          paramString = new fu();
          aCK.aCM = (paramArrayOfByte + paramw);
          com.tencent.mm.sdk.c.a.hXQ.g(paramString);
          bool1 = true;
        }
        if (auW != 18) {
          break label1474;
        }
        paramString = t.zY().M(bIj, auW);
        paramInt1 = bn.bu(paramArrayOfByte + paramw, paramString);
        if (paramInt1 >= 0) {
          break label1360;
        }
        com.tencent.mm.sdk.platformtools.t.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "unzip fail, ret = " + paramInt1 + ", zipFilePath = " + paramArrayOfByte + paramw + ", unzipPath = " + paramString);
        t.zY().N(bIj, auW);
        apI.a(3, 0, "unzip fail", this);
        bool1 = false;
      }
    }
    label1165:
    label1360:
    label1474:
    for (;;)
    {
      boolean bool2 = bool1;
      if (auW == 19) {}
      try
      {
        bool2 = hg(new String(arrayOfByte, "utf-8"));
        if (auW == 20) {
          bool2 = true;
        }
        if (auW == 21) {
          bool2 = true;
        }
        if (!bool2) {
          break;
        }
        status = 2;
        aqq = 64;
        t.zY().b(localm);
        apI.a(0, 0, "", this);
        return;
        bool1 = true;
        break label733;
        if (!new File(paramArrayOfByte + paramw).exists())
        {
          com.tencent.mm.sdk.platformtools.t.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "update permission pkg failed, file no exist, path: %s, name: %s", new Object[] { paramArrayOfByte, paramw });
          t.zY().N(bIj, auW);
          apI.a(3, 0, "file not exist", this);
          bool1 = false;
          break label831;
        }
        paramString = f.bjE + "permissioncfg.cfg";
        if (-1L == c.j(paramArrayOfByte + paramw, paramString))
        {
          com.tencent.mm.sdk.platformtools.t.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "copy file failed");
          t.zY().N(bIj, auW);
          apI.a(3, 0, "copy file failed", this);
          bool1 = false;
          break label831;
        }
        bool1 = true;
        break label831;
        com.tencent.mm.sdk.platformtools.t.d("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", "Unzip Path %s", new Object[] { paramString });
        paramw = new cm();
        ayj.path = paramString;
        com.tencent.mm.sdk.c.a.hXQ.g(paramw);
        bool1 = true;
      }
      catch (UnsupportedEncodingException paramString)
      {
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.t.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTwJWiJx8q4eImzb/JZ7+Fdg==", paramString.getMessage());
          bool2 = bool1;
        }
      }
      if (a(btk, apI) >= 0) {
        break;
      }
      t.zY().N(bIj, auW);
      apI.a(3, -1, paramString, this);
      return;
    }
  }
  
  protected final void a(j.a parama)
  {
    t.zY().N(bIj, auW);
  }
  
  public final int getType()
  {
    return 160;
  }
  
  protected final int lP()
  {
    return 50;
  }
  
  public final int vq()
  {
    return auW;
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.ad.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */