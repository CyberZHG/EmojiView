package com.zhaohg.emojiview;

import android.support.v4.util.LongSparseArray;

public class EmojiCodeMap {


	private static LongSparseArray<Integer> all = new LongSparseArray<Integer>();
	
	private static long[] allList;
	private static long[] peopleList;
	private static long[] natureList;
	private static long[] objectsList;
	private static long[] placesList;
	private static long[] symbolsList;
	
	public static boolean exists(long code) {
		return all.get(code) != null;
	}
	
	public static int getDrawableID(long code) {
		return all.get(code);
	}
	
	public static long[] getCodeList(int type) {
		switch (type) {
		case EmojiCategory.ALL:
			return allList;
		case EmojiCategory.PEOPLE:
			return peopleList;
		case EmojiCategory.NATURE:
			return natureList;
		case EmojiCategory.OBJECTS:
			return objectsList;
		case EmojiCategory.PLACES:
			return placesList;
		case EmojiCategory.SYMBOLS:
			return symbolsList;
		}
		return new long[0];
	}
	
	static {
		all.put(0x1f604L, R.drawable.emoji_1f604);
		all.put(0x1f603L, R.drawable.emoji_1f603);
		all.put(0x1f600L, R.drawable.emoji_1f600);
		all.put(0x1f60aL, R.drawable.emoji_1f60a);
		all.put(0x263aL, R.drawable.emoji_263a);
		all.put(0x1f609L, R.drawable.emoji_1f609);
		all.put(0x1f60dL, R.drawable.emoji_1f60d);
		all.put(0x1f618L, R.drawable.emoji_1f618);
		all.put(0x1f61aL, R.drawable.emoji_1f61a);
		all.put(0x1f617L, R.drawable.emoji_1f617);
		all.put(0x1f619L, R.drawable.emoji_1f619);
		all.put(0x1f61cL, R.drawable.emoji_1f61c);
		all.put(0x1f61dL, R.drawable.emoji_1f61d);
		all.put(0x1f61bL, R.drawable.emoji_1f61b);
		all.put(0x1f633L, R.drawable.emoji_1f633);
		all.put(0x1f601L, R.drawable.emoji_1f601);
		all.put(0x1f614L, R.drawable.emoji_1f614);
		all.put(0x1f60cL, R.drawable.emoji_1f60c);
		all.put(0x1f612L, R.drawable.emoji_1f612);
		all.put(0x1f61eL, R.drawable.emoji_1f61e);
		all.put(0x1f623L, R.drawable.emoji_1f623);
		all.put(0x1f622L, R.drawable.emoji_1f622);
		all.put(0x1f602L, R.drawable.emoji_1f602);
		all.put(0x1f62dL, R.drawable.emoji_1f62d);
		all.put(0x1f62aL, R.drawable.emoji_1f62a);
		all.put(0x1f625L, R.drawable.emoji_1f625);
		all.put(0x1f630L, R.drawable.emoji_1f630);
		all.put(0x1f605L, R.drawable.emoji_1f605);
		all.put(0x1f613L, R.drawable.emoji_1f613);
		all.put(0x1f629L, R.drawable.emoji_1f629);
		all.put(0x1f62bL, R.drawable.emoji_1f62b);
		all.put(0x1f628L, R.drawable.emoji_1f628);
		all.put(0x1f631L, R.drawable.emoji_1f631);
		all.put(0x1f620L, R.drawable.emoji_1f620);
		all.put(0x1f621L, R.drawable.emoji_1f621);
		all.put(0x1f624L, R.drawable.emoji_1f624);
		all.put(0x1f616L, R.drawable.emoji_1f616);
		all.put(0x1f606L, R.drawable.emoji_1f606);
		all.put(0x1f60bL, R.drawable.emoji_1f60b);
		all.put(0x1f637L, R.drawable.emoji_1f637);
		all.put(0x1f60eL, R.drawable.emoji_1f60e);
		all.put(0x1f634L, R.drawable.emoji_1f634);
		all.put(0x1f635L, R.drawable.emoji_1f635);
		all.put(0x1f632L, R.drawable.emoji_1f632);
		all.put(0x1f61fL, R.drawable.emoji_1f61f);
		all.put(0x1f626L, R.drawable.emoji_1f626);
		all.put(0x1f627L, R.drawable.emoji_1f627);
		all.put(0x1f608L, R.drawable.emoji_1f608);
		all.put(0x1f47fL, R.drawable.emoji_1f47f);
		all.put(0x1f62eL, R.drawable.emoji_1f62e);
		all.put(0x1f62cL, R.drawable.emoji_1f62c);
		all.put(0x1f610L, R.drawable.emoji_1f610);
		all.put(0x1f615L, R.drawable.emoji_1f615);
		all.put(0x1f62fL, R.drawable.emoji_1f62f);
		all.put(0x1f636L, R.drawable.emoji_1f636);
		all.put(0x1f607L, R.drawable.emoji_1f607);
		all.put(0x1f60fL, R.drawable.emoji_1f60f);
		all.put(0x1f611L, R.drawable.emoji_1f611);
		all.put(0x1f472L, R.drawable.emoji_1f472);
		all.put(0x1f473L, R.drawable.emoji_1f473);
		all.put(0x1f46eL, R.drawable.emoji_1f46e);
		all.put(0x1f477L, R.drawable.emoji_1f477);
		all.put(0x1f482L, R.drawable.emoji_1f482);
		all.put(0x1f476L, R.drawable.emoji_1f476);
		all.put(0x1f466L, R.drawable.emoji_1f466);
		all.put(0x1f467L, R.drawable.emoji_1f467);
		all.put(0x1f468L, R.drawable.emoji_1f468);
		all.put(0x1f469L, R.drawable.emoji_1f469);
		all.put(0x1f474L, R.drawable.emoji_1f474);
		all.put(0x1f475L, R.drawable.emoji_1f475);
		all.put(0x1f471L, R.drawable.emoji_1f471);
		all.put(0x1f47cL, R.drawable.emoji_1f47c);
		all.put(0x1f478L, R.drawable.emoji_1f478);
		all.put(0x1f63aL, R.drawable.emoji_1f63a);
		all.put(0x1f638L, R.drawable.emoji_1f638);
		all.put(0x1f63bL, R.drawable.emoji_1f63b);
		all.put(0x1f63dL, R.drawable.emoji_1f63d);
		all.put(0x1f63cL, R.drawable.emoji_1f63c);
		all.put(0x1f640L, R.drawable.emoji_1f640);
		all.put(0x1f63fL, R.drawable.emoji_1f63f);
		all.put(0x1f639L, R.drawable.emoji_1f639);
		all.put(0x1f63eL, R.drawable.emoji_1f63e);
		all.put(0x1f479L, R.drawable.emoji_1f479);
		all.put(0x1f47aL, R.drawable.emoji_1f47a);
		all.put(0x1f648L, R.drawable.emoji_1f648);
		all.put(0x1f649L, R.drawable.emoji_1f649);
		all.put(0x1f64aL, R.drawable.emoji_1f64a);
		all.put(0x1f480L, R.drawable.emoji_1f480);
		all.put(0x1f47dL, R.drawable.emoji_1f47d);
		all.put(0x1f4a9L, R.drawable.emoji_1f4a9);
		all.put(0x1f525L, R.drawable.emoji_1f525);
		all.put(0x2728L, R.drawable.emoji_2728);
		all.put(0x1f31fL, R.drawable.emoji_1f31f);
		all.put(0x1f4abL, R.drawable.emoji_1f4ab);
		all.put(0x1f4a5L, R.drawable.emoji_1f4a5);
		all.put(0x1f4a2L, R.drawable.emoji_1f4a2);
		all.put(0x1f4a6L, R.drawable.emoji_1f4a6);
		all.put(0x1f4a7L, R.drawable.emoji_1f4a7);
		all.put(0x1f4a4L, R.drawable.emoji_1f4a4);
		all.put(0x1f4a8L, R.drawable.emoji_1f4a8);
		all.put(0x1f442L, R.drawable.emoji_1f442);
		all.put(0x1f440L, R.drawable.emoji_1f440);
		all.put(0x1f443L, R.drawable.emoji_1f443);
		all.put(0x1f445L, R.drawable.emoji_1f445);
		all.put(0x1f444L, R.drawable.emoji_1f444);
		all.put(0x1f44dL, R.drawable.emoji_1f44d);
		all.put(0x1f44eL, R.drawable.emoji_1f44e);
		all.put(0x1f44cL, R.drawable.emoji_1f44c);
		all.put(0x1f44aL, R.drawable.emoji_1f44a);
		all.put(0x270aL, R.drawable.emoji_270a);
		all.put(0x270cL, R.drawable.emoji_270c);
		all.put(0x1f44bL, R.drawable.emoji_1f44b);
		all.put(0x270bL, R.drawable.emoji_270b);
		all.put(0x1f450L, R.drawable.emoji_1f450);
		all.put(0x1f446L, R.drawable.emoji_1f446);
		all.put(0x1f447L, R.drawable.emoji_1f447);
		all.put(0x1f449L, R.drawable.emoji_1f449);
		all.put(0x1f448L, R.drawable.emoji_1f448);
		all.put(0x1f64cL, R.drawable.emoji_1f64c);
		all.put(0x1f64fL, R.drawable.emoji_1f64f);
		all.put(0x261dL, R.drawable.emoji_261d);
		all.put(0x1f44fL, R.drawable.emoji_1f44f);
		all.put(0x1f4aaL, R.drawable.emoji_1f4aa);
		all.put(0x1f6b6L, R.drawable.emoji_1f6b6);
		all.put(0x1f3c3L, R.drawable.emoji_1f3c3);
		all.put(0x1f483L, R.drawable.emoji_1f483);
		all.put(0x1f46bL, R.drawable.emoji_1f46b);
		all.put(0x1f46aL, R.drawable.emoji_1f46a);
		all.put(0x1f46cL, R.drawable.emoji_1f46c);
		all.put(0x1f46dL, R.drawable.emoji_1f46d);
		all.put(0x1f48fL, R.drawable.emoji_1f48f);
		all.put(0x1f491L, R.drawable.emoji_1f491);
		all.put(0x1f46fL, R.drawable.emoji_1f46f);
		all.put(0x1f646L, R.drawable.emoji_1f646);
		all.put(0x1f645L, R.drawable.emoji_1f645);
		all.put(0x1f481L, R.drawable.emoji_1f481);
		all.put(0x1f64bL, R.drawable.emoji_1f64b);
		all.put(0x1f486L, R.drawable.emoji_1f486);
		all.put(0x1f487L, R.drawable.emoji_1f487);
		all.put(0x1f485L, R.drawable.emoji_1f485);
		all.put(0x1f470L, R.drawable.emoji_1f470);
		all.put(0x1f64eL, R.drawable.emoji_1f64e);
		all.put(0x1f64dL, R.drawable.emoji_1f64d);
		all.put(0x1f647L, R.drawable.emoji_1f647);
		all.put(0x1f3a9L, R.drawable.emoji_1f3a9);
		all.put(0x1f451L, R.drawable.emoji_1f451);
		all.put(0x1f452L, R.drawable.emoji_1f452);
		all.put(0x1f45fL, R.drawable.emoji_1f45f);
		all.put(0x1f45eL, R.drawable.emoji_1f45e);
		all.put(0x1f461L, R.drawable.emoji_1f461);
		all.put(0x1f460L, R.drawable.emoji_1f460);
		all.put(0x1f462L, R.drawable.emoji_1f462);
		all.put(0x1f455L, R.drawable.emoji_1f455);
		all.put(0x1f454L, R.drawable.emoji_1f454);
		all.put(0x1f45aL, R.drawable.emoji_1f45a);
		all.put(0x1f457L, R.drawable.emoji_1f457);
		all.put(0x1f3bdL, R.drawable.emoji_1f3bd);
		all.put(0x1f456L, R.drawable.emoji_1f456);
		all.put(0x1f458L, R.drawable.emoji_1f458);
		all.put(0x1f459L, R.drawable.emoji_1f459);
		all.put(0x1f4bcL, R.drawable.emoji_1f4bc);
		all.put(0x1f45cL, R.drawable.emoji_1f45c);
		all.put(0x1f45dL, R.drawable.emoji_1f45d);
		all.put(0x1f45bL, R.drawable.emoji_1f45b);
		all.put(0x1f453L, R.drawable.emoji_1f453);
		all.put(0x1f380L, R.drawable.emoji_1f380);
		all.put(0x1f302L, R.drawable.emoji_1f302);
		all.put(0x1f484L, R.drawable.emoji_1f484);
		all.put(0x1f49bL, R.drawable.emoji_1f49b);
		all.put(0x1f499L, R.drawable.emoji_1f499);
		all.put(0x1f49cL, R.drawable.emoji_1f49c);
		all.put(0x1f49aL, R.drawable.emoji_1f49a);
		all.put(0x2764L, R.drawable.emoji_2764);
		all.put(0x1f494L, R.drawable.emoji_1f494);
		all.put(0x1f497L, R.drawable.emoji_1f497);
		all.put(0x1f493L, R.drawable.emoji_1f493);
		all.put(0x1f495L, R.drawable.emoji_1f495);
		all.put(0x1f496L, R.drawable.emoji_1f496);
		all.put(0x1f49eL, R.drawable.emoji_1f49e);
		all.put(0x1f498L, R.drawable.emoji_1f498);
		all.put(0x1f48cL, R.drawable.emoji_1f48c);
		all.put(0x1f48bL, R.drawable.emoji_1f48b);
		all.put(0x1f48dL, R.drawable.emoji_1f48d);
		all.put(0x1f48eL, R.drawable.emoji_1f48e);
		all.put(0x1f464L, R.drawable.emoji_1f464);
		all.put(0x1f465L, R.drawable.emoji_1f465);
		all.put(0x1f4acL, R.drawable.emoji_1f4ac);
		all.put(0x1f463L, R.drawable.emoji_1f463);
		all.put(0x1f4adL, R.drawable.emoji_1f4ad);

		all.put(0x1f3e0L, R.drawable.emoji_1f3e0);
		all.put(0x1f3e1L, R.drawable.emoji_1f3e1);
		all.put(0x1f3ebL, R.drawable.emoji_1f3eb);
		all.put(0x1f3e2L, R.drawable.emoji_1f3e2);
		all.put(0x1f3e3L, R.drawable.emoji_1f3e3);
		all.put(0x1f3e5L, R.drawable.emoji_1f3e5);
		all.put(0x1f3e6L, R.drawable.emoji_1f3e6);
		all.put(0x1f3eaL, R.drawable.emoji_1f3ea);
		all.put(0x1f3e9L, R.drawable.emoji_1f3e9);
		all.put(0x1f3e8L, R.drawable.emoji_1f3e8);
		all.put(0x1f492L, R.drawable.emoji_1f492);
		all.put(0x26eaL, R.drawable.emoji_26ea);
		all.put(0x1f3ecL, R.drawable.emoji_1f3ec);
		all.put(0x1f3e4L, R.drawable.emoji_1f3e4);
		all.put(0x1f307L, R.drawable.emoji_1f307);
		all.put(0x1f306L, R.drawable.emoji_1f306);
		all.put(0x1f3efL, R.drawable.emoji_1f3ef);
		all.put(0x1f3f0L, R.drawable.emoji_1f3f0);
		all.put(0x26faL, R.drawable.emoji_26fa);
		all.put(0x1f3edL, R.drawable.emoji_1f3ed);
		all.put(0x1f5fcL, R.drawable.emoji_1f5fc);
		all.put(0x1f5feL, R.drawable.emoji_1f5fe);
		all.put(0x1f5fbL, R.drawable.emoji_1f5fb);
		all.put(0x1f304L, R.drawable.emoji_1f304);
		all.put(0x1f305L, R.drawable.emoji_1f305);
		all.put(0x1f303L, R.drawable.emoji_1f303);
		all.put(0x1f5fdL, R.drawable.emoji_1f5fd);
		all.put(0x1f309L, R.drawable.emoji_1f309);
		all.put(0x1f3a0L, R.drawable.emoji_1f3a0);
		all.put(0x1f3a1L, R.drawable.emoji_1f3a1);
		all.put(0x26f2L, R.drawable.emoji_26f2);
		all.put(0x1f3a2L, R.drawable.emoji_1f3a2);
		all.put(0x1f6a2L, R.drawable.emoji_1f6a2);
		all.put(0x26f5L, R.drawable.emoji_26f5);
		all.put(0x1f6a4L, R.drawable.emoji_1f6a4);
		all.put(0x1f6a3L, R.drawable.emoji_1f6a3);
		all.put(0x2693L, R.drawable.emoji_2693);
		all.put(0x1f680L, R.drawable.emoji_1f680);
		all.put(0x2708L, R.drawable.emoji_2708);
		all.put(0x1f4baL, R.drawable.emoji_1f4ba);
		all.put(0x1f681L, R.drawable.emoji_1f681);
		all.put(0x1f682L, R.drawable.emoji_1f682);
		all.put(0x1f68aL, R.drawable.emoji_1f68a);
		all.put(0x1f689L, R.drawable.emoji_1f689);
		all.put(0x1f69eL, R.drawable.emoji_1f69e);
		all.put(0x1f686L, R.drawable.emoji_1f686);
		all.put(0x1f684L, R.drawable.emoji_1f684);
		all.put(0x1f685L, R.drawable.emoji_1f685);
		all.put(0x1f688L, R.drawable.emoji_1f688);
		all.put(0x1f687L, R.drawable.emoji_1f687);
		all.put(0x1f69dL, R.drawable.emoji_1f69d);
		all.put(0x1f68bL, R.drawable.emoji_1f68b);
		all.put(0x1f683L, R.drawable.emoji_1f683);
		all.put(0x1f68eL, R.drawable.emoji_1f68e);
		all.put(0x1f68cL, R.drawable.emoji_1f68c);
		all.put(0x1f68dL, R.drawable.emoji_1f68d);
		all.put(0x1f699L, R.drawable.emoji_1f699);
		all.put(0x1f698L, R.drawable.emoji_1f698);
		all.put(0x1f697L, R.drawable.emoji_1f697);
		all.put(0x1f695L, R.drawable.emoji_1f695);
		all.put(0x1f696L, R.drawable.emoji_1f696);
		all.put(0x1f69bL, R.drawable.emoji_1f69b);
		all.put(0x1f69aL, R.drawable.emoji_1f69a);
		all.put(0x1f6a8L, R.drawable.emoji_1f6a8);
		all.put(0x1f693L, R.drawable.emoji_1f693);
		all.put(0x1f694L, R.drawable.emoji_1f694);
		all.put(0x1f692L, R.drawable.emoji_1f692);
		all.put(0x1f691L, R.drawable.emoji_1f691);
		all.put(0x1f690L, R.drawable.emoji_1f690);
		all.put(0x1f6b2L, R.drawable.emoji_1f6b2);
		all.put(0x1f6a1L, R.drawable.emoji_1f6a1);
		all.put(0x1f69fL, R.drawable.emoji_1f69f);
		all.put(0x1f6a0L, R.drawable.emoji_1f6a0);
		all.put(0x1f69cL, R.drawable.emoji_1f69c);
		all.put(0x1f488L, R.drawable.emoji_1f488);
		all.put(0x1f68fL, R.drawable.emoji_1f68f);
		all.put(0x1f3abL, R.drawable.emoji_1f3ab);
		all.put(0x1f6a6L, R.drawable.emoji_1f6a6);
		all.put(0x1f6a5L, R.drawable.emoji_1f6a5);
		all.put(0x26a0L, R.drawable.emoji_26a0);
		all.put(0x1f6a7L, R.drawable.emoji_1f6a7);
		all.put(0x1f530L, R.drawable.emoji_1f530);
		all.put(0x26fdL, R.drawable.emoji_26fd);
		all.put(0x1f3eeL, R.drawable.emoji_1f3ee);
		all.put(0x1f3b0L, R.drawable.emoji_1f3b0);
		all.put(0x2668L, R.drawable.emoji_2668);
		all.put(0x1f5ffL, R.drawable.emoji_1f5ff);
		all.put(0x1f3aaL, R.drawable.emoji_1f3aa);
		all.put(0x1f3adL, R.drawable.emoji_1f3ad);
		all.put(0x1f4cdL, R.drawable.emoji_1f4cd);
		all.put(0x1f6a9L, R.drawable.emoji_1f6a9);
		all.put((0x1f1efL << 32) | 0x1f1f5L, R.drawable.emoji_1f1ef_1f1f5);
		all.put((0x1f1f0L << 32) | 0x1f1f7L, R.drawable.emoji_1f1f0_1f1f7);
		all.put((0x1f1e9L << 32) | 0x1f1eaL, R.drawable.emoji_1f1e9_1f1ea);
		all.put((0x1f1e8L << 32) | 0x1f1f3L, R.drawable.emoji_1f1e8_1f1f3);
		all.put((0x1f1faL << 32) | 0x1f1f8L, R.drawable.emoji_1f1fa_1f1f8);
		all.put((0x1f1ebL << 32) | 0x1f1f7L, R.drawable.emoji_1f1eb_1f1f7);
		all.put((0x1f1eaL << 32) | 0x1f1f8L, R.drawable.emoji_1f1ea_1f1f8);
		all.put((0x1f1eeL << 32) | 0x1f1f9L, R.drawable.emoji_1f1ee_1f1f9);
		all.put((0x1f1f7L << 32) | 0x1f1faL, R.drawable.emoji_1f1f7_1f1fa);
		all.put((0x1f1ecL << 32) | 0x1f1e7L, R.drawable.emoji_1f1ec_1f1e7);

		all.put(0x1f436L, R.drawable.emoji_1f436);
		all.put(0x1f43aL, R.drawable.emoji_1f43a);
		all.put(0x1f431L, R.drawable.emoji_1f431);
		all.put(0x1f42dL, R.drawable.emoji_1f42d);
		all.put(0x1f439L, R.drawable.emoji_1f439);
		all.put(0x1f430L, R.drawable.emoji_1f430);
		all.put(0x1f438L, R.drawable.emoji_1f438);
		all.put(0x1f42fL, R.drawable.emoji_1f42f);
		all.put(0x1f428L, R.drawable.emoji_1f428);
		all.put(0x1f43bL, R.drawable.emoji_1f43b);
		all.put(0x1f437L, R.drawable.emoji_1f437);
		all.put(0x1f43dL, R.drawable.emoji_1f43d);
		all.put(0x1f42eL, R.drawable.emoji_1f42e);
		all.put(0x1f417L, R.drawable.emoji_1f417);
		all.put(0x1f435L, R.drawable.emoji_1f435);
		all.put(0x1f412L, R.drawable.emoji_1f412);
		all.put(0x1f434L, R.drawable.emoji_1f434);
		all.put(0x1f411L, R.drawable.emoji_1f411);
		all.put(0x1f418L, R.drawable.emoji_1f418);
		all.put(0x1f43cL, R.drawable.emoji_1f43c);
		all.put(0x1f427L, R.drawable.emoji_1f427);
		all.put(0x1f426L, R.drawable.emoji_1f426);
		all.put(0x1f424L, R.drawable.emoji_1f424);
		all.put(0x1f425L, R.drawable.emoji_1f425);
		all.put(0x1f423L, R.drawable.emoji_1f423);
		all.put(0x1f414L, R.drawable.emoji_1f414);
		all.put(0x1f40dL, R.drawable.emoji_1f40d);
		all.put(0x1f422L, R.drawable.emoji_1f422);
		all.put(0x1f41bL, R.drawable.emoji_1f41b);
		all.put(0x1f41dL, R.drawable.emoji_1f41d);
		all.put(0x1f41cL, R.drawable.emoji_1f41c);
		all.put(0x1f41eL, R.drawable.emoji_1f41e);
		all.put(0x1f40cL, R.drawable.emoji_1f40c);
		all.put(0x1f419L, R.drawable.emoji_1f419);
		all.put(0x1f41aL, R.drawable.emoji_1f41a);
		all.put(0x1f420L, R.drawable.emoji_1f420);
		all.put(0x1f41fL, R.drawable.emoji_1f41f);
		all.put(0x1f42cL, R.drawable.emoji_1f42c);
		all.put(0x1f433L, R.drawable.emoji_1f433);
		all.put(0x1f40bL, R.drawable.emoji_1f40b);
		all.put(0x1f404L, R.drawable.emoji_1f404);
		all.put(0x1f40fL, R.drawable.emoji_1f40f);
		all.put(0x1f400L, R.drawable.emoji_1f400);
		all.put(0x1f403L, R.drawable.emoji_1f403);
		all.put(0x1f405L, R.drawable.emoji_1f405);
		all.put(0x1f407L, R.drawable.emoji_1f407);
		all.put(0x1f409L, R.drawable.emoji_1f409);
		all.put(0x1f40eL, R.drawable.emoji_1f40e);
		all.put(0x1f410L, R.drawable.emoji_1f410);
		all.put(0x1f413L, R.drawable.emoji_1f413);
		all.put(0x1f415L, R.drawable.emoji_1f415);
		all.put(0x1f416L, R.drawable.emoji_1f416);
		all.put(0x1f401L, R.drawable.emoji_1f401);
		all.put(0x1f402L, R.drawable.emoji_1f402);
		all.put(0x1f432L, R.drawable.emoji_1f432);
		all.put(0x1f421L, R.drawable.emoji_1f421);
		all.put(0x1f40aL, R.drawable.emoji_1f40a);
		all.put(0x1f42bL, R.drawable.emoji_1f42b);
		all.put(0x1f42aL, R.drawable.emoji_1f42a);
		all.put(0x1f406L, R.drawable.emoji_1f406);
		all.put(0x1f408L, R.drawable.emoji_1f408);
		all.put(0x1f429L, R.drawable.emoji_1f429);
		all.put(0x1f43eL, R.drawable.emoji_1f43e);
		all.put(0x1f490L, R.drawable.emoji_1f490);
		all.put(0x1f338L, R.drawable.emoji_1f338);
		all.put(0x1f337L, R.drawable.emoji_1f337);
		all.put(0x1f340L, R.drawable.emoji_1f340);
		all.put(0x1f339L, R.drawable.emoji_1f339);
		all.put(0x1f33bL, R.drawable.emoji_1f33b);
		all.put(0x1f33aL, R.drawable.emoji_1f33a);
		all.put(0x1f341L, R.drawable.emoji_1f341);
		all.put(0x1f343L, R.drawable.emoji_1f343);
		all.put(0x1f342L, R.drawable.emoji_1f342);
		all.put(0x1f33fL, R.drawable.emoji_1f33f);
		all.put(0x1f33eL, R.drawable.emoji_1f33e);
		all.put(0x1f344L, R.drawable.emoji_1f344);
		all.put(0x1f335L, R.drawable.emoji_1f335);
		all.put(0x1f334L, R.drawable.emoji_1f334);
		all.put(0x1f332L, R.drawable.emoji_1f332);
		all.put(0x1f333L, R.drawable.emoji_1f333);
		all.put(0x1f330L, R.drawable.emoji_1f330);
		all.put(0x1f331L, R.drawable.emoji_1f331);
		all.put(0x1f33cL, R.drawable.emoji_1f33c);
		all.put(0x1f310L, R.drawable.emoji_1f310);
		all.put(0x1f31eL, R.drawable.emoji_1f31e);
		all.put(0x1f31dL, R.drawable.emoji_1f31d);
		all.put(0x1f31aL, R.drawable.emoji_1f31a);
		all.put(0x1f311L, R.drawable.emoji_1f311);
		all.put(0x1f312L, R.drawable.emoji_1f312);
		all.put(0x1f313L, R.drawable.emoji_1f313);
		all.put(0x1f314L, R.drawable.emoji_1f314);
		all.put(0x1f315L, R.drawable.emoji_1f315);
		all.put(0x1f316L, R.drawable.emoji_1f316);
		all.put(0x1f317L, R.drawable.emoji_1f317);
		all.put(0x1f318L, R.drawable.emoji_1f318);
		all.put(0x1f31cL, R.drawable.emoji_1f31c);
		all.put(0x1f31bL, R.drawable.emoji_1f31b);
		all.put(0x1f319L, R.drawable.emoji_1f319);
		all.put(0x1f30dL, R.drawable.emoji_1f30d);
		all.put(0x1f30eL, R.drawable.emoji_1f30e);
		all.put(0x1f30fL, R.drawable.emoji_1f30f);
		all.put(0x1f30bL, R.drawable.emoji_1f30b);
		all.put(0x1f30cL, R.drawable.emoji_1f30c);
		all.put(0x1f320L, R.drawable.emoji_1f320);
		all.put(0x2b50L, R.drawable.emoji_2b50);
		all.put(0x2600L, R.drawable.emoji_2600);
		all.put(0x26c5L, R.drawable.emoji_26c5);
		all.put(0x2601L, R.drawable.emoji_2601);
		all.put(0x26a1L, R.drawable.emoji_26a1);
		all.put(0x2614L, R.drawable.emoji_2614);
		all.put(0x2744L, R.drawable.emoji_2744);
		all.put(0x26c4L, R.drawable.emoji_26c4);
		all.put(0x1f300L, R.drawable.emoji_1f300);
		all.put(0x1f301L, R.drawable.emoji_1f301);
		all.put(0x1f308L, R.drawable.emoji_1f308);
		all.put(0x1f30aL, R.drawable.emoji_1f30a);

		all.put(0x1f38dL, R.drawable.emoji_1f38d);
		all.put(0x1f49dL, R.drawable.emoji_1f49d);
		all.put(0x1f38eL, R.drawable.emoji_1f38e);
		all.put(0x1f392L, R.drawable.emoji_1f392);
		all.put(0x1f393L, R.drawable.emoji_1f393);
		all.put(0x1f38fL, R.drawable.emoji_1f38f);
		all.put(0x1f386L, R.drawable.emoji_1f386);
		all.put(0x1f387L, R.drawable.emoji_1f387);
		all.put(0x1f390L, R.drawable.emoji_1f390);
		all.put(0x1f391L, R.drawable.emoji_1f391);
		all.put(0x1f383L, R.drawable.emoji_1f383);
		all.put(0x1f47bL, R.drawable.emoji_1f47b);
		all.put(0x1f385L, R.drawable.emoji_1f385);
		all.put(0x1f384L, R.drawable.emoji_1f384);
		all.put(0x1f381L, R.drawable.emoji_1f381);
		all.put(0x1f38bL, R.drawable.emoji_1f38b);
		all.put(0x1f389L, R.drawable.emoji_1f389);
		all.put(0x1f38aL, R.drawable.emoji_1f38a);
		all.put(0x1f388L, R.drawable.emoji_1f388);
		all.put(0x1f38cL, R.drawable.emoji_1f38c);
		all.put(0x1f52eL, R.drawable.emoji_1f52e);
		all.put(0x1f3a5L, R.drawable.emoji_1f3a5);
		all.put(0x1f4f7L, R.drawable.emoji_1f4f7);
		all.put(0x1f4f9L, R.drawable.emoji_1f4f9);
		all.put(0x1f4fcL, R.drawable.emoji_1f4fc);
		all.put(0x1f4bfL, R.drawable.emoji_1f4bf);
		all.put(0x1f4c0L, R.drawable.emoji_1f4c0);
		all.put(0x1f4bdL, R.drawable.emoji_1f4bd);
		all.put(0x1f4beL, R.drawable.emoji_1f4be);
		all.put(0x1f4bbL, R.drawable.emoji_1f4bb);
		all.put(0x1f4f1L, R.drawable.emoji_1f4f1);
		all.put(0x260eL, R.drawable.emoji_260e);
		all.put(0x1f4deL, R.drawable.emoji_1f4de);
		all.put(0x1f4dfL, R.drawable.emoji_1f4df);
		all.put(0x1f4e0L, R.drawable.emoji_1f4e0);
		all.put(0x1f4e1L, R.drawable.emoji_1f4e1);
		all.put(0x1f4faL, R.drawable.emoji_1f4fa);
		all.put(0x1f4fbL, R.drawable.emoji_1f4fb);
		all.put(0x1f50aL, R.drawable.emoji_1f50a);
		all.put(0x1f509L, R.drawable.emoji_1f509);
		all.put(0x1f508L, R.drawable.emoji_1f508);
		all.put(0x1f507L, R.drawable.emoji_1f507);
		all.put(0x1f514L, R.drawable.emoji_1f514);
		all.put(0x1f515L, R.drawable.emoji_1f515);
		all.put(0x1f4e2L, R.drawable.emoji_1f4e2);
		all.put(0x1f4e3L, R.drawable.emoji_1f4e3);
		all.put(0x23f3L, R.drawable.emoji_23f3);
		all.put(0x231bL, R.drawable.emoji_231b);
		all.put(0x23f0L, R.drawable.emoji_23f0);
		all.put(0x231aL, R.drawable.emoji_231a);
		all.put(0x1f513L, R.drawable.emoji_1f513);
		all.put(0x1f512L, R.drawable.emoji_1f512);
		all.put(0x1f50fL, R.drawable.emoji_1f50f);
		all.put(0x1f510L, R.drawable.emoji_1f510);
		all.put(0x1f511L, R.drawable.emoji_1f511);
		all.put(0x1f50eL, R.drawable.emoji_1f50e);
		all.put(0x1f4a1L, R.drawable.emoji_1f4a1);
		all.put(0x1f526L, R.drawable.emoji_1f526);
		all.put(0x1f506L, R.drawable.emoji_1f506);
		all.put(0x1f505L, R.drawable.emoji_1f505);
		all.put(0x1f50cL, R.drawable.emoji_1f50c);
		all.put(0x1f50bL, R.drawable.emoji_1f50b);
		all.put(0x1f50dL, R.drawable.emoji_1f50d);
		all.put(0x1f6c1L, R.drawable.emoji_1f6c1);
		all.put(0x1f6c0L, R.drawable.emoji_1f6c0);
		all.put(0x1f6bfL, R.drawable.emoji_1f6bf);
		all.put(0x1f6bdL, R.drawable.emoji_1f6bd);
		all.put(0x1f527L, R.drawable.emoji_1f527);
		all.put(0x1f529L, R.drawable.emoji_1f529);
		all.put(0x1f528L, R.drawable.emoji_1f528);
		all.put(0x1f6aaL, R.drawable.emoji_1f6aa);
		all.put(0x1f6acL, R.drawable.emoji_1f6ac);
		all.put(0x1f4a3L, R.drawable.emoji_1f4a3);
		all.put(0x1f52bL, R.drawable.emoji_1f52b);
		all.put(0x1f52aL, R.drawable.emoji_1f52a);
		all.put(0x1f48aL, R.drawable.emoji_1f48a);
		all.put(0x1f489L, R.drawable.emoji_1f489);
		all.put(0x1f4b0L, R.drawable.emoji_1f4b0);
		all.put(0x1f4b4L, R.drawable.emoji_1f4b4);
		all.put(0x1f4b5L, R.drawable.emoji_1f4b5);
		all.put(0x1f4b7L, R.drawable.emoji_1f4b7);
		all.put(0x1f4b6L, R.drawable.emoji_1f4b6);
		all.put(0x1f4b3L, R.drawable.emoji_1f4b3);
		all.put(0x1f4b8L, R.drawable.emoji_1f4b8);
		all.put(0x1f4f2L, R.drawable.emoji_1f4f2);
		all.put(0x1f4e7L, R.drawable.emoji_1f4e7);
		all.put(0x1f4e5L, R.drawable.emoji_1f4e5);
		all.put(0x1f4e4L, R.drawable.emoji_1f4e4);
		all.put(0x2709L, R.drawable.emoji_2709);
		all.put(0x1f4e9L, R.drawable.emoji_1f4e9);
		all.put(0x1f4e8L, R.drawable.emoji_1f4e8);
		all.put(0x1f4efL, R.drawable.emoji_1f4ef);
		all.put(0x1f4ebL, R.drawable.emoji_1f4eb);
		all.put(0x1f4eaL, R.drawable.emoji_1f4ea);
		all.put(0x1f4ecL, R.drawable.emoji_1f4ec);
		all.put(0x1f4edL, R.drawable.emoji_1f4ed);
		all.put(0x1f4eeL, R.drawable.emoji_1f4ee);
		all.put(0x1f4e6L, R.drawable.emoji_1f4e6);
		all.put(0x1f4ddL, R.drawable.emoji_1f4dd);
		all.put(0x1f4c4L, R.drawable.emoji_1f4c4);
		all.put(0x1f4c3L, R.drawable.emoji_1f4c3);
		all.put(0x1f4d1L, R.drawable.emoji_1f4d1);
		all.put(0x1f4caL, R.drawable.emoji_1f4ca);
		all.put(0x1f4c8L, R.drawable.emoji_1f4c8);
		all.put(0x1f4c9L, R.drawable.emoji_1f4c9);
		all.put(0x1f4dcL, R.drawable.emoji_1f4dc);
		all.put(0x1f4cbL, R.drawable.emoji_1f4cb);
		all.put(0x1f4c5L, R.drawable.emoji_1f4c5);
		all.put(0x1f4c6L, R.drawable.emoji_1f4c6);
		all.put(0x1f4c7L, R.drawable.emoji_1f4c7);
		all.put(0x1f4c1L, R.drawable.emoji_1f4c1);
		all.put(0x1f4c2L, R.drawable.emoji_1f4c2);
		all.put(0x2702L, R.drawable.emoji_2702);
		all.put(0x1f4ccL, R.drawable.emoji_1f4cc);
		all.put(0x1f4ceL, R.drawable.emoji_1f4ce);
		all.put(0x2712L, R.drawable.emoji_2712);
		all.put(0x270fL, R.drawable.emoji_270f);
		all.put(0x1f4cfL, R.drawable.emoji_1f4cf);
		all.put(0x1f4d0L, R.drawable.emoji_1f4d0);
		all.put(0x1f4d5L, R.drawable.emoji_1f4d5);
		all.put(0x1f4d7L, R.drawable.emoji_1f4d7);
		all.put(0x1f4d8L, R.drawable.emoji_1f4d8);
		all.put(0x1f4d9L, R.drawable.emoji_1f4d9);
		all.put(0x1f4d3L, R.drawable.emoji_1f4d3);
		all.put(0x1f4d4L, R.drawable.emoji_1f4d4);
		all.put(0x1f4d2L, R.drawable.emoji_1f4d2);
		all.put(0x1f4daL, R.drawable.emoji_1f4da);
		all.put(0x1f4d6L, R.drawable.emoji_1f4d6);
		all.put(0x1f516L, R.drawable.emoji_1f516);
		all.put(0x1f4dbL, R.drawable.emoji_1f4db);
		all.put(0x1f52cL, R.drawable.emoji_1f52c);
		all.put(0x1f52dL, R.drawable.emoji_1f52d);
		all.put(0x1f4f0L, R.drawable.emoji_1f4f0);
		all.put(0x1f3a8L, R.drawable.emoji_1f3a8);
		all.put(0x1f3acL, R.drawable.emoji_1f3ac);
		all.put(0x1f3a4L, R.drawable.emoji_1f3a4);
		all.put(0x1f3a7L, R.drawable.emoji_1f3a7);
		all.put(0x1f3bcL, R.drawable.emoji_1f3bc);
		all.put(0x1f3b5L, R.drawable.emoji_1f3b5);
		all.put(0x1f3b6L, R.drawable.emoji_1f3b6);
		all.put(0x1f3b9L, R.drawable.emoji_1f3b9);
		all.put(0x1f3bbL, R.drawable.emoji_1f3bb);
		all.put(0x1f3baL, R.drawable.emoji_1f3ba);
		all.put(0x1f3b7L, R.drawable.emoji_1f3b7);
		all.put(0x1f3b8L, R.drawable.emoji_1f3b8);
		all.put(0x1f47eL, R.drawable.emoji_1f47e);
		all.put(0x1f3aeL, R.drawable.emoji_1f3ae);
		all.put(0x1f0cfL, R.drawable.emoji_1f0cf);
		all.put(0x1f3b4L, R.drawable.emoji_1f3b4);
		all.put(0x1f004L, R.drawable.emoji_1f004);
		all.put(0x1f3b2L, R.drawable.emoji_1f3b2);
		all.put(0x1f3afL, R.drawable.emoji_1f3af);
		all.put(0x1f3c8L, R.drawable.emoji_1f3c8);
		all.put(0x1f3c0L, R.drawable.emoji_1f3c0);
		all.put(0x26bdL, R.drawable.emoji_26bd);
		all.put(0x26beL, R.drawable.emoji_26be);
		all.put(0x1f3beL, R.drawable.emoji_1f3be);
		all.put(0x1f3b1L, R.drawable.emoji_1f3b1);
		all.put(0x1f3c9L, R.drawable.emoji_1f3c9);
		all.put(0x1f3b3L, R.drawable.emoji_1f3b3);
		all.put(0x26f3L, R.drawable.emoji_26f3);
		all.put(0x1f6b5L, R.drawable.emoji_1f6b5);
		all.put(0x1f6b4L, R.drawable.emoji_1f6b4);
		all.put(0x1f3c1L, R.drawable.emoji_1f3c1);
		all.put(0x1f3c7L, R.drawable.emoji_1f3c7);
		all.put(0x1f3c6L, R.drawable.emoji_1f3c6);
		all.put(0x1f3bfL, R.drawable.emoji_1f3bf);
		all.put(0x1f3c2L, R.drawable.emoji_1f3c2);
		all.put(0x1f3caL, R.drawable.emoji_1f3ca);
		all.put(0x1f3c4L, R.drawable.emoji_1f3c4);
		all.put(0x1f3a3L, R.drawable.emoji_1f3a3);
		all.put(0x2615L, R.drawable.emoji_2615);
		all.put(0x1f375L, R.drawable.emoji_1f375);
		all.put(0x1f376L, R.drawable.emoji_1f376);
		all.put(0x1f37cL, R.drawable.emoji_1f37c);
		all.put(0x1f37aL, R.drawable.emoji_1f37a);
		all.put(0x1f37bL, R.drawable.emoji_1f37b);
		all.put(0x1f378L, R.drawable.emoji_1f378);
		all.put(0x1f379L, R.drawable.emoji_1f379);
		all.put(0x1f377L, R.drawable.emoji_1f377);
		all.put(0x1f374L, R.drawable.emoji_1f374);
		all.put(0x1f355L, R.drawable.emoji_1f355);
		all.put(0x1f354L, R.drawable.emoji_1f354);
		all.put(0x1f35fL, R.drawable.emoji_1f35f);
		all.put(0x1f357L, R.drawable.emoji_1f357);
		all.put(0x1f356L, R.drawable.emoji_1f356);
		all.put(0x1f35dL, R.drawable.emoji_1f35d);
		all.put(0x1f35bL, R.drawable.emoji_1f35b);
		all.put(0x1f364L, R.drawable.emoji_1f364);
		all.put(0x1f371L, R.drawable.emoji_1f371);
		all.put(0x1f363L, R.drawable.emoji_1f363);
		all.put(0x1f365L, R.drawable.emoji_1f365);
		all.put(0x1f359L, R.drawable.emoji_1f359);
		all.put(0x1f358L, R.drawable.emoji_1f358);
		all.put(0x1f35aL, R.drawable.emoji_1f35a);
		all.put(0x1f35cL, R.drawable.emoji_1f35c);
		all.put(0x1f372L, R.drawable.emoji_1f372);
		all.put(0x1f362L, R.drawable.emoji_1f362);
		all.put(0x1f361L, R.drawable.emoji_1f361);
		all.put(0x1f373L, R.drawable.emoji_1f373);
		all.put(0x1f35eL, R.drawable.emoji_1f35e);
		all.put(0x1f369L, R.drawable.emoji_1f369);
		all.put(0x1f36eL, R.drawable.emoji_1f36e);
		all.put(0x1f366L, R.drawable.emoji_1f366);
		all.put(0x1f368L, R.drawable.emoji_1f368);
		all.put(0x1f367L, R.drawable.emoji_1f367);
		all.put(0x1f382L, R.drawable.emoji_1f382);
		all.put(0x1f370L, R.drawable.emoji_1f370);
		all.put(0x1f36aL, R.drawable.emoji_1f36a);
		all.put(0x1f36bL, R.drawable.emoji_1f36b);
		all.put(0x1f36cL, R.drawable.emoji_1f36c);
		all.put(0x1f36dL, R.drawable.emoji_1f36d);
		all.put(0x1f36fL, R.drawable.emoji_1f36f);
		all.put(0x1f34eL, R.drawable.emoji_1f34e);
		all.put(0x1f34fL, R.drawable.emoji_1f34f);
		all.put(0x1f34aL, R.drawable.emoji_1f34a);
		all.put(0x1f34bL, R.drawable.emoji_1f34b);
		all.put(0x1f352L, R.drawable.emoji_1f352);
		all.put(0x1f347L, R.drawable.emoji_1f347);
		all.put(0x1f349L, R.drawable.emoji_1f349);
		all.put(0x1f353L, R.drawable.emoji_1f353);
		all.put(0x1f351L, R.drawable.emoji_1f351);
		all.put(0x1f348L, R.drawable.emoji_1f348);
		all.put(0x1f34cL, R.drawable.emoji_1f34c);
		all.put(0x1f350L, R.drawable.emoji_1f350);
		all.put(0x1f34dL, R.drawable.emoji_1f34d);
		all.put(0x1f360L, R.drawable.emoji_1f360);
		all.put(0x1f346L, R.drawable.emoji_1f346);
		all.put(0x1f345L, R.drawable.emoji_1f345);
		all.put(0x1f33dL, R.drawable.emoji_1f33d);

		all.put((0x0031L << 32) | 0x20e3L, R.drawable.emoji_0031_20e3);
		all.put((0x0032L << 32) | 0x20e3L, R.drawable.emoji_0032_20e3);
		all.put((0x0033L << 32) | 0x20e3L, R.drawable.emoji_0033_20e3);
		all.put((0x0034L << 32) | 0x20e3L, R.drawable.emoji_0034_20e3);
		all.put((0x0035L << 32) | 0x20e3L, R.drawable.emoji_0035_20e3);
		all.put((0x0036L << 32) | 0x20e3L, R.drawable.emoji_0036_20e3);
		all.put((0x0037L << 32) | 0x20e3L, R.drawable.emoji_0037_20e3);
		all.put((0x0038L << 32) | 0x20e3L, R.drawable.emoji_0038_20e3);
		all.put((0x0039L << 32) | 0x20e3L, R.drawable.emoji_0039_20e3);
		all.put((0x0030L << 32) | 0x20e3L, R.drawable.emoji_0030_20e3);
		all.put(0x1f51fL, R.drawable.emoji_1f51f);
		all.put(0x1f522L, R.drawable.emoji_1f522);
		all.put((0x0023L << 32) | 0x20e3L, R.drawable.emoji_0023_20e3);
		all.put(0x1f523L, R.drawable.emoji_1f523);
		all.put(0x2b06L, R.drawable.emoji_2b06);
		all.put(0x2b07L, R.drawable.emoji_2b07);
		all.put(0x2b05L, R.drawable.emoji_2b05);
		all.put(0x27a1L, R.drawable.emoji_27a1);
		all.put(0x1f520L, R.drawable.emoji_1f520);
		all.put(0x1f521L, R.drawable.emoji_1f521);
		all.put(0x1f524L, R.drawable.emoji_1f524);
		all.put(0x2197L, R.drawable.emoji_2197);
		all.put(0x2196L, R.drawable.emoji_2196);
		all.put(0x2198L, R.drawable.emoji_2198);
		all.put(0x2199L, R.drawable.emoji_2199);
		all.put(0x2194L, R.drawable.emoji_2194);
		all.put(0x2195L, R.drawable.emoji_2195);
		all.put(0x1f504L, R.drawable.emoji_1f504);
		all.put(0x25c0L, R.drawable.emoji_25c0);
		all.put(0x25b6L, R.drawable.emoji_25b6);
		all.put(0x1f53cL, R.drawable.emoji_1f53c);
		all.put(0x1f53dL, R.drawable.emoji_1f53d);
		all.put(0x21a9L, R.drawable.emoji_21a9);
		all.put(0x21aaL, R.drawable.emoji_21aa);
		all.put(0x2139L, R.drawable.emoji_2139);
		all.put(0x23eaL, R.drawable.emoji_23ea);
		all.put(0x23e9L, R.drawable.emoji_23e9);
		all.put(0x23ebL, R.drawable.emoji_23eb);
		all.put(0x23ecL, R.drawable.emoji_23ec);
		all.put(0x2935L, R.drawable.emoji_2935);
		all.put(0x2934L, R.drawable.emoji_2934);
		all.put(0x1f197L, R.drawable.emoji_1f197);
		all.put(0x1f500L, R.drawable.emoji_1f500);
		all.put(0x1f501L, R.drawable.emoji_1f501);
		all.put(0x1f502L, R.drawable.emoji_1f502);
		all.put(0x1f195L, R.drawable.emoji_1f195);
		all.put(0x1f199L, R.drawable.emoji_1f199);
		all.put(0x1f192L, R.drawable.emoji_1f192);
		all.put(0x1f193L, R.drawable.emoji_1f193);
		all.put(0x1f196L, R.drawable.emoji_1f196);
		all.put(0x1f4f6L, R.drawable.emoji_1f4f6);
		all.put(0x1f3a6L, R.drawable.emoji_1f3a6);
		all.put(0x1f201L, R.drawable.emoji_1f201);
		all.put(0x1f22fL, R.drawable.emoji_1f22f);
		all.put(0x1f233L, R.drawable.emoji_1f233);
		all.put(0x1f235L, R.drawable.emoji_1f235);
		all.put(0x1f234L, R.drawable.emoji_1f234);
		all.put(0x1f232L, R.drawable.emoji_1f232);
		all.put(0x1f250L, R.drawable.emoji_1f250);
		all.put(0x1f239L, R.drawable.emoji_1f239);
		all.put(0x1f23aL, R.drawable.emoji_1f23a);
		all.put(0x1f236L, R.drawable.emoji_1f236);
		all.put(0x1f21aL, R.drawable.emoji_1f21a);
		all.put(0x1f6bbL, R.drawable.emoji_1f6bb);
		all.put(0x1f6b9L, R.drawable.emoji_1f6b9);
		all.put(0x1f6baL, R.drawable.emoji_1f6ba);
		all.put(0x1f6bcL, R.drawable.emoji_1f6bc);
		all.put(0x1f6beL, R.drawable.emoji_1f6be);
		all.put(0x1f6b0L, R.drawable.emoji_1f6b0);
		all.put(0x1f6aeL, R.drawable.emoji_1f6ae);
		all.put(0x1f17fL, R.drawable.emoji_1f17f);
		all.put(0x267fL, R.drawable.emoji_267f);
		all.put(0x1f6adL, R.drawable.emoji_1f6ad);
		all.put(0x1f237L, R.drawable.emoji_1f237);
		all.put(0x1f238L, R.drawable.emoji_1f238);
		all.put(0x1f202L, R.drawable.emoji_1f202);
		all.put(0x24c2L, R.drawable.emoji_24c2);
		all.put(0x1f6c2L, R.drawable.emoji_1f6c2);
		all.put(0x1f6c4L, R.drawable.emoji_1f6c4);
		all.put(0x1f6c5L, R.drawable.emoji_1f6c5);
		all.put(0x1f6c3L, R.drawable.emoji_1f6c3);
		all.put(0x1f251L, R.drawable.emoji_1f251);
		all.put(0x3299L, R.drawable.emoji_3299);
		all.put(0x3297L, R.drawable.emoji_3297);
		all.put(0x1f191L, R.drawable.emoji_1f191);
		all.put(0x1f198L, R.drawable.emoji_1f198);
		all.put(0x1f194L, R.drawable.emoji_1f194);
		all.put(0x1f6abL, R.drawable.emoji_1f6ab);
		all.put(0x1f51eL, R.drawable.emoji_1f51e);
		all.put(0x1f4f5L, R.drawable.emoji_1f4f5);
		all.put(0x1f6afL, R.drawable.emoji_1f6af);
		all.put(0x1f6b1L, R.drawable.emoji_1f6b1);
		all.put(0x1f6b3L, R.drawable.emoji_1f6b3);
		all.put(0x1f6b7L, R.drawable.emoji_1f6b7);
		all.put(0x1f6b8L, R.drawable.emoji_1f6b8);
		all.put(0x26d4L, R.drawable.emoji_26d4);
		all.put(0x2733L, R.drawable.emoji_2733);
		all.put(0x2747L, R.drawable.emoji_2747);
		all.put(0x274eL, R.drawable.emoji_274e);
		all.put(0x2705L, R.drawable.emoji_2705);
		all.put(0x2734L, R.drawable.emoji_2734);
		all.put(0x1f49fL, R.drawable.emoji_1f49f);
		all.put(0x1f19aL, R.drawable.emoji_1f19a);
		all.put(0x1f4f3L, R.drawable.emoji_1f4f3);
		all.put(0x1f4f4L, R.drawable.emoji_1f4f4);
		all.put(0x1f170L, R.drawable.emoji_1f170);
		all.put(0x1f171L, R.drawable.emoji_1f171);
		all.put(0x1f18eL, R.drawable.emoji_1f18e);
		all.put(0x1f17eL, R.drawable.emoji_1f17e);
		all.put(0x1f4a0L, R.drawable.emoji_1f4a0);
		all.put(0x27bfL, R.drawable.emoji_27bf);
		all.put(0x267bL, R.drawable.emoji_267b);
		all.put(0x2648L, R.drawable.emoji_2648);
		all.put(0x2649L, R.drawable.emoji_2649);
		all.put(0x264aL, R.drawable.emoji_264a);
		all.put(0x264bL, R.drawable.emoji_264b);
		all.put(0x264cL, R.drawable.emoji_264c);
		all.put(0x264dL, R.drawable.emoji_264d);
		all.put(0x264eL, R.drawable.emoji_264e);
		all.put(0x264fL, R.drawable.emoji_264f);
		all.put(0x2650L, R.drawable.emoji_2650);
		all.put(0x2651L, R.drawable.emoji_2651);
		all.put(0x2652L, R.drawable.emoji_2652);
		all.put(0x2653L, R.drawable.emoji_2653);
		all.put(0x26ceL, R.drawable.emoji_26ce);
		all.put(0x1f52fL, R.drawable.emoji_1f52f);
		all.put(0x1f3e7L, R.drawable.emoji_1f3e7);
		all.put(0x1f4b9L, R.drawable.emoji_1f4b9);
		all.put(0x1f4b2L, R.drawable.emoji_1f4b2);
		all.put(0x1f4b1L, R.drawable.emoji_1f4b1);
		all.put(0x00a9L, R.drawable.emoji_00a9);
		all.put(0x00aeL, R.drawable.emoji_00ae);
		all.put(0x2122L, R.drawable.emoji_2122);
		all.put(0x303dL, R.drawable.emoji_303d);
		all.put(0x3030L, R.drawable.emoji_3030);
		all.put(0x1f51dL, R.drawable.emoji_1f51d);
		all.put(0x1f51aL, R.drawable.emoji_1f51a);
		all.put(0x1f519L, R.drawable.emoji_1f519);
		all.put(0x1f51bL, R.drawable.emoji_1f51b);
		all.put(0x1f51cL, R.drawable.emoji_1f51c);
		all.put(0x274cL, R.drawable.emoji_274c);
		all.put(0x2b55L, R.drawable.emoji_2b55);
		all.put(0x2757L, R.drawable.emoji_2757);
		all.put(0x2753L, R.drawable.emoji_2753);
		all.put(0x2755L, R.drawable.emoji_2755);
		all.put(0x2754L, R.drawable.emoji_2754);
		all.put(0x1f503L, R.drawable.emoji_1f503);
		all.put(0x1f55bL, R.drawable.emoji_1f55b);
		all.put(0x1f567L, R.drawable.emoji_1f567);
		all.put(0x1f550L, R.drawable.emoji_1f550);
		all.put(0x1f55cL, R.drawable.emoji_1f55c);
		all.put(0x1f551L, R.drawable.emoji_1f551);
		all.put(0x1f55dL, R.drawable.emoji_1f55d);
		all.put(0x1f552L, R.drawable.emoji_1f552);
		all.put(0x1f55eL, R.drawable.emoji_1f55e);
		all.put(0x1f553L, R.drawable.emoji_1f553);
		all.put(0x1f55fL, R.drawable.emoji_1f55f);
		all.put(0x1f554L, R.drawable.emoji_1f554);
		all.put(0x1f560L, R.drawable.emoji_1f560);
		all.put(0x1f555L, R.drawable.emoji_1f555);
		all.put(0x1f556L, R.drawable.emoji_1f556);
		all.put(0x1f557L, R.drawable.emoji_1f557);
		all.put(0x1f558L, R.drawable.emoji_1f558);
		all.put(0x1f559L, R.drawable.emoji_1f559);
		all.put(0x1f55aL, R.drawable.emoji_1f55a);
		all.put(0x1f561L, R.drawable.emoji_1f561);
		all.put(0x1f562L, R.drawable.emoji_1f562);
		all.put(0x1f563L, R.drawable.emoji_1f563);
		all.put(0x1f564L, R.drawable.emoji_1f564);
		all.put(0x1f565L, R.drawable.emoji_1f565);
		all.put(0x1f566L, R.drawable.emoji_1f566);
		all.put(0x2716L, R.drawable.emoji_2716);
		all.put(0x2795L, R.drawable.emoji_2795);
		all.put(0x2796L, R.drawable.emoji_2796);
		all.put(0x2797L, R.drawable.emoji_2797);
		all.put(0x2660L, R.drawable.emoji_2660);
		all.put(0x2665L, R.drawable.emoji_2665);
		all.put(0x2663L, R.drawable.emoji_2663);
		all.put(0x2666L, R.drawable.emoji_2666);
		all.put(0x1f4aeL, R.drawable.emoji_1f4ae);
		all.put(0x1f4afL, R.drawable.emoji_1f4af);
		all.put(0x2714L, R.drawable.emoji_2714);
		all.put(0x2611L, R.drawable.emoji_2611);
		all.put(0x1f518L, R.drawable.emoji_1f518);
		all.put(0x1f517L, R.drawable.emoji_1f517);
		all.put(0x27b0L, R.drawable.emoji_27b0);
		all.put(0x1f531L, R.drawable.emoji_1f531);
		all.put(0x1f532L, R.drawable.emoji_1f532);
		all.put(0x1f533L, R.drawable.emoji_1f533);
		all.put(0x25fcL, R.drawable.emoji_25fc);
		all.put(0x25fbL, R.drawable.emoji_25fb);
		all.put(0x25feL, R.drawable.emoji_25fe);
		all.put(0x25fdL, R.drawable.emoji_25fd);
		all.put(0x25aaL, R.drawable.emoji_25aa);
		all.put(0x25abL, R.drawable.emoji_25ab);
		all.put(0x1f53aL, R.drawable.emoji_1f53a);
		all.put(0x2b1cL, R.drawable.emoji_2b1c);
		all.put(0x2b1bL, R.drawable.emoji_2b1b);
		all.put(0x26abL, R.drawable.emoji_26ab);
		all.put(0x26aaL, R.drawable.emoji_26aa);
		all.put(0x1f534L, R.drawable.emoji_1f534);
		all.put(0x1f535L, R.drawable.emoji_1f535);
		all.put(0x1f53bL, R.drawable.emoji_1f53b);
		all.put(0x1f536L, R.drawable.emoji_1f536);
		all.put(0x1f537L, R.drawable.emoji_1f537);
		all.put(0x1f538L, R.drawable.emoji_1f538);
		all.put(0x1f539L, R.drawable.emoji_1f539);
		all.put(0x2049L, R.drawable.emoji_2049);
		all.put(0x203cL, R.drawable.emoji_203c);
		
		peopleList = new long[] {
				0x1f604L, 0x1f603L, 0x1f600L, 0x1f60aL, 0x263aL, 0x1f609L, 0x1f60dL, 
				0x1f618L, 0x1f61aL, 0x1f617L, 0x1f619L, 0x1f61cL, 0x1f61dL, 0x1f61bL, 
				0x1f633L, 0x1f601L, 0x1f614L, 0x1f60cL, 0x1f612L, 0x1f61eL, 0x1f623L, 
				0x1f622L, 0x1f602L, 0x1f62dL, 0x1f62aL, 0x1f625L, 0x1f630L, 0x1f605L, 
				0x1f613L, 0x1f629L, 0x1f62bL, 0x1f628L, 0x1f631L, 0x1f620L, 0x1f621L, 
				0x1f624L, 0x1f616L, 0x1f606L, 0x1f60bL, 0x1f637L, 0x1f60eL, 0x1f634L, 
				0x1f635L, 0x1f632L, 0x1f61fL, 0x1f626L, 0x1f627L, 0x1f608L, 0x1f47fL, 
				0x1f62eL, 0x1f62cL, 0x1f610L, 0x1f615L, 0x1f62fL, 0x1f636L, 0x1f607L, 
				0x1f60fL, 0x1f611L, 0x1f472L, 0x1f473L, 0x1f46eL, 0x1f477L, 0x1f482L, 
				0x1f476L, 0x1f466L, 0x1f467L, 0x1f468L, 0x1f469L, 0x1f474L, 0x1f475L, 
				0x1f471L, 0x1f47cL, 0x1f478L, 0x1f63aL, 0x1f638L, 0x1f63bL, 0x1f63dL, 
				0x1f63cL, 0x1f640L, 0x1f63fL, 0x1f639L, 0x1f63eL, 0x1f479L, 0x1f47aL, 
				0x1f648L, 0x1f649L, 0x1f64aL, 0x1f480L, 0x1f47dL, 0x1f4a9L, 0x1f525L, 
				0x2728L, 0x1f31fL, 0x1f4abL, 0x1f4a5L, 0x1f4a2L, 0x1f4a6L, 0x1f4a7L, 
				0x1f4a4L, 0x1f4a8L, 0x1f442L, 0x1f440L, 0x1f443L, 0x1f445L, 0x1f444L, 
				0x1f44dL, 0x1f44eL, 0x1f44cL, 0x1f44aL, 0x270aL, 0x270cL, 0x1f44bL, 
				0x270bL, 0x1f450L, 0x1f446L, 0x1f447L, 0x1f449L, 0x1f448L, 0x1f64cL, 
				0x1f64fL, 0x261dL, 0x1f44fL, 0x1f4aaL, 0x1f6b6L, 0x1f3c3L, 0x1f483L, 
				0x1f46bL, 0x1f46aL, 0x1f46cL, 0x1f46dL, 0x1f48fL, 0x1f491L, 0x1f46fL, 
				0x1f646L, 0x1f645L, 0x1f481L, 0x1f64bL, 0x1f486L, 0x1f487L, 0x1f485L, 
				0x1f470L, 0x1f64eL, 0x1f64dL, 0x1f647L, 0x1f3a9L, 0x1f451L, 0x1f452L, 
				0x1f45fL, 0x1f45eL, 0x1f461L, 0x1f460L, 0x1f462L, 0x1f455L, 0x1f454L, 
				0x1f45aL, 0x1f457L, 0x1f3bdL, 0x1f456L, 0x1f458L, 0x1f459L, 0x1f4bcL, 
				0x1f45cL, 0x1f45dL, 0x1f45bL, 0x1f453L, 0x1f380L, 0x1f302L, 0x1f484L, 
				0x1f49bL, 0x1f499L, 0x1f49cL, 0x1f49aL, 0x2764L, 0x1f494L, 0x1f497L, 
				0x1f493L, 0x1f495L, 0x1f496L, 0x1f49eL, 0x1f498L, 0x1f48cL, 0x1f48bL, 
				0x1f48dL, 0x1f48eL, 0x1f464L, 0x1f465L, 0x1f4acL, 0x1f463L, 0x1f4adL
			};

			placesList = new long[] {
				0x1f3e0L, 0x1f3e1L, 0x1f3ebL, 0x1f3e2L, 0x1f3e3L, 0x1f3e5L, 0x1f3e6L, 
				0x1f3eaL, 0x1f3e9L, 0x1f3e8L, 0x1f492L, 0x26eaL, 0x1f3ecL, 0x1f3e4L, 
				0x1f307L, 0x1f306L, 0x1f3efL, 0x1f3f0L, 0x26faL, 0x1f3edL, 0x1f5fcL, 
				0x1f5feL, 0x1f5fbL, 0x1f304L, 0x1f305L, 0x1f303L, 0x1f5fdL, 0x1f309L, 
				0x1f3a0L, 0x1f3a1L, 0x26f2L, 0x1f3a2L, 0x1f6a2L, 0x26f5L, 0x1f6a4L, 
				0x1f6a3L, 0x2693L, 0x1f680L, 0x2708L, 0x1f4baL, 0x1f681L, 0x1f682L, 
				0x1f68aL, 0x1f689L, 0x1f69eL, 0x1f686L, 0x1f684L, 0x1f685L, 0x1f688L, 
				0x1f687L, 0x1f69dL, 0x1f68bL, 0x1f683L, 0x1f68eL, 0x1f68cL, 0x1f68dL, 
				0x1f699L, 0x1f698L, 0x1f697L, 0x1f695L, 0x1f696L, 0x1f69bL, 0x1f69aL, 
				0x1f6a8L, 0x1f693L, 0x1f694L, 0x1f692L, 0x1f691L, 0x1f690L, 0x1f6b2L, 
				0x1f6a1L, 0x1f69fL, 0x1f6a0L, 0x1f69cL, 0x1f488L, 0x1f68fL, 0x1f3abL, 
				0x1f6a6L, 0x1f6a5L, 0x26a0L, 0x1f6a7L, 0x1f530L, 0x26fdL, 0x1f3eeL, 
				0x1f3b0L, 0x2668L, 0x1f5ffL, 0x1f3aaL, 0x1f3adL, 0x1f4cdL, 0x1f6a9L, 
				(0x1f1efL << 32) | 0x1f1f5L, (0x1f1f0L << 32) | 0x1f1f7L, 
				(0x1f1e9L << 32) | 0x1f1eaL, (0x1f1e8L << 32) | 0x1f1f3L, 
				(0x1f1faL << 32) | 0x1f1f8L, (0x1f1ebL << 32) | 0x1f1f7L, 
				(0x1f1eaL << 32) | 0x1f1f8L, (0x1f1eeL << 32) | 0x1f1f9L, 
				(0x1f1f7L << 32) | 0x1f1faL, (0x1f1ecL << 32) | 0x1f1e7L
			};

			natureList = new long[] {
				0x1f436L, 0x1f43aL, 0x1f431L, 0x1f42dL, 0x1f439L, 0x1f430L, 0x1f438L, 
				0x1f42fL, 0x1f428L, 0x1f43bL, 0x1f437L, 0x1f43dL, 0x1f42eL, 0x1f417L, 
				0x1f435L, 0x1f412L, 0x1f434L, 0x1f411L, 0x1f418L, 0x1f43cL, 0x1f427L, 
				0x1f426L, 0x1f424L, 0x1f425L, 0x1f423L, 0x1f414L, 0x1f40dL, 0x1f422L, 
				0x1f41bL, 0x1f41dL, 0x1f41cL, 0x1f41eL, 0x1f40cL, 0x1f419L, 0x1f41aL, 
				0x1f420L, 0x1f41fL, 0x1f42cL, 0x1f433L, 0x1f40bL, 0x1f404L, 0x1f40fL, 
				0x1f400L, 0x1f403L, 0x1f405L, 0x1f407L, 0x1f409L, 0x1f40eL, 0x1f410L, 
				0x1f413L, 0x1f415L, 0x1f416L, 0x1f401L, 0x1f402L, 0x1f432L, 0x1f421L, 
				0x1f40aL, 0x1f42bL, 0x1f42aL, 0x1f406L, 0x1f408L, 0x1f429L, 0x1f43eL, 
				0x1f490L, 0x1f338L, 0x1f337L, 0x1f340L, 0x1f339L, 0x1f33bL, 0x1f33aL, 
				0x1f341L, 0x1f343L, 0x1f342L, 0x1f33fL, 0x1f33eL, 0x1f344L, 0x1f335L, 
				0x1f334L, 0x1f332L, 0x1f333L, 0x1f330L, 0x1f331L, 0x1f33cL, 0x1f310L, 
				0x1f31eL, 0x1f31dL, 0x1f31aL, 0x1f311L, 0x1f312L, 0x1f313L, 0x1f314L, 
				0x1f315L, 0x1f316L, 0x1f317L, 0x1f318L, 0x1f31cL, 0x1f31bL, 0x1f319L, 
				0x1f30dL, 0x1f30eL, 0x1f30fL, 0x1f30bL, 0x1f30cL, 0x1f320L, 0x2b50L, 
				0x2600L, 0x26c5L, 0x2601L, 0x26a1L, 0x2614L, 0x2744L, 0x26c4L, 
				0x1f300L, 0x1f301L, 0x1f308L, 0x1f30aL
			};

			objectsList = new long[] {
				0x1f38dL, 0x1f49dL, 0x1f38eL, 0x1f392L, 0x1f393L, 0x1f38fL, 0x1f386L, 
				0x1f387L, 0x1f390L, 0x1f391L, 0x1f383L, 0x1f47bL, 0x1f385L, 0x1f384L, 
				0x1f381L, 0x1f38bL, 0x1f389L, 0x1f38aL, 0x1f388L, 0x1f38cL, 0x1f52eL, 
				0x1f3a5L, 0x1f4f7L, 0x1f4f9L, 0x1f4fcL, 0x1f4bfL, 0x1f4c0L, 0x1f4bdL, 
				0x1f4beL, 0x1f4bbL, 0x1f4f1L, 0x260eL, 0x1f4deL, 0x1f4dfL, 0x1f4e0L, 
				0x1f4e1L, 0x1f4faL, 0x1f4fbL, 0x1f50aL, 0x1f509L, 0x1f508L, 0x1f507L, 
				0x1f514L, 0x1f515L, 0x1f4e2L, 0x1f4e3L, 0x23f3L, 0x231bL, 0x23f0L, 
				0x231aL, 0x1f513L, 0x1f512L, 0x1f50fL, 0x1f510L, 0x1f511L, 0x1f50eL, 
				0x1f4a1L, 0x1f526L, 0x1f506L, 0x1f505L, 0x1f50cL, 0x1f50bL, 0x1f50dL, 
				0x1f6c1L, 0x1f6c0L, 0x1f6bfL, 0x1f6bdL, 0x1f527L, 0x1f529L, 0x1f528L, 
				0x1f6aaL, 0x1f6acL, 0x1f4a3L, 0x1f52bL, 0x1f52aL, 0x1f48aL, 0x1f489L, 
				0x1f4b0L, 0x1f4b4L, 0x1f4b5L, 0x1f4b7L, 0x1f4b6L, 0x1f4b3L, 0x1f4b8L, 
				0x1f4f2L, 0x1f4e7L, 0x1f4e5L, 0x1f4e4L, 0x2709L, 0x1f4e9L, 0x1f4e8L, 
				0x1f4efL, 0x1f4ebL, 0x1f4eaL, 0x1f4ecL, 0x1f4edL, 0x1f4eeL, 0x1f4e6L, 
				0x1f4ddL, 0x1f4c4L, 0x1f4c3L, 0x1f4d1L, 0x1f4caL, 0x1f4c8L, 0x1f4c9L, 
				0x1f4dcL, 0x1f4cbL, 0x1f4c5L, 0x1f4c6L, 0x1f4c7L, 0x1f4c1L, 0x1f4c2L, 
				0x2702L, 0x1f4ccL, 0x1f4ceL, 0x2712L, 0x270fL, 0x1f4cfL, 0x1f4d0L, 
				0x1f4d5L, 0x1f4d7L, 0x1f4d8L, 0x1f4d9L, 0x1f4d3L, 0x1f4d4L, 0x1f4d2L, 
				0x1f4daL, 0x1f4d6L, 0x1f516L, 0x1f4dbL, 0x1f52cL, 0x1f52dL, 0x1f4f0L, 
				0x1f3a8L, 0x1f3acL, 0x1f3a4L, 0x1f3a7L, 0x1f3bcL, 0x1f3b5L, 0x1f3b6L, 
				0x1f3b9L, 0x1f3bbL, 0x1f3baL, 0x1f3b7L, 0x1f3b8L, 0x1f47eL, 0x1f3aeL, 
				0x1f0cfL, 0x1f3b4L, 0x1f004L, 0x1f3b2L, 0x1f3afL, 0x1f3c8L, 0x1f3c0L, 
				0x26bdL, 0x26beL, 0x1f3beL, 0x1f3b1L, 0x1f3c9L, 0x1f3b3L, 0x26f3L, 
				0x1f6b5L, 0x1f6b4L, 0x1f3c1L, 0x1f3c7L, 0x1f3c6L, 0x1f3bfL, 0x1f3c2L, 
				0x1f3caL, 0x1f3c4L, 0x1f3a3L, 0x2615L, 0x1f375L, 0x1f376L, 0x1f37cL, 
				0x1f37aL, 0x1f37bL, 0x1f378L, 0x1f379L, 0x1f377L, 0x1f374L, 0x1f355L, 
				0x1f354L, 0x1f35fL, 0x1f357L, 0x1f356L, 0x1f35dL, 0x1f35bL, 0x1f364L, 
				0x1f371L, 0x1f363L, 0x1f365L, 0x1f359L, 0x1f358L, 0x1f35aL, 0x1f35cL, 
				0x1f372L, 0x1f362L, 0x1f361L, 0x1f373L, 0x1f35eL, 0x1f369L, 0x1f36eL, 
				0x1f366L, 0x1f368L, 0x1f367L, 0x1f382L, 0x1f370L, 0x1f36aL, 0x1f36bL, 
				0x1f36cL, 0x1f36dL, 0x1f36fL, 0x1f34eL, 0x1f34fL, 0x1f34aL, 0x1f34bL, 
				0x1f352L, 0x1f347L, 0x1f349L, 0x1f353L, 0x1f351L, 0x1f348L, 0x1f34cL, 
				0x1f350L, 0x1f34dL, 0x1f360L, 0x1f346L, 0x1f345L, 0x1f33dL
			};

			symbolsList = new long[] {
				(0x0031L << 32) | 0x20e3L, (0x0032L << 32) | 0x20e3L, 
				(0x0033L << 32) | 0x20e3L, (0x0034L << 32) | 0x20e3L, 
				(0x0035L << 32) | 0x20e3L, (0x0036L << 32) | 0x20e3L, 
				(0x0037L << 32) | 0x20e3L, (0x0038L << 32) | 0x20e3L, 
				(0x0039L << 32) | 0x20e3L, (0x0030L << 32) | 0x20e3L, 
				0x1f51fL, 0x1f522L, (0x0023L << 32) | 0x20e3L, 
				0x1f523L, 0x2b06L, 0x2b07L, 0x2b05L, 0x27a1L, 0x1f520L, 0x1f521L, 
				0x1f524L, 0x2197L, 0x2196L, 0x2198L, 0x2199L, 0x2194L, 0x2195L, 
				0x1f504L, 0x25c0L, 0x25b6L, 0x1f53cL, 0x1f53dL, 0x21a9L, 0x21aaL, 
				0x2139L, 0x23eaL, 0x23e9L, 0x23ebL, 0x23ecL, 0x2935L, 0x2934L, 
				0x1f197L, 0x1f500L, 0x1f501L, 0x1f502L, 0x1f195L, 0x1f199L, 0x1f192L, 
				0x1f193L, 0x1f196L, 0x1f4f6L, 0x1f3a6L, 0x1f201L, 0x1f22fL, 0x1f233L, 
				0x1f235L, 0x1f234L, 0x1f232L, 0x1f250L, 0x1f239L, 0x1f23aL, 0x1f236L, 
				0x1f21aL, 0x1f6bbL, 0x1f6b9L, 0x1f6baL, 0x1f6bcL, 0x1f6beL, 0x1f6b0L, 
				0x1f6aeL, 0x1f17fL, 0x267fL, 0x1f6adL, 0x1f237L, 0x1f238L, 0x1f202L, 
				0x24c2L, 0x1f6c2L, 0x1f6c4L, 0x1f6c5L, 0x1f6c3L, 0x1f251L, 0x3299L, 
				0x3297L, 0x1f191L, 0x1f198L, 0x1f194L, 0x1f6abL, 0x1f51eL, 0x1f4f5L, 
				0x1f6afL, 0x1f6b1L, 0x1f6b3L, 0x1f6b7L, 0x1f6b8L, 0x26d4L, 0x2733L, 
				0x2747L, 0x274eL, 0x2705L, 0x2734L, 0x1f49fL, 0x1f19aL, 0x1f4f3L, 
				0x1f4f4L, 0x1f170L, 0x1f171L, 0x1f18eL, 0x1f17eL, 0x1f4a0L, 0x27bfL, 
				0x267bL, 0x2648L, 0x2649L, 0x264aL, 0x264bL, 0x264cL, 0x264dL, 
				0x264eL, 0x264fL, 0x2650L, 0x2651L, 0x2652L, 0x2653L, 0x26ceL, 
				0x1f52fL, 0x1f3e7L, 0x1f4b9L, 0x1f4b2L, 0x1f4b1L, 0x00a9L, 0x00aeL, 
				0x2122L, 0x303dL, 0x3030L, 0x1f51dL, 0x1f51aL, 0x1f519L, 0x1f51bL, 
				0x1f51cL, 0x274cL, 0x2b55L, 0x2757L, 0x2753L, 0x2755L, 0x2754L, 
				0x1f503L, 0x1f55bL, 0x1f567L, 0x1f550L, 0x1f55cL, 0x1f551L, 0x1f55dL, 
				0x1f552L, 0x1f55eL, 0x1f553L, 0x1f55fL, 0x1f554L, 0x1f560L, 0x1f555L, 
				0x1f556L, 0x1f557L, 0x1f558L, 0x1f559L, 0x1f55aL, 0x1f561L, 0x1f562L, 
				0x1f563L, 0x1f564L, 0x1f565L, 0x1f566L, 0x2716L, 0x2795L, 0x2796L, 
				0x2797L, 0x2660L, 0x2665L, 0x2663L, 0x2666L, 0x1f4aeL, 0x1f4afL, 
				0x2714L, 0x2611L, 0x1f518L, 0x1f517L, 0x27b0L, 0x1f531L, 0x1f532L, 
				0x1f533L, 0x25fcL, 0x25fbL, 0x25feL, 0x25fdL, 0x25aaL, 0x25abL, 
				0x1f53aL, 0x2b1cL, 0x2b1bL, 0x26abL, 0x26aaL, 0x1f534L, 0x1f535L, 
				0x1f53bL, 0x1f536L, 0x1f537L, 0x1f538L, 0x1f539L, 0x2049L, 0x203cL
			};

			int num = all.size();
			allList = new long[num];
			int index = 0;

			for (int i = 0; i < peopleList.length; ++i, ++index) {
				allList[index] = peopleList[i];
			}
			for (int i = 0; i < placesList.length; ++i, ++index) {
				allList[index] = placesList[i];
			}
			for (int i = 0; i < natureList.length; ++i, ++index) {
				allList[index] = natureList[i];
			}
			for (int i = 0; i < objectsList.length; ++i, ++index) {
				allList[index] = objectsList[i];
			}
			for (int i = 0; i < symbolsList.length; ++i, ++index) {
				allList[index] = symbolsList[i];
			}
	}
}
