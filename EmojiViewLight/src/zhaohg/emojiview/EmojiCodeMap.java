package zhaohg.emojiview;

import android.support.v4.util.LongSparseArray;

public class EmojiCodeMap {


	private static LongSparseArray<Integer> all = new LongSparseArray<Integer>();
	
	private static long[] allList;
	
	public static boolean exists(long code) {
		return all.get(code) != null;
	}
	
	public static int getDrawableID(long code) {
		return all.get(code);
	}
	
	public static long[] getCodeList() {
		return allList;
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

		allList = new long[] {
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
	}
}
