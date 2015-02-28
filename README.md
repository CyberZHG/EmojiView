Emoji View
==========

## Features

* There are 845 emoji characters.
* __EmojiView__: used for selecting and entering emoji characters in _one_ category.
* __EmojiViewEx__: used for selecting and entering emoji characters in _all_ category.
* __EmojiEditView__ & __EmojiTextView__: used for editing and showing texts with emoji respectively.
* Emoji characters are encoded in corresponding Unicode.
* A lighter library contains only people category.

#### EmojiView

![EmojiView](https://cloud.githubusercontent.com/assets/853842/6096482/a274338e-afcd-11e4-9e27-73ea324166d9.png)

- The process of resources loading is lazy.
- The number of rows and columns could be customized.
- Navigator dots on the bottom.

#### EmojiViewEx

![EmojiViewEx](https://cloud.githubusercontent.com/assets/853842/6123783/a623e4f0-b141-11e4-8d03-c7b74b3a18c9.png)

- Customize border color and the height of category tab.

## Instruction

#### Import library

![Import Library](https://cloud.githubusercontent.com/assets/853842/6125301/a3b82cae-b14f-11e4-92a1-6290a1f0f3cb.png)

#### Layout file

```xml
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    xmlns:emoji="http://schemas.android.com/apk/res/zhaohg.emojiviewdemo"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:layout_gravity="fill">

    <zhaohg.emojiview.EmojiEditText
        android:id="@+id/emojiEditText"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:ems="10" >
        <requestFocus />
    </zhaohg.emojiview.EmojiEditText>
    
    <zhaohg.emojiview.EmojiViewEx
        android:id="@+id/emojiView"
        android:layout_width="match_parent"
        android:layout_height="190dp"
        android:background="#EEEEEE"
        emoji:indicatorDotsColor="#222222"
        emoji:categoryHeight="40dp"/>

</LinearLayout>
```

#### Set EditText

```java
EditText editText = (EditText) this.findViewById(R.id.emojiEditText);
EmojiView emojiView = (EmojiViewEx) this.findViewById(R.id.emojiView);
emojiView.setEditText(editText);
```

## Acknowledgements

* http://apps.timwhitlock.info/emoji/tables/unicode
* http://www.iemoji.com/
* http://www.emoji-cheat-sheet.com/
