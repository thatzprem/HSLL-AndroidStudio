/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.loveletters.activityscenetransitionbasic;

/**
 * Represents an Item in our application. Each item has a name, id, full size image url and
 * thumbnail url.
 */
public class Item {

    private static final String LARGE_BASE_URL = "http://storage.googleapis.com/androiddevelopers/sample_data/activity_transition/large/";
    private static final String THUMB_BASE_URL = "http://storage.googleapis.com/androiddevelopers/sample_data/activity_transition/thumbs/";

//    public static Item[] ITEMS = new Item[] {
//            new Item("Henry VIII", "Anne Boleyn", "flying_in_the_light.jpg"),
//            new Item("Napoleon", " His Wife Josephine", "caterpillar.jpg"),
//            new Item("Beethoven", "His ‘Immortal Beloved’s", "look_me_in_the_eye.jpg"),
//            new Item("Winston Churchill", "His Wife Clementine", "flamingo.jpg"),
//            new Item("Charles Darwin", "Emma Wedgwood", "rainbow.jpg"),
//            new Item("Frida Kahlo", "Diego Rivera", "over_there.jpg"),
//            new Item("Richard Burton", "Elizabeth Taylor", "jelly_fish_2.jpg"),
//            new Item("Ronald Reagan", "Nancy Reagan", "lone_pine_sunset.jpg"),
//            new Item("Jerry Orbach", "His Wife Elaine", "lone_pine_sunset.jpg"),
//            new Item("Noah", "Allie", "lone_pine_sunset.jpg"),
//    };
public static Item[] ITEMS = new Item[] {
        new Item("Henry VIII", "Anne Boleyn", "image0", "I beg to know expressly your intention touching the love between us. Necessity compels me to obtain this answer, having been more than a year wounded by the dart of love, and not yet sure whether I shall fail or find a place in your affection."),
        new Item("Napoleon", " His Wife Josephine", "image1", "Since I left you, I have been constantly depressed. My happiness is to be near you. Incessantly I live over in my memory your caresses, your tears, your affectionate solicitude. The charms of the incomparable Josephine kindle continually a burning and a glowing flame in my heart. When, free from all solicitude, all harassing care, shall I be able to pass all my time with you, having only to love you, and to think only of the happiness of so saying, and of proving it to you?"),
        new Item("Beethoven", "His ‘Immortal Beloved’s", "image2", "Though still in bed, my thoughts go out to you, my Immortal Beloved, Be calm–love me–today–yesterday–what tearful longings for you–you–you–my life–my all–farewell. Oh continue to love me–never misjudge the most faithful heart of your beloved. Ever thine. Ever mine. Ever ours."),
        new Item("Winston Churchill", "His Wife Clementine", "image3", "My darling Clemmie, in your letter from Madras you wrote some words very dear to me, about having enriched your life. I cannot tell you what pleasure this gave me, because I always feel so overwhelmingly in your debt, if there can be accounts in love…What it has been to me to live all these years in your heart and companionship no phrases can convey."),
        new Item("Charles Darwin", "Emma Wedgwood", "image4", "How I do hope you shall be happy as I know I shall be. My own dearest Emma, I earnestly pray, you may never regret the great and I will add very good, deed you are to perform on the Tuesday: my own dear future wife, God bless you…"),
        new Item("Frida Kahlo", "Diego Rivera", "image5", "Diego my love- Remember that once you finish the fresco we will be together forever once and for all, without arguments or anything, only to love one another. Behave yourself and do everything that Emmy Lou tells you. I adore you more than ever. Your girl, Frida (Write me)."),
        new Item("Richard Burton", "Elizabeth Taylor", "image6", "My blind eyes are desperately waiting for the sight of you. You don’t realize of course, E.B., how fascinatingly beautiful you have always been, and how strangely you have acquired an added and special and dangerous loveliness."),
        new Item("Ronald Reagan", "Nancy Reagan", "image7", "Dear St. Valentine, I’m writing to you about a beautiful young lady who has been in this household for 25 years now—come March 4.I have a request to make of you but before doing so feel you should know more about her. For one thing she has 2 hearts—her own and mine. I’m not complaining. I gave her mine willingingly, and like it right where it is. Her name is Nancy but for some time now I’ve called her Mommie and don’t believe I could change.My request of you is—could you on this day whisper in her ear that someone loves her very much and more and more each day? Also tell her, this “Someone” would run down like a dollar clock without her so she must always stay where she is."),
        new Item("Jerry Orbach", "His Wife Elaine", "image8", "Valentine’s Day is here again. The weather looks cold and clammy…But I can happily go to work and try not to act too hammy. Cause I’ve got a warmness in my heart from my sunshine, my lifeline, my lambie! (I wish I could stay home and vie you a kiss!) xxx’s Jer"),
        new Item("Noah", "Allie", "image9", "My Dearest Allie. I couldn’t sleep last night because I know that it’s over between us. I’m not bitter anymore, because I know that what we had was real. And if in some distant place in the future we see each other in our new lives, I’ll smile at you with joy and remember how we spent a summer beneath the trees, learning from each other and growing in love. The best love is the kind that awakens the soul and makes us reach for more, that plants a fire in our hearts and brings peace to our minds. And that’s what you’ve given me. That’s what I’d hoped to give to you forever. I love you. I’ll be seeing you. Noah."),
};

    public static Item getItem(int id) {
        for (Item item : ITEMS) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    private final String mName;
    private final String mAuthor;
    private final String mFileName;
    private final String mDescription;


    Item(String name, String author, String fileName, String description) {
        mName = name;
        mAuthor = author;
        mFileName = fileName;
        mDescription = description;

    }

    public int getId() {
        return mName.hashCode() + mFileName.hashCode();
    }

    public String getAuthor() {
        return mAuthor;
    }

    public String getName() {
        return mName;
    }

    public String getmDescription() {
        return mDescription;
    }

    public String getPhotoUrl() {
        return LARGE_BASE_URL + mFileName;
    }

    public String getThumbnailUrl() {
        return THUMB_BASE_URL + mFileName;
    }

    public String getThumbnailImageName() {
        return mFileName;
    }

}
