/*
 * Copyright 2015 Google Inc. All rights reserved.
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

package com.asburymotors.android.disneyflorida.provider;

import android.net.Uri;

import com.asburymotors.android.disneyflorida.common.Attraction;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.SphericalUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Static data content provider.
 */
public class TouristAttractions {

    public static final String CITY_SYDNEY = "Orlando, Florida";

    public static final String TEST_CITY = CITY_SYDNEY;

    private static final float TRIGGER_RADIUS = 2000; // 2KM
    private static final int TRIGGER_TRANSITION = Geofence.GEOFENCE_TRANSITION_ENTER |
            Geofence.GEOFENCE_TRANSITION_EXIT;
    private static final long EXPIRATION_DURATION = Geofence.NEVER_EXPIRE;

    public static final Map<String, LatLng> CITY_LOCATIONS = new HashMap<String, LatLng>() {{
        put(CITY_SYDNEY, new LatLng(-33.873651, 151.2068896));
    }};

    /**
     * All photos used with permission under the Creative Commons Attribution-ShareAlike License.
     */
    public static final HashMap<String, List<Attraction>> ATTRACTIONS =
            new HashMap<String, List<Attraction>>() {{

        put(CITY_SYDNEY, new ArrayList<Attraction>() {{
            add(new Attraction(
                    "Affection Section, Kissemmee",
                    "Meet and greet friendly animals at the only petting zoo in Disney’s Animal Kingdom park.  Pet, brush and feed domesticated creatures at this expansive, outdoor petting zoo, designed for Guests looking to connect with the animal kingdom.",
                    "\n\nMeet and greet friendly animals at the only petting zoo in Disney’s Animal Kingdom park.  Pet, brush and feed domesticated creatures at this expansive, outdoor petting zoo, designed for Guests looking to connect with the animal kingdom..",
                    Uri.parse("https://secure.parksandresorts.wdpromedia.com/resize/mwImage/1/630/354/90/wdpromedia.disney.go.com/media/wdpro-assets/parks-and-tickets/attractions/animal-kingdom/affection-section/affection-section-00.jpg?17072014112357"),
                    Uri.parse("https://lh3.googleusercontent.com/-EFEw6s7mT6I/VGLkCH4Xt4I/AAAAAAAAADY/ZlznhaQvb8E/w600-no/DSC_2775.JPG"),
                    new LatLng(28.3654619,-81.5912772),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "African Elephants",
                    "African Elephants at Disney’s Animal Kingdom Park \n" +
                            "Guests can see a herd of African elephants (Loxodonta africana) while on the Kilimanjaro Safaris attraction at Disney's Animal Kingdom park.",
                    "\n\nGuests can see a herd of African elephants (Loxodonta africana) while on the Kilimanjaro Safaris attraction at Disney's Animal Kingdom park. \n\nAfrican elephants can be found in over 37 countries of sub-Saharan Africa. They are able to live in a variety of habitats, from dense forests to wet marshes to open and closed savannas—even arid deserts.",
                    Uri.parse("https://secure.parksandresorts.wdpromedia.com/resize/mwImage/1/630/354/90/wdpromedia.disney.go.com/media/wdpro-assets/parks-and-tickets/attractions/animal-kingdom/disney-animals/disney-animals-african-elephants/disney-animals-african-elephants-00-b.jpg?12112014110435"),
                    Uri.parse("https://lh4.googleusercontent.com/-ch9Kk-7pD68/VGLkCNh5niI/AAAAAAAAADc/ztxkRHWX-po/w600-no/DSC_2739.JPG"),
                    new LatLng(-33.852222, 151.210556),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "The American Adventure",
                    "A feat of entertainment, engineering and aesthetics, The American Adventure took Disney Imagineers 5 years to complete. The beautiful building in which it is housed was intended as a “people’s mansion,” taking design cues from the classic Georgian style of the late 1700s, Colonial Williamsburg, Independence Hall, Thomas Jefferson’s Monticello and the Old State House in Boston.",
                    "\n\nA feat of entertainment, engineering and aesthetics, The American Adventure took Disney Imagineers 5 years to complete. \n\nThe beautiful building in which it is housed was intended as a “people’s mansion,” taking design cues from the classic Georgian style of the late 1700s, Colonial Williamsburg, Independence Hall, Thomas Jefferson’s Monticello and the Old State House in Boston. \n\nThe façade of the American Adventure Pavilion is made of 110,000 bricks handmade from Georgia red clay, aged for an authentic look and feel. Its central rotunda is approximately 35 feet high, with its dome adding another 10 feet. \n\nThe pavilion itself encompasses an expansive 108,555 square feet!",
                    Uri.parse("https://secure.parksandresorts.wdpromedia.com/resize/mwImage/1/630/354/90/wdpromedia.disney.go.com/media/wdpro-assets/parks-and-tickets/attractions/epcot/american-adventure/american-adventure-00.jpg?17072014081927"),
                    Uri.parse("https://lh6.googleusercontent.com/-SQ6T1Ure6l8/VGLaTg2iGuI/AAAAAAAAACo/m6_RkTW2G1o/w600-no/IMG_20140201_082851.jpg"),
                    new LatLng(-33.8723, 151.19896),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "American Heritage Gallery",
                    "Take a journey through time at an art exhibit that represents 400 years of African-American achievement.  Re-Discovering America: Family Treasures from the Kinsey Collection” draws from an extensive collection of rare art, documents, books and artifacts amassed by philanthropists Bernard and Shirley Kinsey. Their private collection has been displayed throughout the United States, including in the Smithsonian National Museum of American History.",
                    "\n\nTake a journey through time at an art exhibit that represents 400 years of African-American achievement.  \n\nRe-Discovering America: Family Treasures from the Kinsey Collection” draws from an extensive collection of rare art, documents, books and artifacts amassed by philanthropists Bernard and Shirley Kinsey. \n\nTheir private collection has been displayed throughout the United States, including in the Smithsonian National Museum of American History.",
                    Uri.parse("https://secure.parksandresorts.wdpromedia.com/resize/mwImage/1/630/354/90/wdpromedia.disney.go.com/media/wdpro-assets/parks-and-tickets/attractions/epcot/american-heritage-gallery/american-heritage-gallery-00.jpg?17072014084030"),
                    Uri.parse("https://lh6.googleusercontent.com/-sjY_xlEOic4/VHe9-I4DD9I/AAAAAAAAAFI/Mt0VnjU7SxQ/w600-no/IMG_20141124_144008.jpg"),
                    new LatLng(-33.89102, 151.277726),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Astro Orbiter",
                    "Maneuver a rocket-like spacecraft into the farthest reaches of space and back. As the newest star pilot to join the fleet, the time has come for you to take to the sky. Board an elevator with fellow cadets and ascend to a loading platform for your space flight to begin.",
                    "\n\nManeuver a rocket-like spacecraft into the farthest reaches of space and back. \n\nAs the newest star pilot to join the fleet, the time has come for you to take to the sky. \n\nBoard an elevator with fellow cadets and ascend to a loading platform for your space flight to begin. \n\nAfter receiving authorization from Ground Control, make your way to a gleaming 2-passenger spaceship of your choice and prepare for launch. Then, hold on tight as your spacecraft levitates and begins a series of revolutions around a galaxy of planets, as the sights and sounds of Tomorrowland whizz by in the distance below.",
                    Uri.parse("https://secure.parksandresorts.wdpromedia.com/resize/mwImage/1/630/354/90/wdpromedia.disney.go.com/media/wdpro-assets/parks-and-tickets/attractions/magic-kingdom/astro-orbiter/astro-orbiter-00.jpg?17072014161803"),
                    Uri.parse("https://lh3.googleusercontent.com/-6_Ioko2ysgU/VHva2PjmRCI/AAAAAAAAAGM/cHjJC7ney4Q/w500-no/PC190054.JPG"),
                    new LatLng(-33.843333, 151.241111),
                    CITY_SYDNEY
            ));
            add(new Attraction(
                    "The Barnstormer",
                    "Climb aboard a wacky stunt plane and become a part of The Great Goofini’s daredevil act. Step underneath a grand circus marquee and make your way to an open-air barn where Goofy—known as The Great Goofini—has been known to perform his world-famous high-flying show. Once inside the red hanger, board one of Goofy’s very own stunt biplanes and hold on tight as you prepare to take to the skies above Fantasyland.",
                    "\n\nClimb aboard a wacky stunt plane and become a part of The Great Goofini’s daredevil act. \n\nStep underneath a grand circus marquee and make your way to an open-air barn where Goofy—known as The Great Goofini—has been known to perform his world-famous high-flying show. \n\nOnce inside the red hanger, board one of Goofy’s very own stunt biplanes and hold on tight as you prepare to take to the skies above Fantasyland.",
                    Uri.parse("https://secure.parksandresorts.wdpromedia.com/resize/mwImage/1/630/354/90/wdpromedia.disney.go.com/media/wdpro-assets/parks-and-tickets/attractions/magic-kingdom/barnstormer-starring-the-great-goofini/barnstormer-starring-great-goofini-00.jpg?17072014162835"),
                    Uri.parse("https://lh3.googleusercontent.com/-EFEw6s7mT6I/VGLkCH4Xt4I/AAAAAAAAADY/ZlznhaQvb8E/w600-no/DSC_2775.JPG"),
                    new LatLng(-33.858667, 151.214028),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Big Thunder Mountain Railroad",
                    "Dash in and out of desert caverns and rumble through a haunted mine aboard a speeding train. Amid rugged bedrock and desert cactus, venture inside a nearly 200-foot mountain to the Big Thunder Mining Company, established in the early days of America’s Gold Rush. Traipse down into an abandoned mine shaft and discover a mysterious 5-car locomotive waiting to take you on a journey inside an abandoned shaft.",
                    "\n\nDash in and out of desert caverns and rumble through a haunted mine aboard a speeding train. \n\nAmid rugged bedrock and desert cactus, venture inside a nearly 200-foot mountain to the Big Thunder Mining Company, established in the early days of America’s Gold Rush. \n\nTraipse down into an abandoned mine shaft and discover a mysterious 5-car locomotive waiting to take you on a journey inside an abandoned shaft.",
                    Uri.parse("https://secure.parksandresorts.wdpromedia.com/resize/mwImage/1/630/354/90/wdpromedia.disney.go.com/media/wdpro-assets/parks-and-tickets/attractions/magic-kingdom/big-thunder-mountain-railroad/big-thunder-mountain-railroad-00.jpg?17072014165020"),
                    Uri.parse("https://lh4.googleusercontent.com/-ch9Kk-7pD68/VGLkCNh5niI/AAAAAAAAADc/ztxkRHWX-po/w600-no/DSC_2739.JPG"),
                    new LatLng(-33.852222, 151.210556),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Bijutsu-kan Gallery",
                    "Step inside this charming exhibit and you can’t help but break into a smile. The first item that will undoubtedly catch your eye is a sizeable Melty-Go-Round statue formed in the shape of a Harajuku girl. Created by Japanese artist and designer Sebastian Masuda, this mixed media piece is filled with a colorful array of jewelry, toys and tchotchkes from his travels. It makes the perfect preamble to the types of items you’ll find on display.",
                    "\n\nStep inside this charming exhibit and you can’t help but break into a smile. \n\nThe first item that will undoubtedly catch your eye is a sizeable Melty-Go-Round statue formed in the shape of a Harajuku girl. \n\nCreated by Japanese artist and designer Sebastian Masuda, this mixed media piece is filled with a colorful array of jewelry, toys and tchotchkes from his travels. \n\nIt makes the perfect preamble to the types of items you’ll find on display.",
                    Uri.parse("https://secure.parksandresorts.wdpromedia.com/resize/mwImage/1/630/354/90/wdpromedia.disney.go.com/media/wdpro-assets/gallery/attractions/epcot/bijutsu-kan-gallery/bijutsu-kan-gallery-gallery00.jpg?07072014210726"),
                    Uri.parse("https://lh6.googleusercontent.com/-SQ6T1Ure6l8/VGLaTg2iGuI/AAAAAAAAACo/m6_RkTW2G1o/w600-no/IMG_20140201_082851.jpg"),
                    new LatLng(-33.8723, 151.19896),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Casey Jr. Splash 'N' Soak Station",
                    "Casey Jr. has rolled into town and is making a splash! Located near the train station in Storybook Circus, Casey Jr. Splash 'N' Soak Station is a circus-themed water play zone where children can cool off and make new friends in the heart of Fantasyland.",
                    "\n\nCasey Jr. has rolled into town and is making a splash! \n\nLocated near the train station in Storybook Circus, Casey Jr. Splash 'N' Soak Station is a circus-themed water play zone where children can cool off and make new friends in the heart of Fantasyland.",
                    Uri.parse("https://secure.parksandresorts.wdpromedia.com/resize/mwImage/1/630/354/90/wdpromedia.disney.go.com/media/wdpro-assets/parks-and-tickets/attractions/magic-kingdom/casey-jr-splash-n-soak-station/casey-jr-splash-n-soak-station-00.jpg?17072014173352"),
                    Uri.parse("https://lh6.googleusercontent.com/-sjY_xlEOic4/VHe9-I4DD9I/AAAAAAAAAFI/Mt0VnjU7SxQ/w600-no/IMG_20141124_144008.jpg"),
                    new LatLng(-33.89102, 151.277726),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Chairlift",
                    "Every ski resort has a chairlift to ferry Guests up the mountain, and Disney’s Blizzard Beach is no exception! This slow-moving transportation takes you on a scenic trip up to the Green Slope.",
                    "\n\nEvery ski resort has a chairlift to ferry Guests up the mountain, and Disney’s Blizzard Beach is no exception! \n\nThis slow-moving transportation takes you on a scenic trip up to the Green Slope.",
                    Uri.parse("https://secure.parksandresorts.wdpromedia.com/resize/mwImage/1/630/354/90/wdpromedia.disney.go.com/media/wdpro-assets/parks-and-tickets/attractions/blizzard-beach/chair-lift/chair-lift-00.jpg?17072014080740"),
                    Uri.parse("https://lh3.googleusercontent.com/-6_Ioko2ysgU/VHva2PjmRCI/AAAAAAAAAGM/cHjJC7ney4Q/w500-no/PC190054.JPG"),
                    new LatLng(-33.843333, 151.241111),
                    CITY_SYDNEY
            ));
            add(new Attraction(
                    "Cinderella Castle",
                    "Inspired by the castle in Disney’s Cinderella, this iconic fairytale palace is the symbol of Magic Kingdom park.",
                    "Inspired by the castle in Disney’s Cinderella, this iconic fairytale palace is the symbol of Magic Kingdom park. Rising high in the sky at the end of Main Street, U.S.A., Cinderella Castle welcomes you to a magical world of fantasy and fun. The central icon of Walt Disney World Resort, the castle invites all who visit to celebrate in a place where dreams come true.",
                    Uri.parse("https://secure.parksandresorts.wdpromedia.com/resize/mwImage/1/630/354/90/wdpromedia.disney.go.com/media/wdpro-assets/parks-and-tickets/attractions/magic-kingdom/cinderella-castle/cinderella-castle-00.jpg?17072014175634"),
                    Uri.parse("https://lh3.googleusercontent.com/-EFEw6s7mT6I/VGLkCH4Xt4I/AAAAAAAAADY/ZlznhaQvb8E/w600-no/DSC_2775.JPG"),
                    new LatLng(-33.858667, 151.214028),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Conservation Station",
                    "Enjoy an in-depth look at animal habitats from around the globe and discover the expert care our park animals receive. Through informative interactive exhibits and a viewable onsite research facility, Conservation Station invites you to uncover the mysteries of the wild—and to go behind the scenes of Disney’s efforts to promote conservation awareness.",
                    "\n\nEnjoy an in-depth look at animal habitats from around the globe and discover the expert care our park animals receive. \n\nThrough informative interactive exhibits and a viewable onsite research facility, Conservation Station invites you to uncover the mysteries of the wild—and to go behind the scenes of Disney’s efforts to promote conservation awareness.",
                    Uri.parse("https://secure.parksandresorts.wdpromedia.com/resize/mwImage/1/630/354/90/wdpromedia.disney.go.com/media/wdpro-assets/parks-and-tickets/attractions/animal-kingdom/conservation-station/conservation-station-00.jpg?17072014114311"),
                    Uri.parse("https://lh4.googleusercontent.com/-ch9Kk-7pD68/VGLkCNh5niI/AAAAAAAAADc/ztxkRHWX-po/w600-no/DSC_2739.JPG"),
                    new LatLng(-33.852222, 151.210556),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Coral Reefs - Disney Animals",
                    "Dive into the serene seascape of a Caribbean coral reef—without getting wet! Coral reefs are so rich in life that scientists call them the “rainforests of the sea.” Guests can see our artificial Caribbean coral reef at The Seas with Nemo & Friends at Epcot.",
                    "\n\nDive into the serene seascape of a Caribbean coral reef—without getting wet! \n\nCoral reefs are so rich in life that scientists call them the “rainforests of the sea.” Guests can see our artificial Caribbean coral reef at The Seas with Nemo & Friends at Epcot.",
                    Uri.parse("https://secure.parksandresorts.wdpromedia.com/resize/mwImage/1/630/354/90/wdpromedia.disney.go.com/media/wdpro-assets/parks-and-tickets/attractions/animal-kingdom/disney-animals/disney-animals-coral-reefs/disney-animals-coral-reefs-00.jpg?10112014092555"),
                    Uri.parse("https://lh6.googleusercontent.com/-SQ6T1Ure6l8/VGLaTg2iGuI/AAAAAAAAACo/m6_RkTW2G1o/w600-no/IMG_20140201_082851.jpg"),
                    new LatLng(-33.8723, 151.19896),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Country Bear Jamboree",
                    "Clap your hands and sing along with the Country Bears to a medley of country ditties. Drop into the rustic frontier cabin known as “Grizzly Hall,” and make your way through a cozy lobby, where classic portraits of performers past and present mingle with a collection of musical instruments. Step inside the charming theater—home to 5 stages brimming with decorative wood-carved prosceniums and hanging red curtains—and take a seat before the lights dim.",
                    "\n\nClap your hands and sing along with the Country Bears to a medley of country ditties. \n\nDrop into the rustic frontier cabin known as “Grizzly Hall,” and make your way through a cozy lobby, where classic portraits of performers past and present mingle with a collection of musical instruments. \n\nStep inside the charming theater—home to 5 stages brimming with decorative wood-carved prosceniums and hanging red curtains—and take a seat before the lights dim.",
                    Uri.parse("https://secure.parksandresorts.wdpromedia.com/resize/mwImage/1/630/354/90/wdpromedia.disney.go.com/media/wdpro-assets/parks-and-tickets/attractions/magic-kingdom/country-bear-jamboree/country-bear-jamboree-01.jpg?17072014180229"),
                    Uri.parse("https://lh6.googleusercontent.com/-sjY_xlEOic4/VHe9-I4DD9I/AAAAAAAAAFI/Mt0VnjU7SxQ/w600-no/IMG_20141124_144008.jpg"),
                    new LatLng(-33.89102, 151.277726),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Cross Country Creek",
                    "Kick back, relax and chill out on an inner tube on this lazy river, a polar-themed paradise with plenty of solar exposure.  Guests of all ages can grab an inner tube at any of the 7 landings along the 3,000-foot-long route and melt into mellowness on this continuous, flowing river that winds its way around all of Disney’s Blizzard Beach.",
                    "\n\nKick back, relax and chill out on an inner tube on this lazy river, a polar-themed paradise with plenty of solar exposure.  \n\nGuests of all ages can grab an inner tube at any of the 7 landings along the 3,000-foot-long route and melt into mellowness on this continuous, flowing river that winds its way around all of Disney’s Blizzard Beach.",
                    Uri.parse("https://disneyworld.disney.go.com/attractions/blizzard-beach/cross-country-creek/"),
                    Uri.parse("https://lh3.googleusercontent.com/-6_Ioko2ysgU/VHva2PjmRCI/AAAAAAAAAGM/cHjJC7ney4Q/w500-no/PC190054.JPG"),
                    new LatLng(-33.843333, 151.241111),
                    CITY_SYDNEY
            ));
            add(new Attraction(
                    "DINOSAUR",
                    "Travel back in time on a perilous race to rescue an Iguanadon before the meteor that wiped out the dinosaurs strikes.",
                    "\n\nTravel back in time on a perilous race to rescue an Iguanadon before the meteor that wiped out the dinosaurs strikes. \n\nStep inside the pristine halls of The Dino Institute, a one-time secret research facility and museum that is home to real fossils dating back to when dinosaurs walked the earth. Stroll past prehistoric exhibits and behold the colossal skeleton of the carnivorous Carnotaurus, one of history’s most feared dinosaurs.",
                    Uri.parse("https://secure.parksandresorts.wdpromedia.com/resize/mwImage/1/630/354/90/wdpromedia.disney.go.com/media/wdpro-assets/parks-and-tickets/attractions/animal-kingdom/dinosaur/dinosaur-00.jpg?06052013090655"),
                    Uri.parse("https://lh3.googleusercontent.com/-EFEw6s7mT6I/VGLkCH4Xt4I/AAAAAAAAADY/ZlznhaQvb8E/w600-no/DSC_2775.JPG"),
                    new LatLng(-33.858667, 151.214028),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Dino-Sue",
                    "Stand in the shadow of a replica of the largest and most complete T-Rex skeleton ever found.  Pose for pictures with the meticulously detailed, 13-foot tall, 40-foot long Tyrannosaurus Rex reproduction. Dating back 67 million years to the Late Cretaceous Period, Dino-Sue is the length of a 4-story building—and a fascinating sight to see.",
                    "\n\nStand in the shadow of a replica of the largest and most complete T-Rex skeleton ever found.  \n\nPose for pictures with the meticulously detailed, 13-foot tall, 40-foot long Tyrannosaurus Rex reproduction. Dating back 67 million years to the Late Cretaceous Period, Dino-Sue is the length of a 4-story building—and a fascinating sight to see.",
                    Uri.parse("https://secure.parksandresorts.wdpromedia.com/resize/mwImage/1/630/354/90/wdpromedia.disney.go.com/media/wdpro-assets/parks-and-tickets/attractions/animal-kingdom/dino-sue/dino-sue-00.jpg?17072014115757"),
                    Uri.parse("https://lh4.googleusercontent.com/-ch9Kk-7pD68/VGLkCNh5niI/AAAAAAAAADc/ztxkRHWX-po/w600-no/DSC_2739.JPG"),
                    new LatLng(-33.852222, 151.210556),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Discovery Island Trails",
                    "Escape to a garden paradise where exotic creatures mingle alongside verdant plants and trees. Encircling the base of the Tree of Life, Discovery Island Trails invites you to embark on a self-guided tour and enjoy an up-close glimpse of nature—at your own pace.",
                    "\n\nEscape to a garden paradise where exotic creatures mingle alongside verdant plants and trees. \n\nEncircling the base of the Tree of Life, Discovery Island Trails invites you to embark on a self-guided tour and enjoy an up-close glimpse of nature—at your own pace.",
                    Uri.parse("https://secure.parksandresorts.wdpromedia.com/resize/mwImage/1/630/354/90/wdpromedia.disney.go.com/media/wdpro-assets/parks-and-tickets/attractions/animal-kingdom/discovery-island-trails/discovery-island-trails-00.jpg?17072014121217"),
                    Uri.parse("https://lh6.googleusercontent.com/-SQ6T1Ure6l8/VGLaTg2iGuI/AAAAAAAAACo/m6_RkTW2G1o/w600-no/IMG_20140201_082851.jpg"),
                    new LatLng(-33.8723, 151.19896),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Downhill Double Dipper",
                    "A retractable starting gate is all that stands between you and first place. Anticipation builds as you and your opponent wait on inner tubes at the top of twin enclosed waterslides. As rapids rush by, you exchange glances. Suddenly, the gates retract—and you’re off!",
                    "\n\nA retractable starting gate is all that stands between you and first place. \n\nAnticipation builds as you and your opponent wait on inner tubes at the top of twin enclosed waterslides. As rapids rush by, you exchange glances. Suddenly, the gates retract—and you’re off!",
                    Uri.parse("https://secure.parksandresorts.wdpromedia.com/resize/mwImage/1/630/354/90/wdpromedia.disney.go.com/media/wdpro-assets/parks-and-tickets/attractions/blizzard-beach/downhill-double-dipper/downhill-double-dipper-00.jpg?17072014085643"),
                    Uri.parse("https://lh6.googleusercontent.com/-sjY_xlEOic4/VHe9-I4DD9I/AAAAAAAAAFI/Mt0VnjU7SxQ/w600-no/IMG_20141124_144008.jpg"),
                    new LatLng(-33.89102, 151.277726),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Dumbo the Flying Elephant",
                    "Hop atop Dumbo and take off into the air on a joyful journey amid the jubilant sounds of carnival music. Based on Disney’s 1941 animated classic Dumbo, Dumbo the Flying Elephant invites you to accompany everybody’s favorite circus elephant as he discovers his unique ability to fly.",
                    "\n\nHop atop Dumbo and take off into the air on a joyful journey amid the jubilant sounds of carnival music. \n\nBased on Disney’s 1941 animated classic Dumbo, Dumbo the Flying Elephant invites you to accompany everybody’s favorite circus elephant as he discovers his unique ability to fly.",
                    Uri.parse("https://secure.parksandresorts.wdpromedia.com/resize/mwImage/1/630/354/90/wdpromedia.disney.go.com/media/wdpro-assets/parks-and-tickets/attractions/magic-kingdom/dumbo-the-flying-elephant/dumbo-the-flying-elephant-00.jpg?17072014180713"),
                    Uri.parse("https://lh3.googleusercontent.com/-6_Ioko2ysgU/VHva2PjmRCI/AAAAAAAAAGM/cHjJC7ney4Q/w500-no/PC190054.JPG"),
                    new LatLng(-33.843333, 151.241111),
                    CITY_SYDNEY
            ));
            add(new Attraction(
                    "Ellen's Energy Adventure",
                    "Your seat in the theater of Ellen’s brain becomes a time machine that transports you through primeval forests where dinosaurs dwell.",
                    "\n\nYour seat in the theater of Ellen’s brain becomes a time machine that transports you through primeval forests where dinosaurs dwell. \n\nWhen the charmingly candid comedienne falls asleep while watching Jeopardy!, she dreams she’s a contestant on the show. Unfortunately, the category is energy, a topic she knows nothing about. Thankfully, her friend and neighbor Bill Nye is on hand to tutor her, and you’re along for the ride as they embark on a time-traveling quest for energy knowledge.",
                    Uri.parse("https://secure.parksandresorts.wdpromedia.com/resize/mwImage/1/630/354/90/wdpromedia.disney.go.com/media/wdpro-assets/parks-and-tickets/attractions/epcot/ellens-energy-adventure/ellens-energy-adventure-00-new.jpg?26102015123016"),
                    Uri.parse("https://lh3.googleusercontent.com/-EFEw6s7mT6I/VGLkCH4Xt4I/AAAAAAAAADY/ZlznhaQvb8E/w600-no/DSC_2775.JPG"),
                    new LatLng(-33.858667, 151.214028),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Enchanted Tales with Belle",
                    "Be magically transported from Maurice’s cottage to the Beast’s library for a delightful storytelling experience. You’ll meet and spend time with Belle, and you may even be invited to play a part in the story. Will you be an enchanted object, or perhaps fill the role of the Beast with a heart of gold?",
                    "\n\nBe magically transported from Maurice’s cottage to the Beast’s library for a delightful storytelling experience. \n\nYou’ll meet and spend time with Belle, and you may even be invited to play a part in the story. Will you be an enchanted object, or perhaps fill the role of the Beast with a heart of gold?",
                    Uri.parse("https://secure.parksandresorts.wdpromedia.com/resize/mwImage/1/630/354/90/wdpromedia.disney.go.com/media/wdpro-assets/parks-and-tickets/entertainment/character-experience/magic-kingdom/enchanted-tales-with-belle/enchanted-tales-with-belle-00.jpg?14112014082516"),
                    Uri.parse("https://lh4.googleusercontent.com/-ch9Kk-7pD68/VGLkCNh5niI/AAAAAAAAADc/ztxkRHWX-po/w600-no/DSC_2739.JPG"),
                    new LatLng(-33.852222, 151.210556),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Expedition Everest - Legend of the Forbidden Mountain",
                    "Embark on a thrilling expedition through the icy peaks of the Himalayas. Venture inside a Tibetan-style stone structure at the foot of towering Mt. Everest and make your way past the booking office of Himalayan Escapes – Tours and Expeditions. Wander past a small temple and a cozy general store before exploring a museum dedicated to the study of the Yeti, the mysterious snow monster said to inhabit the Himalayas.",
                    "\n\nEmbark on a thrilling expedition through the icy peaks of the Himalayas. \n\nVenture inside a Tibetan-style stone structure at the foot of towering Mt. Everest and make your way past the booking office of Himalayan Escapes – Tours and Expeditions. \n\nWander past a small temple and a cozy general store before exploring a museum dedicated to the study of the Yeti, the mysterious snow monster said to inhabit the Himalayas..",
                    Uri.parse("https://secure.parksandresorts.wdpromedia.com/resize/mwImage/1/630/354/90/wdpromedia.disney.go.com/media/wdpro-assets/parks-and-tickets/attractions/animal-kingdom/expedition-everest/expedition-everest-day-00.jpg?17072014122508"),
                    Uri.parse("https://lh6.googleusercontent.com/-SQ6T1Ure6l8/VGLaTg2iGuI/AAAAAAAAACo/m6_RkTW2G1o/w600-no/IMG_20140201_082851.jpg"),
                    new LatLng(-33.8723, 151.19896),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Gallery of Arts and History",
                    "Enter the colorful stained-glass doors and be dazzled by displays of traditional textiles, jewelry and body art. Visit the stunning exhibit “Moroccan Style: The Art of Personal Adornment” and see how the unparalleled artistry and craftsmanship of Moroccan decorative arts are a visual representation of cultural identity.",
                    "\n\nEnter the colorful stained-glass doors and be dazzled by displays of traditional textiles, jewelry and body art. \n\nVisit the stunning exhibit “Moroccan Style: The Art of Personal Adornment” and see how the unparalleled artistry and craftsmanship of Moroccan decorative arts are a visual representation of cultural identity. \n\nDiscover the Fantasia, an elaborate equestrian event where rider and steed alike are dressed to impress. See traditional costumes and learn about the ritual of henna tattoos as well as the meaning of the “hamsa,” the palm-shaped symbol thought to ward off the Evil Eye. And, of course, behold those Berber carpets!",
                    Uri.parse("https://secure.parksandresorts.wdpromedia.com/resize/mwImage/1/630/354/90/wdpromedia.disney.go.com/media/wdpro-assets/parks-and-tickets/attractions/epcot/gallery-of-arts-and-history/gallery-arts-and-history-00.jpg?08102012055535"),
                    Uri.parse("https://lh6.googleusercontent.com/-sjY_xlEOic4/VHe9-I4DD9I/AAAAAAAAAFI/Mt0VnjU7SxQ/w600-no/IMG_20141124_144008.jpg"),
                    new LatLng(-33.89102, 151.277726),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Gorillas - Disney Animals",
                    "Honor our troops of western lowland gorillas—and welcome the 2 newest recruits! Guests can see our growing family (troop) of western lowland gorillas (Gorilla gorilla gorilla) on the Pangani Forest Exploration Trail at Disney's Animal Kingdom park.",
                    "\n\nHonor our troops of western lowland gorillas—and welcome the 2 newest recruits! \n\nGuests can see our growing family (troop) of western lowland gorillas (Gorilla gorilla gorilla) on the Pangani Forest Exploration Trail at Disney's Animal Kingdom park.",
                    Uri.parse("https://secure.parksandresorts.wdpromedia.com/resize/mwImage/1/630/354/90/wdpromedia.disney.go.com/media/wdpro-assets/parks-and-tickets/attractions/animal-kingdom/disney-animals/disney-animals-gorillas/disney-animals-gorillas-00.jpg?10112014091058"),
                    Uri.parse("https://lh3.googleusercontent.com/-6_Ioko2ysgU/VHva2PjmRCI/AAAAAAAAAGM/cHjJC7ney4Q/w500-no/PC190054.JPG"),
                    new LatLng(-33.843333, 151.241111),
                    CITY_SYDNEY
            ));
            add(new Attraction(
                    "Gran Fiesta Tour Starring the Three Caballeros",
                    "¿Dónde Está Donald Duck? Donald’s disappeared, and it’s up to José Carioca and Panchito to find him.",
                    "\n\n¿Dónde Está Donald Duck? Donald’s disappeared, and it’s up to José Carioca and Panchito to find him. \n\nFloat along to live-action footage of the people and places of Mexico superimposed with animation inspired by the 1944 Disney film The Three Caballeros. \n\nAnd join Panchito, the Mexican charro rooster, and José Carioca, the Brazilian parrot, for hilarity and hijinks as they search for their wayward friend throughout this fun-filled ride for all ages. \n\nWill they find him in time for the big finale in Mexico City?",
                    Uri.parse("https://secure.parksandresorts.wdpromedia.com/resize/mwImage/1/630/354/90/wdpromedia.disney.go.com/media/wdpro-assets/parks-and-tickets/attractions/epcot/gran-fiesta-tour-starring-the-three-caballeros/gran-fiesta-tour-starring-three-caballeros-00.jpg?17072014101803"),
                    Uri.parse("https://lh3.googleusercontent.com/-EFEw6s7mT6I/VGLkCH4Xt4I/AAAAAAAAADY/ZlznhaQvb8E/w600-no/DSC_2775.JPG"),
                    new LatLng(-33.858667, 151.214028),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "The Great Movie Ride",
                    "Relive some of the greatest movie moments in history during a tram ride that puts you in the middle of the magic. ",
                    "\n\nRelive some of the greatest movie moments in history during a tram ride that puts you in the middle of the magic.\n\nStroll onto a soundstage designed to recall 1930s-era Hollywood and board a tram for a captivating tour of some of Tinseltown’s greatest film scenes. \n\nGlide beneath a flashing movie marquee and cross over into a world that could only exist in the movies.",
                    Uri.parse("https://secure.parksandresorts.wdpromedia.com/resize/mwImage/1/630/354/90/wdpromedia.disney.go.com/media/wdpro-assets/parks-and-tickets/attractions/hollywood-studios/the-great-movie-ride/great-movie-ride-00.jpg?18072014120537"),
                    Uri.parse("https://lh4.googleusercontent.com/-ch9Kk-7pD68/VGLkCNh5niI/AAAAAAAAADc/ztxkRHWX-po/w600-no/DSC_2739.JPG"),
                    new LatLng(-33.852222, 151.210556),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Habitat Habit!",
                    "Stroll along a picturesque wildlife path, home to exhibits on animal conservation. This informative self-guided tour sheds light on what animals need to survive both in the wild and at home.",
                    "\n\nStroll along a picturesque wildlife path, home to exhibits on animal conservation. \n\nThis informative self-guided tour sheds light on what animals need to survive both in the wild and at home.\n\nDuring your visit, enjoy the antics of one of the world’s most endangered primates—the tiny monkeys known as cotton-top tamarins. \n\nHailing from South America, these entertaining and adorable primates are named for the long, flowing white hair that fans from their head",
                    Uri.parse("https://secure.parksandresorts.wdpromedia.com/resize/mwImage/1/630/354/90/wdpromedia.disney.go.com/media/wdpro-assets/parks-and-tickets/attractions/animal-kingdom/habitat-habit/habitat-habit-00.jpg?14112014102234"),
                    Uri.parse("https://lh6.googleusercontent.com/-SQ6T1Ure6l8/VGLaTg2iGuI/AAAAAAAAACo/m6_RkTW2G1o/w600-no/IMG_20140201_082851.jpg"),
                    new LatLng(-33.8723, 151.19896),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Haunted Mansion",
                    "Edge into a shadowy foyer and climb aboard a gloomy Doom Buggy for a supernatural journey through a labyrinth of haunted chambers. Glide past a casket-filled conservatory, a chilling séance room and a ghostly graveyard of singing specters as you attempt to find your way out.",
                    "\n\nEdge into a shadowy foyer and climb aboard a gloomy Doom Buggy for a supernatural journey through a labyrinth of haunted chambers. \n\nGlide past a casket-filled conservatory, a chilling séance room and a ghostly graveyard of singing specters as you attempt to find your way out.\n\n Blending giggling ghouls with things that go bump in the night, this classic attraction promises to send chills up and down your shivering spine.",
                    Uri.parse("https://secure.parksandresorts.wdpromedia.com/resize/mwImage/1/630/354/90/wdpromedia.disney.go.com/media/wdpro-assets/parks-and-tickets/attractions/magic-kingdom/the-haunted-mansion/haunted-mansion-00.jpg?29052012064128"),
                    Uri.parse("https://lh6.googleusercontent.com/-sjY_xlEOic4/VHe9-I4DD9I/AAAAAAAAAFI/Mt0VnjU7SxQ/w600-no/IMG_20141124_144008.jpg"),
                    new LatLng(-33.89102, 151.277726),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Honey, I Shrunk the Kids Movie Set Adventure",
                    "Discover what it’s like to be the size of a bug at this large-scale, backyard-themed play space. Climb enormous anthills and scale sprawling spider webs. Avoid drips from a towering garden hose and explore a maze tunnel. Slide down a roll of film and sit atop an ant. It’s a brand new world at this meticulously detailed, gargantuan play spot.",
                    "\n\nDiscover what it’s like to be the size of a bug at this large-scale, backyard-themed play space. \n\nClimb enormous anthills and scale sprawling spider webs. Avoid drips from a towering garden hose and explore a maze tunnel. \n\nSlide down a roll of film and sit atop an ant. It’s a brand new world at this meticulously detailed, gargantuan play spot.",
                    Uri.parse("https://secure.parksandresorts.wdpromedia.com/resize/mwImage/1/630/354/90/wdpromedia.disney.go.com/media/wdpro-assets/parks-and-tickets/attractions/hollywood-studios/honey-i-shrunk-the-kids-movie-set-adventure/honey-i-shrunk-the-kids-movie-set-adventure-00.jpg?18072014121932"),
                    Uri.parse("https://lh3.googleusercontent.com/-6_Ioko2ysgU/VHva2PjmRCI/AAAAAAAAAGM/cHjJC7ney4Q/w500-no/PC190054.JPG"),
                    new LatLng(-33.843333, 151.241111),
                    CITY_SYDNEY
            ));
            add(new Attraction(
                    "House of the Whispering Willows",
                    "Rally the troops to see these one-third-scale reproductions of the famed Terracotta Army of Qin Shi Huang.",
                    "\n\nRally the troops to see these one-third-scale reproductions of the famed Terracotta Army of Qin Shi Huang. \n\nTomb Warriors: Guardian Spirits of Ancient China lines up row after row of stalwart soldiers, replicas of those buried with the Qin Dynasty emperor in 209–210 BC to protect him from the evil spirits of the underworld. \n\nMarvel at the astounding detail and realism of these 197 men—almost every face has unique features and its own distinct expression.",
                    Uri.parse("https://secure.parksandresorts.wdpromedia.com/resize/mwImage/1/630/354/90/wdpromedia.disney.go.com/media/wdpro-assets/parks-and-tickets/attractions/epcot/house-of-the-whispering-willows-gallery/house-of-the-whispering-willows-gallery-00.jpg?17072014102820"),
                    Uri.parse("https://lh3.googleusercontent.com/-EFEw6s7mT6I/VGLkCH4Xt4I/AAAAAAAAADY/ZlznhaQvb8E/w600-no/DSC_2775.JPG"),
                    new LatLng(-33.858667, 151.214028),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Impressions de France",
                    "Enter the Palais du Cinéma and be swept away to a land where beauty abounds and fairy tales were born. As you listen to the stirring musical score, it becomes clear why France is the muse of so many writers, artists and hopeless romantics. Be transported to another time and place, a land of princesses and enchanted castles, as stunning visuals of the Loire Valley and its magnificent chateaus appear before you in 200-degree widescreen view.",
                    "\n\nEnter the Palais du Cinéma and be swept away to a land where beauty abounds and fairy tales were born. \n\nAs you listen to the stirring musical score, it becomes clear why France is the muse of so many writers, artists and hopeless romantics. \n\nBe transported to another time and place, a land of princesses and enchanted castles, as stunning visuals of the Loire Valley and its magnificent chateaus appear before you in 200-degree widescreen view.",
                    Uri.parse("https://secure.parksandresorts.wdpromedia.com/resize/mwImage/1/630/354/90/wdpromedia.disney.go.com/media/wdpro-assets/parks-and-tickets/attractions/epcot/impressions-de-france/impressions-de-france-00.jpg?17072014164654"),
                    Uri.parse("https://lh4.googleusercontent.com/-ch9Kk-7pD68/VGLkCNh5niI/AAAAAAAAADc/ztxkRHWX-po/w600-no/DSC_2739.JPG"),
                    new LatLng(-33.852222, 151.210556),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "It's a Small World",
                    "Sing along to the classic anthem of world peace during a delightful musical boat tour hosted by the children of the world. From a colorful dock, climb aboard a cozy boat and set sail along the Seven Seaways Waterway on a 10-minute journey.",
                    "\n\nSing along to the classic anthem of world peace during a delightful musical boat tour hosted by the children of the world. \n\nFrom a colorful dock, climb aboard a cozy boat and set sail along the Seven Seaways Waterway on a 10-minute journey.\n\nAmid a vibrant, multi-colored backdrop exquisitely crafted out of papier-mâché, glitter and fabric, behold a cast of almost 300 traditionally dressed, dimple darlings from nearly every corner of the globe sing a simple song in their native language about universal harmony and dance. \n\nTravel to all 7 continents and, by journey’s end, see for yourself that it truly is a small world after all",
                    Uri.parse("https://secure.parksandresorts.wdpromedia.com/resize/mwImage/1/630/354/90/wdpromedia.disney.go.com/media/wdpro-assets/parks-and-tickets/attractions/magic-kingdom/its-a-small-world/its-a-small-world-00.jpg?18072014074154"),
                    Uri.parse("https://lh6.googleusercontent.com/-SQ6T1Ure6l8/VGLaTg2iGuI/AAAAAAAAACo/m6_RkTW2G1o/w600-no/IMG_20140201_082851.jpg"),
                    new LatLng(-33.8723, 151.19896),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "It's Tough to be a Bug",
                    "See the world from a bug’s point of view with a little help from Flik inside the great Tree of Life.  Meander along a winding pathway—past tangled roots, unfurled branches and detailed animal carvings—to the base of the Tree of Life, the symbol of Disney’s Animal Kingdom park. Venture inside and receive a pair of 3D glasses before taking a seat inside the approximate 430-seat Tree of Life Repertory Theatre.",
                    "\n\nSee the world from a bug’s point of view with a little help from Flik inside the great Tree of Life.  \n\nMeander along a winding pathway—past tangled roots, unfurled branches and detailed animal carvings—to the base of the Tree of Life, the symbol of Disney’s Animal Kingdom park. \n\nVenture inside and receive a pair of 3D glasses before taking a seat inside the approximate 430-seat Tree of Life Repertory Theatre.",
                    Uri.parse("https://secure.parksandresorts.wdpromedia.com/resize/mwImage/1/630/354/90/wdpromedia.disney.go.com/media/wdpro-assets/parks-and-tickets/attractions/animal-kingdom/its-tough-to-be-a-bug/its-tough-to-be-a-bug-00.jpg?18072014100402"),
                    Uri.parse("https://lh6.googleusercontent.com/-sjY_xlEOic4/VHe9-I4DD9I/AAAAAAAAAFI/Mt0VnjU7SxQ/w600-no/IMG_20141124_144008.jpg"),
                    new LatLng(-33.89102, 151.277726),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Jungle Cruise",
                    "Embark on a cruise where hippos, elephants and maybe even a headhunter await your arrival.  Trek to a forgotten tropical jungle outpost—home to suspended cargo nets, wooden crates and lanterns, and faded marquee signs—and board a canopied tramp steamer for a tongue-in-cheek adventure led by a trusty skipper through some of the world’s most treacherous rivers.",
                    "\n\nEmbark on a cruise where hippos, elephants and maybe even a headhunter await your arrival.  \n\nTrek to a forgotten tropical jungle outpost—home to suspended cargo nets, wooden crates and lanterns, and faded marquee signs—and board a canopied tramp steamer for a tongue-in-cheek adventure led by a trusty skipper through some of the world’s most treacherous rivers.",
                    Uri.parse("https://secure.parksandresorts.wdpromedia.com/resize/mwImage/1/630/354/90/wdpromedia.disney.go.com/media/wdpro-assets/parks-and-tickets/attractions/magic-kingdom/jungle-cruise/jungle-cruise-00.jpg?18072014080451"),
                    Uri.parse("https://lh3.googleusercontent.com/-6_Ioko2ysgU/VHva2PjmRCI/AAAAAAAAAGM/cHjJC7ney4Q/w500-no/PC190054.JPG"),
                    new LatLng(-33.843333, 151.241111),
                    CITY_SYDNEY
            ));
            add(new Attraction(
                    "Kiliminjaro Safaris",
                    "Glimpse real African animals in their natural habitats during an 18-minute expedition into the Harambe Wildlife Reserve.",
                    "\n\nGlimpse real African animals in their natural habitats during an 18-minute expedition into the Harambe Wildlife Reserve. \n\nTraipse along a picturesque twisting path amid a lush garden gateway and make your way to the rendezvous point of Kilimanjaro Safaris expedition, the touring company for your adventure into the wilds. \n\nFeaturing picturesque open plains, shady forest landscapes and rocky wetlands, the 110-acre Harambe Wildlife Reserve is a spectacular sanctuary dedicated to the protection of African animals.",
                    Uri.parse("https://secure.parksandresorts.wdpromedia.com/resize/mwImage/1/630/354/90/wdpromedia.disney.go.com/media/wdpro-assets/parks-and-tickets/attractions/animal-kingdom/kilimanjaro-safaris/kilimanjaro-safaris-00.jpg?18072014085834"),
                    Uri.parse("https://lh3.googleusercontent.com/-EFEw6s7mT6I/VGLkCH4Xt4I/AAAAAAAAADY/ZlznhaQvb8E/w600-no/DSC_2775.JPG"),
                    new LatLng(-33.858667, 151.214028),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Liberty Square Riverboat",
                    "Take off on a scenic half-mile adventure into the wilds of old America aboard a steam-powered paddler wheeler. Board the Colonial-American-inspired, 3-tiered Liberty Belle riverboat nestled in the heart of Liberty Square and embark on a relaxing journey around Tom Sawyer Island along the Rivers of America.",
                    "\n\nTake off on a scenic half-mile adventure into the wilds of old America aboard a steam-powered paddler wheeler. \n\nBoard the Colonial-American-inspired, 3-tiered Liberty Belle riverboat nestled in the heart of Liberty Square and embark on a relaxing journey around Tom Sawyer Island along the Rivers of America.",
                    Uri.parse("https://secure.parksandresorts.wdpromedia.com/resize/mwImage/1/630/354/90/wdpromedia.disney.go.com/media/wdpro-assets/parks-and-tickets/attractions/magic-kingdom/liberty-square-riverboat/liberty-square-riverboat-00.jpg?18072014081813"),
                    Uri.parse("https://lh4.googleusercontent.com/-ch9Kk-7pD68/VGLkCNh5niI/AAAAAAAAADc/ztxkRHWX-po/w600-no/DSC_2739.JPG"),
                    new LatLng(-33.852222, 151.210556),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Lions - Disney Animals",
                    "Meet a real Lion King—and his queens—in the expansive wilds of a Disney African savanna.",
                    "\n\nMeet a real Lion King—and his queens—in the expansive wilds of a Disney African savanna. \n\nGuests can visit our regal African lions (Panthera leo) on the grasslands of the Kilimanjaro Safaris attraction at Disney's Animal Kingdom park. \n\nAfrican lions live on the flat, grassy savannas of Africa—from the sub-Sahara to the Serengeti plains and all the way to South Africa. \n\nThough lions have been called “King of the Jungle,” they don’t live in jungles or rainforests, but instead are found in dry forests, grasslands and desert habitats.",
                    Uri.parse("https://secure.parksandresorts.wdpromedia.com/resize/mwImage/1/630/354/90/wdpromedia.disney.go.com/media/wdpro-assets/parks-and-tickets/attractions/animal-kingdom/disney-animals/disney-animals-lions/disney-animals-lions-00-b.jpg?10112014081941"),
                    Uri.parse("https://lh6.googleusercontent.com/-SQ6T1Ure6l8/VGLaTg2iGuI/AAAAAAAAACo/m6_RkTW2G1o/w600-no/IMG_20140201_082851.jpg"),
                    new LatLng(-33.8723, 151.19896),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Living with the Land",
                    "Gain a newfound appreciation for where your food comes from on this cruise through the living laboratories of Epcot.",
                    "Gain a newfound appreciation for where your food comes from on this cruise through the living laboratories of Epcot. Many of your favorite foodstuffs—chocolate, coffee, vanilla, tomatoes and rice, to name a few—grow on trees, vines and now even in soil-less environments. See firsthand how Disney’s horticulturalists are using innovative growing techniques and cross-breeding high-yield crops with the goal of sustaining our growing global population.",
                    Uri.parse("https://secure.parksandresorts.wdpromedia.com/resize/mwImage/1/630/354/90/wdpromedia.disney.go.com/media/wdpro-assets/parks-and-tickets/attractions/epcot/living-with-the-land/living-with-the-land-00.jpg?17072014124949"),
                    Uri.parse("https://lh6.googleusercontent.com/-sjY_xlEOic4/VHe9-I4DD9I/AAAAAAAAAFI/Mt0VnjU7SxQ/w600-no/IMG_20141124_144008.jpg"),
                    new LatLng(-33.89102, 151.277726),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Mad Tea Party",
                    "Pour yourself into an oversized teacup and twirl quickly or slowly amid a menagerie of color and sound. Celebrate your “un-birthday” in Wonderland as you sail back and forth around a towering teapot beneath a windswept party of paper lanterns, as festive music fills the air.",
                    "\n\nPour yourself into an oversized teacup and twirl quickly or slowly amid a menagerie of color and sound. \n\nCelebrate your “un-birthday” in Wonderland as you sail back and forth around a towering teapot beneath a windswept party of paper lanterns, as festive music fills the air.",
                    Uri.parse("https://secure.parksandresorts.wdpromedia.com/resize/mwImage/1/630/354/90/wdpromedia.disney.go.com/media/wdpro-assets/parks-and-tickets/attractions/magic-kingdom/mad-tea-party/mad-tea-party-00.jpg?18072014082805"),
                    Uri.parse("https://lh3.googleusercontent.com/-6_Ioko2ysgU/VHva2PjmRCI/AAAAAAAAAGM/cHjJC7ney4Q/w500-no/PC190054.JPG"),
                    new LatLng(-33.843333, 151.241111),
                    CITY_SYDNEY
            ));
            add(new Attraction(
                    "The Magic Carpets of Aladdin",
                    "Take off on a magical ride above a bustling bazaar aboard an enchanted carpet that you control. Climb aboard a colorful, 4-passenger vehicle and take off into the air as the strings of Middle Eastern music play overhead.",
                    "\n\nTake off on a magical ride above a bustling bazaar aboard an enchanted carpet that you control. \n\nClimb aboard a colorful, 4-passenger vehicle and take off into the air as the strings of Middle Eastern music play overhead.\n\nRotate around a giant genie bottle and magic lamp—bobbing up and down, forward and back—as the lush flora and weathered walls of the bazaar whirl by below. \n\nBut be on the lookout: An unruly camel who likes to occasionally “spit” water at flying carpets has been seen nearby!",
                    Uri.parse("https://secure.parksandresorts.wdpromedia.com/resize/mwImage/1/630/354/90/wdpromedia.disney.go.com/media/wdpro-assets/parks-and-tickets/attractions/magic-kingdom/the-magic-carpets-of-aladdin/magic-carpets-of-aladdin-00.jpg?18072014100724"),
                    Uri.parse("https://lh3.googleusercontent.com/-EFEw6s7mT6I/VGLkCH4Xt4I/AAAAAAAAADY/ZlznhaQvb8E/w600-no/DSC_2775.JPG"),
                    new LatLng(-33.858667, 151.214028),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Maharajah Jungle Trek",
                    "Venture into the mystical Anandapur Royal Forest, a tropical paradise of trees, ruins and wild animals. Legend has it the area was at one time the hunting ground of wealthy maharajahs; today, it exists as a preserve that you can explore.",
                    "\n\nVenture into the mystical Anandapur Royal Forest, a tropical paradise of trees, ruins and wild animals. \n\nLegend has it the area was at one time the hunting ground of wealthy maharajahs; today, it exists as a preserve that you can explore.",
                    Uri.parse("https://secure.parksandresorts.wdpromedia.com/resize/mwImage/1/630/354/90/wdpromedia.disney.go.com/media/wdpro-assets/parks-and-tickets/attractions/animal-kingdom/maharajah-jungle-trek/maharajah-jungle-trek-00.jpg?18072014090146"),
                    Uri.parse("https://lh4.googleusercontent.com/-ch9Kk-7pD68/VGLkCNh5niI/AAAAAAAAADc/ztxkRHWX-po/w600-no/DSC_2739.JPG"),
                    new LatLng(-33.852222, 151.210556),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "The Many Adventures of Winnie the Pooh",
                    "Glide and bounce and swirl through some of the most popular scenes and settings of Winnie the Pooh. Board a giant Hunny Pot and get lost in the pages of A.A. Milne’s classic tales, as you journey to Hundred Acre Wood.",
                    "\n\nGlide and bounce and swirl through some of the most popular scenes and settings of Winnie the Pooh. \n\nBoard a giant Hunny Pot and get lost in the pages of A.A. Milne’s classic tales, as you journey to Hundred Acre Wood.",
                    Uri.parse("https://secure.parksandresorts.wdpromedia.com/resize/mwImage/1/630/354/90/wdpromedia.disney.go.com/media/wdpro-assets/parks-and-tickets/attractions/magic-kingdom/the-many-adventures-of-winnie-the-pooh/many-adventures-of-winnie-the-pooh-00.jpg?18072014112036"),
                    Uri.parse("https://lh6.googleusercontent.com/-SQ6T1Ure6l8/VGLaTg2iGuI/AAAAAAAAACo/m6_RkTW2G1o/w600-no/IMG_20140201_082851.jpg"),
                    new LatLng(-33.8723, 151.19896),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Marketplace Carousel",
                    "Little ones and the young at heart can enjoy an old-fashioned carousel ride atop any of 16 handcrafted horses.",
                    "\n\nLittle ones and the young at heart can enjoy an old-fashioned carousel ride atop any of 16 handcrafted horses. \n\nChoose from steeds that jump or rock, or take a more sedate ride in one of 2 handsome carriages. \n\nA spinning teacup adds a touch of Disney-style whimsy to this already-delightful jaunt sure to evoke nostalgia in bigger Guests and create everlasting memories for first-time riders.",
                    Uri.parse("https://secure.parksandresorts.wdpromedia.com/resize/mwImage/1/630/354/90/wdpromedia.disney.go.com/media/wdpro-assets/parks-and-tickets/attractions/downtown-disney/classic-carousel/disney-springs-marketplace-carousel-00.jpg?13012016101303"),
                    Uri.parse("https://lh6.googleusercontent.com/-sjY_xlEOic4/VHe9-I4DD9I/AAAAAAAAAFI/Mt0VnjU7SxQ/w600-no/IMG_20141124_144008.jpg"),
                    new LatLng(-33.89102, 151.277726),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Taronga Zoo",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam eros velit, faucibus in mi in, accumsan eleifend magna. Fusce efficitur volutpat leo nec finibus. Vivamus luctus quis dolor ac interdum.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam eros velit, faucibus in mi in, accumsan eleifend magna. Fusce efficitur volutpat leo nec finibus. Vivamus luctus quis dolor ac interdum. Donec iaculis, orci quis semper vulputate, tortor nisi porttitor tortor, at pretium ante quam ut odio. Donec fringilla sapien et dolor pharetra ultrices. Aenean faucibus felis non vulputate iaculis.\n\nEtiam eget dapibus ligula. Nunc facilisis dignissim tortor et elementum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Aliquam condimentum pellentesque mollis. Aliquam finibus urna ipsum, sed accumsan ante blandit quis. Vestibulum vel lacinia ligula. Nunc justo ex, volutpat nec justo ut, efficitur gravida lectus. Mauris cursus dui libero, vel tristique purus laoreet non.\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse ultrices ullamcorper est, at consequat massa. Nam egestas at urna at pellentesque. Quisque lacus quam, efficitur vel erat eget, placerat feugiat eros. Mauris.",
                    Uri.parse("https://lh6.googleusercontent.com/-kypwDfnk674/VGLWpQPm4VI/AAAAAAAAAB0/SrfL0fE9DnE/w500-no/OI000020_2.jpg"),
                    Uri.parse("https://lh3.googleusercontent.com/-6_Ioko2ysgU/VHva2PjmRCI/AAAAAAAAAGM/cHjJC7ney4Q/w500-no/PC190054.JPG"),
                    new LatLng(-33.843333, 151.241111),
                    CITY_SYDNEY
            ));
            add(new Attraction(
                    "Sydney Opera House",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vitae bibendum justo, vitae cursus velit. Suspendisse potenti.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vitae bibendum justo, vitae cursus velit. Suspendisse potenti. Suspendisse scelerisque risus justo, non tincidunt nibh blandit et. Vivamus elit lacus, luctus nec erat in, pharetra semper turpis. Quisque viverra nulla ligula, non pulvinar ante dictum sit amet. Vestibulum aliquet tortor mauris, vel suscipit nisl malesuada eget. Aliquam maximus dictum euismod. Maecenas leo quam, volutpat id diam eget, placerat fringilla ipsum. Nam pretium vehicula augue quis euismod.\n\nNam sed blandit magna. Vestibulum a fermentum arcu. Vestibulum et ligula at nisi luctus facilisis. Proin fermentum enim a nibh commodo finibus. Suspendisse justo elit, vulputate ut ipsum at, pellentesque auctor massa. Praesent vestibulum erat interdum imperdiet dapibus. In hac habitasse platea dictumst. Proin varius orci vitae tempor vulputate.\n\nEtiam sed mollis orci. Integer et ex sed tortor scelerisque blandit semper id libero. Nulla facilisi. Pellentesque tempor magna eget massa ultrices, et efficitur lectus finibus.",
                    Uri.parse("https://lh5.googleusercontent.com/-7fb5ybQhUbo/VGLWjIL4RmI/AAAAAAAAACM/2jLe_msj_tk/w600-no/IMG_0049.JPG"),
                    Uri.parse("https://lh3.googleusercontent.com/-EFEw6s7mT6I/VGLkCH4Xt4I/AAAAAAAAADY/ZlznhaQvb8E/w600-no/DSC_2775.JPG"),
                    new LatLng(-33.858667, 151.214028),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Sydney Harbour Bridge",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris ut nulla neque. Morbi nec felis vel neque rhoncus malesuada.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris ut nulla neque. Morbi nec felis vel neque rhoncus malesuada. Mauris non nisi est. Nunc in ipsum euismod, suscipit dolor eget, efficitur nisi. Integer venenatis mauris mauris, quis luctus risus pellentesque a. Duis tempus est at ligula vehicula fermentum. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.\n\nNam ut sodales nibh, euismod aliquet lectus. Curabitur ornare dictum nisi, at faucibus magna. Morbi tempus nibh sed sodales volutpat. Etiam sodales, turpis sit amet porttitor tristique, libero libero faucibus est, viverra dictum risus ipsum vel augue. Nulla dolor magna, iaculis ac ornare id, fermentum eget massa. Sed mattis, odio nec sodales vehicula, neque metus ullamcorper nulla, sit amet ullamcorper risus lectus a ipsum. Curabitur venenatis feugiat quam nec elementum. Curabitur a interdum urna. Curabitur tincidunt tortor eget neque condimentum blandit. Etiam imperdiet, enim nec blandit convallis, nunc augue.",
                    Uri.parse("https://lh6.googleusercontent.com/-ORRJtfLQlaw/VGLmQPv3n8I/AAAAAAAAAD8/2TzSCCPzl9k/w600-no/DSC04114.JPG"),
                    Uri.parse("https://lh4.googleusercontent.com/-ch9Kk-7pD68/VGLkCNh5niI/AAAAAAAAADc/ztxkRHWX-po/w600-no/DSC_2739.JPG"),
                    new LatLng(-33.852222, 151.210556),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Darling Harbour",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam ut dui in ipsum suscipit aliquet pretium aliquet odio.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam ut dui in ipsum suscipit aliquet pretium aliquet odio. Nam posuere nunc sed risus molestie varius. Suspendisse posuere faucibus urna, id vestibulum ante iaculis et. Vivamus placerat suscipit sem, a tempor nunc vehicula ac. Ut libero velit, dapibus sit amet euismod vel, dignissim a nisl.\n\nDonec non dui non felis laoreet malesuada. Fusce ac metus ultrices, fermentum felis quis, varius velit. Donec ac felis semper, scelerisque diam sed, dignissim risus. Maecenas vel semper sapien. Fusce euismod justo posuere, efficitur risus tincidunt, congue tellus. In hac habitasse platea dictumst. Sed lobortis risus consequat vehicula facilisis.\n\nIn hendrerit, neque in gravida rutrum, purus enim aliquet lectus, sit amet vulputate tortor lacus at sem. Aenean lorem metus, finibus rhoncus eros at, ullamcorper fringilla velit. Nulla vitae porttitor metus, quis gravida lectus. In rhoncus, diam a elementum luctus, erat nisi tempus ex, in porta est.",
                    Uri.parse("https://lh5.googleusercontent.com/-qX43g6s92LY/VGLaTT3N35I/AAAAAAAAAC8/BbueQmch0Rw/w600-no/68001.jpg"),
                    Uri.parse("https://lh6.googleusercontent.com/-SQ6T1Ure6l8/VGLaTg2iGuI/AAAAAAAAACo/m6_RkTW2G1o/w600-no/IMG_20140201_082851.jpg"),
                    new LatLng(-33.8723, 151.19896),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Bondi Beach",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam et nunc in leo laoreet placerat. Interdum et malesuada fames ac ante ipsum primis in faucibus.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam et nunc in leo laoreet placerat. Interdum et malesuada fames ac ante ipsum primis in faucibus. Proin vestibulum laoreet odio nec posuere. Quisque ante arcu, malesuada vitae velit a, auctor tincidunt ante. Mauris varius eros eros, eget scelerisque mi scelerisque ut. Donec vehicula vitae urna ac hendrerit. Phasellus egestas risus nec euismod auctor.\n\nInteger fermentum velit et dolor varius sagittis. Proin et viverra sapien. Nulla aliquet ante et hendrerit egestas. Duis vulputate libero in nisi gravida cursus. Praesent laoreet nec dolor non iaculis. Aliquam eleifend ultricies ipsum, eu pellentesque libero rutrum non. Mauris et purus erat. Nullam semper mi id tincidunt viverra. Ut porta sem congue lectus luctus ultricies. Suspendisse iaculis lacinia nibh, eu accumsan magna volutpat vel. Sed id interdum mi, vel sollicitudin elit. Fusce facilisis elementum gravida. Duis at volutpat odio. Integer porta convallis tincidunt. Donec aliquam, leo ut.",
                    Uri.parse("https://lh4.googleusercontent.com/-wbNgVdUkBiE/VHe99hGVtNI/AAAAAAAAAFY/fAHfhchNLJw/w600-no/IMG_20141124_143747.jpg"),
                    Uri.parse("https://lh6.googleusercontent.com/-sjY_xlEOic4/VHe9-I4DD9I/AAAAAAAAAFI/Mt0VnjU7SxQ/w600-no/IMG_20141124_144008.jpg"),
                    new LatLng(-33.89102, 151.277726),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Taronga Zoo",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam eros velit, faucibus in mi in, accumsan eleifend magna. Fusce efficitur volutpat leo nec finibus. Vivamus luctus quis dolor ac interdum.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam eros velit, faucibus in mi in, accumsan eleifend magna. Fusce efficitur volutpat leo nec finibus. Vivamus luctus quis dolor ac interdum. Donec iaculis, orci quis semper vulputate, tortor nisi porttitor tortor, at pretium ante quam ut odio. Donec fringilla sapien et dolor pharetra ultrices. Aenean faucibus felis non vulputate iaculis.\n\nEtiam eget dapibus ligula. Nunc facilisis dignissim tortor et elementum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Aliquam condimentum pellentesque mollis. Aliquam finibus urna ipsum, sed accumsan ante blandit quis. Vestibulum vel lacinia ligula. Nunc justo ex, volutpat nec justo ut, efficitur gravida lectus. Mauris cursus dui libero, vel tristique purus laoreet non.\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse ultrices ullamcorper est, at consequat massa. Nam egestas at urna at pellentesque. Quisque lacus quam, efficitur vel erat eget, placerat feugiat eros. Mauris.",
                    Uri.parse("https://lh6.googleusercontent.com/-kypwDfnk674/VGLWpQPm4VI/AAAAAAAAAB0/SrfL0fE9DnE/w500-no/OI000020_2.jpg"),
                    Uri.parse("https://lh3.googleusercontent.com/-6_Ioko2ysgU/VHva2PjmRCI/AAAAAAAAAGM/cHjJC7ney4Q/w500-no/PC190054.JPG"),
                    new LatLng(-33.843333, 151.241111),
                    CITY_SYDNEY
            ));
            add(new Attraction(
                    "Sydney Opera House",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vitae bibendum justo, vitae cursus velit. Suspendisse potenti.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vitae bibendum justo, vitae cursus velit. Suspendisse potenti. Suspendisse scelerisque risus justo, non tincidunt nibh blandit et. Vivamus elit lacus, luctus nec erat in, pharetra semper turpis. Quisque viverra nulla ligula, non pulvinar ante dictum sit amet. Vestibulum aliquet tortor mauris, vel suscipit nisl malesuada eget. Aliquam maximus dictum euismod. Maecenas leo quam, volutpat id diam eget, placerat fringilla ipsum. Nam pretium vehicula augue quis euismod.\n\nNam sed blandit magna. Vestibulum a fermentum arcu. Vestibulum et ligula at nisi luctus facilisis. Proin fermentum enim a nibh commodo finibus. Suspendisse justo elit, vulputate ut ipsum at, pellentesque auctor massa. Praesent vestibulum erat interdum imperdiet dapibus. In hac habitasse platea dictumst. Proin varius orci vitae tempor vulputate.\n\nEtiam sed mollis orci. Integer et ex sed tortor scelerisque blandit semper id libero. Nulla facilisi. Pellentesque tempor magna eget massa ultrices, et efficitur lectus finibus.",
                    Uri.parse("https://lh5.googleusercontent.com/-7fb5ybQhUbo/VGLWjIL4RmI/AAAAAAAAACM/2jLe_msj_tk/w600-no/IMG_0049.JPG"),
                    Uri.parse("https://lh3.googleusercontent.com/-EFEw6s7mT6I/VGLkCH4Xt4I/AAAAAAAAADY/ZlznhaQvb8E/w600-no/DSC_2775.JPG"),
                    new LatLng(-33.858667, 151.214028),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Sydney Harbour Bridge",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris ut nulla neque. Morbi nec felis vel neque rhoncus malesuada.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris ut nulla neque. Morbi nec felis vel neque rhoncus malesuada. Mauris non nisi est. Nunc in ipsum euismod, suscipit dolor eget, efficitur nisi. Integer venenatis mauris mauris, quis luctus risus pellentesque a. Duis tempus est at ligula vehicula fermentum. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.\n\nNam ut sodales nibh, euismod aliquet lectus. Curabitur ornare dictum nisi, at faucibus magna. Morbi tempus nibh sed sodales volutpat. Etiam sodales, turpis sit amet porttitor tristique, libero libero faucibus est, viverra dictum risus ipsum vel augue. Nulla dolor magna, iaculis ac ornare id, fermentum eget massa. Sed mattis, odio nec sodales vehicula, neque metus ullamcorper nulla, sit amet ullamcorper risus lectus a ipsum. Curabitur venenatis feugiat quam nec elementum. Curabitur a interdum urna. Curabitur tincidunt tortor eget neque condimentum blandit. Etiam imperdiet, enim nec blandit convallis, nunc augue.",
                    Uri.parse("https://lh6.googleusercontent.com/-ORRJtfLQlaw/VGLmQPv3n8I/AAAAAAAAAD8/2TzSCCPzl9k/w600-no/DSC04114.JPG"),
                    Uri.parse("https://lh4.googleusercontent.com/-ch9Kk-7pD68/VGLkCNh5niI/AAAAAAAAADc/ztxkRHWX-po/w600-no/DSC_2739.JPG"),
                    new LatLng(-33.852222, 151.210556),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Darling Harbour",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam ut dui in ipsum suscipit aliquet pretium aliquet odio.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam ut dui in ipsum suscipit aliquet pretium aliquet odio. Nam posuere nunc sed risus molestie varius. Suspendisse posuere faucibus urna, id vestibulum ante iaculis et. Vivamus placerat suscipit sem, a tempor nunc vehicula ac. Ut libero velit, dapibus sit amet euismod vel, dignissim a nisl.\n\nDonec non dui non felis laoreet malesuada. Fusce ac metus ultrices, fermentum felis quis, varius velit. Donec ac felis semper, scelerisque diam sed, dignissim risus. Maecenas vel semper sapien. Fusce euismod justo posuere, efficitur risus tincidunt, congue tellus. In hac habitasse platea dictumst. Sed lobortis risus consequat vehicula facilisis.\n\nIn hendrerit, neque in gravida rutrum, purus enim aliquet lectus, sit amet vulputate tortor lacus at sem. Aenean lorem metus, finibus rhoncus eros at, ullamcorper fringilla velit. Nulla vitae porttitor metus, quis gravida lectus. In rhoncus, diam a elementum luctus, erat nisi tempus ex, in porta est.",
                    Uri.parse("https://lh5.googleusercontent.com/-qX43g6s92LY/VGLaTT3N35I/AAAAAAAAAC8/BbueQmch0Rw/w600-no/68001.jpg"),
                    Uri.parse("https://lh6.googleusercontent.com/-SQ6T1Ure6l8/VGLaTg2iGuI/AAAAAAAAACo/m6_RkTW2G1o/w600-no/IMG_20140201_082851.jpg"),
                    new LatLng(-33.8723, 151.19896),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Bondi Beach",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam et nunc in leo laoreet placerat. Interdum et malesuada fames ac ante ipsum primis in faucibus.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam et nunc in leo laoreet placerat. Interdum et malesuada fames ac ante ipsum primis in faucibus. Proin vestibulum laoreet odio nec posuere. Quisque ante arcu, malesuada vitae velit a, auctor tincidunt ante. Mauris varius eros eros, eget scelerisque mi scelerisque ut. Donec vehicula vitae urna ac hendrerit. Phasellus egestas risus nec euismod auctor.\n\nInteger fermentum velit et dolor varius sagittis. Proin et viverra sapien. Nulla aliquet ante et hendrerit egestas. Duis vulputate libero in nisi gravida cursus. Praesent laoreet nec dolor non iaculis. Aliquam eleifend ultricies ipsum, eu pellentesque libero rutrum non. Mauris et purus erat. Nullam semper mi id tincidunt viverra. Ut porta sem congue lectus luctus ultricies. Suspendisse iaculis lacinia nibh, eu accumsan magna volutpat vel. Sed id interdum mi, vel sollicitudin elit. Fusce facilisis elementum gravida. Duis at volutpat odio. Integer porta convallis tincidunt. Donec aliquam, leo ut.",
                    Uri.parse("https://lh4.googleusercontent.com/-wbNgVdUkBiE/VHe99hGVtNI/AAAAAAAAAFY/fAHfhchNLJw/w600-no/IMG_20141124_143747.jpg"),
                    Uri.parse("https://lh6.googleusercontent.com/-sjY_xlEOic4/VHe9-I4DD9I/AAAAAAAAAFI/Mt0VnjU7SxQ/w600-no/IMG_20141124_144008.jpg"),
                    new LatLng(-33.89102, 151.277726),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Taronga Zoo",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam eros velit, faucibus in mi in, accumsan eleifend magna. Fusce efficitur volutpat leo nec finibus. Vivamus luctus quis dolor ac interdum.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam eros velit, faucibus in mi in, accumsan eleifend magna. Fusce efficitur volutpat leo nec finibus. Vivamus luctus quis dolor ac interdum. Donec iaculis, orci quis semper vulputate, tortor nisi porttitor tortor, at pretium ante quam ut odio. Donec fringilla sapien et dolor pharetra ultrices. Aenean faucibus felis non vulputate iaculis.\n\nEtiam eget dapibus ligula. Nunc facilisis dignissim tortor et elementum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Aliquam condimentum pellentesque mollis. Aliquam finibus urna ipsum, sed accumsan ante blandit quis. Vestibulum vel lacinia ligula. Nunc justo ex, volutpat nec justo ut, efficitur gravida lectus. Mauris cursus dui libero, vel tristique purus laoreet non.\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse ultrices ullamcorper est, at consequat massa. Nam egestas at urna at pellentesque. Quisque lacus quam, efficitur vel erat eget, placerat feugiat eros. Mauris.",
                    Uri.parse("https://lh6.googleusercontent.com/-kypwDfnk674/VGLWpQPm4VI/AAAAAAAAAB0/SrfL0fE9DnE/w500-no/OI000020_2.jpg"),
                    Uri.parse("https://lh3.googleusercontent.com/-6_Ioko2ysgU/VHva2PjmRCI/AAAAAAAAAGM/cHjJC7ney4Q/w500-no/PC190054.JPG"),
                    new LatLng(-33.843333, 151.241111),
                    CITY_SYDNEY
            ));
            add(new Attraction(
                    "Sydney Opera House",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vitae bibendum justo, vitae cursus velit. Suspendisse potenti.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vitae bibendum justo, vitae cursus velit. Suspendisse potenti. Suspendisse scelerisque risus justo, non tincidunt nibh blandit et. Vivamus elit lacus, luctus nec erat in, pharetra semper turpis. Quisque viverra nulla ligula, non pulvinar ante dictum sit amet. Vestibulum aliquet tortor mauris, vel suscipit nisl malesuada eget. Aliquam maximus dictum euismod. Maecenas leo quam, volutpat id diam eget, placerat fringilla ipsum. Nam pretium vehicula augue quis euismod.\n\nNam sed blandit magna. Vestibulum a fermentum arcu. Vestibulum et ligula at nisi luctus facilisis. Proin fermentum enim a nibh commodo finibus. Suspendisse justo elit, vulputate ut ipsum at, pellentesque auctor massa. Praesent vestibulum erat interdum imperdiet dapibus. In hac habitasse platea dictumst. Proin varius orci vitae tempor vulputate.\n\nEtiam sed mollis orci. Integer et ex sed tortor scelerisque blandit semper id libero. Nulla facilisi. Pellentesque tempor magna eget massa ultrices, et efficitur lectus finibus.",
                    Uri.parse("https://lh5.googleusercontent.com/-7fb5ybQhUbo/VGLWjIL4RmI/AAAAAAAAACM/2jLe_msj_tk/w600-no/IMG_0049.JPG"),
                    Uri.parse("https://lh3.googleusercontent.com/-EFEw6s7mT6I/VGLkCH4Xt4I/AAAAAAAAADY/ZlznhaQvb8E/w600-no/DSC_2775.JPG"),
                    new LatLng(-33.858667, 151.214028),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Sydney Harbour Bridge",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris ut nulla neque. Morbi nec felis vel neque rhoncus malesuada.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris ut nulla neque. Morbi nec felis vel neque rhoncus malesuada. Mauris non nisi est. Nunc in ipsum euismod, suscipit dolor eget, efficitur nisi. Integer venenatis mauris mauris, quis luctus risus pellentesque a. Duis tempus est at ligula vehicula fermentum. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.\n\nNam ut sodales nibh, euismod aliquet lectus. Curabitur ornare dictum nisi, at faucibus magna. Morbi tempus nibh sed sodales volutpat. Etiam sodales, turpis sit amet porttitor tristique, libero libero faucibus est, viverra dictum risus ipsum vel augue. Nulla dolor magna, iaculis ac ornare id, fermentum eget massa. Sed mattis, odio nec sodales vehicula, neque metus ullamcorper nulla, sit amet ullamcorper risus lectus a ipsum. Curabitur venenatis feugiat quam nec elementum. Curabitur a interdum urna. Curabitur tincidunt tortor eget neque condimentum blandit. Etiam imperdiet, enim nec blandit convallis, nunc augue.",
                    Uri.parse("https://lh6.googleusercontent.com/-ORRJtfLQlaw/VGLmQPv3n8I/AAAAAAAAAD8/2TzSCCPzl9k/w600-no/DSC04114.JPG"),
                    Uri.parse("https://lh4.googleusercontent.com/-ch9Kk-7pD68/VGLkCNh5niI/AAAAAAAAADc/ztxkRHWX-po/w600-no/DSC_2739.JPG"),
                    new LatLng(-33.852222, 151.210556),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Darling Harbour",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam ut dui in ipsum suscipit aliquet pretium aliquet odio.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam ut dui in ipsum suscipit aliquet pretium aliquet odio. Nam posuere nunc sed risus molestie varius. Suspendisse posuere faucibus urna, id vestibulum ante iaculis et. Vivamus placerat suscipit sem, a tempor nunc vehicula ac. Ut libero velit, dapibus sit amet euismod vel, dignissim a nisl.\n\nDonec non dui non felis laoreet malesuada. Fusce ac metus ultrices, fermentum felis quis, varius velit. Donec ac felis semper, scelerisque diam sed, dignissim risus. Maecenas vel semper sapien. Fusce euismod justo posuere, efficitur risus tincidunt, congue tellus. In hac habitasse platea dictumst. Sed lobortis risus consequat vehicula facilisis.\n\nIn hendrerit, neque in gravida rutrum, purus enim aliquet lectus, sit amet vulputate tortor lacus at sem. Aenean lorem metus, finibus rhoncus eros at, ullamcorper fringilla velit. Nulla vitae porttitor metus, quis gravida lectus. In rhoncus, diam a elementum luctus, erat nisi tempus ex, in porta est.",
                    Uri.parse("https://lh5.googleusercontent.com/-qX43g6s92LY/VGLaTT3N35I/AAAAAAAAAC8/BbueQmch0Rw/w600-no/68001.jpg"),
                    Uri.parse("https://lh6.googleusercontent.com/-SQ6T1Ure6l8/VGLaTg2iGuI/AAAAAAAAACo/m6_RkTW2G1o/w600-no/IMG_20140201_082851.jpg"),
                    new LatLng(-33.8723, 151.19896),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Bondi Beach",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam et nunc in leo laoreet placerat. Interdum et malesuada fames ac ante ipsum primis in faucibus.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam et nunc in leo laoreet placerat. Interdum et malesuada fames ac ante ipsum primis in faucibus. Proin vestibulum laoreet odio nec posuere. Quisque ante arcu, malesuada vitae velit a, auctor tincidunt ante. Mauris varius eros eros, eget scelerisque mi scelerisque ut. Donec vehicula vitae urna ac hendrerit. Phasellus egestas risus nec euismod auctor.\n\nInteger fermentum velit et dolor varius sagittis. Proin et viverra sapien. Nulla aliquet ante et hendrerit egestas. Duis vulputate libero in nisi gravida cursus. Praesent laoreet nec dolor non iaculis. Aliquam eleifend ultricies ipsum, eu pellentesque libero rutrum non. Mauris et purus erat. Nullam semper mi id tincidunt viverra. Ut porta sem congue lectus luctus ultricies. Suspendisse iaculis lacinia nibh, eu accumsan magna volutpat vel. Sed id interdum mi, vel sollicitudin elit. Fusce facilisis elementum gravida. Duis at volutpat odio. Integer porta convallis tincidunt. Donec aliquam, leo ut.",
                    Uri.parse("https://lh4.googleusercontent.com/-wbNgVdUkBiE/VHe99hGVtNI/AAAAAAAAAFY/fAHfhchNLJw/w600-no/IMG_20141124_143747.jpg"),
                    Uri.parse("https://lh6.googleusercontent.com/-sjY_xlEOic4/VHe9-I4DD9I/AAAAAAAAAFI/Mt0VnjU7SxQ/w600-no/IMG_20141124_144008.jpg"),
                    new LatLng(-33.89102, 151.277726),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Taronga Zoo",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam eros velit, faucibus in mi in, accumsan eleifend magna. Fusce efficitur volutpat leo nec finibus. Vivamus luctus quis dolor ac interdum.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam eros velit, faucibus in mi in, accumsan eleifend magna. Fusce efficitur volutpat leo nec finibus. Vivamus luctus quis dolor ac interdum. Donec iaculis, orci quis semper vulputate, tortor nisi porttitor tortor, at pretium ante quam ut odio. Donec fringilla sapien et dolor pharetra ultrices. Aenean faucibus felis non vulputate iaculis.\n\nEtiam eget dapibus ligula. Nunc facilisis dignissim tortor et elementum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Aliquam condimentum pellentesque mollis. Aliquam finibus urna ipsum, sed accumsan ante blandit quis. Vestibulum vel lacinia ligula. Nunc justo ex, volutpat nec justo ut, efficitur gravida lectus. Mauris cursus dui libero, vel tristique purus laoreet non.\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse ultrices ullamcorper est, at consequat massa. Nam egestas at urna at pellentesque. Quisque lacus quam, efficitur vel erat eget, placerat feugiat eros. Mauris.",
                    Uri.parse("https://lh6.googleusercontent.com/-kypwDfnk674/VGLWpQPm4VI/AAAAAAAAAB0/SrfL0fE9DnE/w500-no/OI000020_2.jpg"),
                    Uri.parse("https://lh3.googleusercontent.com/-6_Ioko2ysgU/VHva2PjmRCI/AAAAAAAAAGM/cHjJC7ney4Q/w500-no/PC190054.JPG"),
                    new LatLng(-33.843333, 151.241111),
                    CITY_SYDNEY
            ));
            add(new Attraction(
                    "Sydney Opera House",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vitae bibendum justo, vitae cursus velit. Suspendisse potenti.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vitae bibendum justo, vitae cursus velit. Suspendisse potenti. Suspendisse scelerisque risus justo, non tincidunt nibh blandit et. Vivamus elit lacus, luctus nec erat in, pharetra semper turpis. Quisque viverra nulla ligula, non pulvinar ante dictum sit amet. Vestibulum aliquet tortor mauris, vel suscipit nisl malesuada eget. Aliquam maximus dictum euismod. Maecenas leo quam, volutpat id diam eget, placerat fringilla ipsum. Nam pretium vehicula augue quis euismod.\n\nNam sed blandit magna. Vestibulum a fermentum arcu. Vestibulum et ligula at nisi luctus facilisis. Proin fermentum enim a nibh commodo finibus. Suspendisse justo elit, vulputate ut ipsum at, pellentesque auctor massa. Praesent vestibulum erat interdum imperdiet dapibus. In hac habitasse platea dictumst. Proin varius orci vitae tempor vulputate.\n\nEtiam sed mollis orci. Integer et ex sed tortor scelerisque blandit semper id libero. Nulla facilisi. Pellentesque tempor magna eget massa ultrices, et efficitur lectus finibus.",
                    Uri.parse("https://lh5.googleusercontent.com/-7fb5ybQhUbo/VGLWjIL4RmI/AAAAAAAAACM/2jLe_msj_tk/w600-no/IMG_0049.JPG"),
                    Uri.parse("https://lh3.googleusercontent.com/-EFEw6s7mT6I/VGLkCH4Xt4I/AAAAAAAAADY/ZlznhaQvb8E/w600-no/DSC_2775.JPG"),
                    new LatLng(-33.858667, 151.214028),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Sydney Harbour Bridge",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris ut nulla neque. Morbi nec felis vel neque rhoncus malesuada.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris ut nulla neque. Morbi nec felis vel neque rhoncus malesuada. Mauris non nisi est. Nunc in ipsum euismod, suscipit dolor eget, efficitur nisi. Integer venenatis mauris mauris, quis luctus risus pellentesque a. Duis tempus est at ligula vehicula fermentum. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.\n\nNam ut sodales nibh, euismod aliquet lectus. Curabitur ornare dictum nisi, at faucibus magna. Morbi tempus nibh sed sodales volutpat. Etiam sodales, turpis sit amet porttitor tristique, libero libero faucibus est, viverra dictum risus ipsum vel augue. Nulla dolor magna, iaculis ac ornare id, fermentum eget massa. Sed mattis, odio nec sodales vehicula, neque metus ullamcorper nulla, sit amet ullamcorper risus lectus a ipsum. Curabitur venenatis feugiat quam nec elementum. Curabitur a interdum urna. Curabitur tincidunt tortor eget neque condimentum blandit. Etiam imperdiet, enim nec blandit convallis, nunc augue.",
                    Uri.parse("https://lh6.googleusercontent.com/-ORRJtfLQlaw/VGLmQPv3n8I/AAAAAAAAAD8/2TzSCCPzl9k/w600-no/DSC04114.JPG"),
                    Uri.parse("https://lh4.googleusercontent.com/-ch9Kk-7pD68/VGLkCNh5niI/AAAAAAAAADc/ztxkRHWX-po/w600-no/DSC_2739.JPG"),
                    new LatLng(-33.852222, 151.210556),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Darling Harbour",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam ut dui in ipsum suscipit aliquet pretium aliquet odio.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam ut dui in ipsum suscipit aliquet pretium aliquet odio. Nam posuere nunc sed risus molestie varius. Suspendisse posuere faucibus urna, id vestibulum ante iaculis et. Vivamus placerat suscipit sem, a tempor nunc vehicula ac. Ut libero velit, dapibus sit amet euismod vel, dignissim a nisl.\n\nDonec non dui non felis laoreet malesuada. Fusce ac metus ultrices, fermentum felis quis, varius velit. Donec ac felis semper, scelerisque diam sed, dignissim risus. Maecenas vel semper sapien. Fusce euismod justo posuere, efficitur risus tincidunt, congue tellus. In hac habitasse platea dictumst. Sed lobortis risus consequat vehicula facilisis.\n\nIn hendrerit, neque in gravida rutrum, purus enim aliquet lectus, sit amet vulputate tortor lacus at sem. Aenean lorem metus, finibus rhoncus eros at, ullamcorper fringilla velit. Nulla vitae porttitor metus, quis gravida lectus. In rhoncus, diam a elementum luctus, erat nisi tempus ex, in porta est.",
                    Uri.parse("https://lh5.googleusercontent.com/-qX43g6s92LY/VGLaTT3N35I/AAAAAAAAAC8/BbueQmch0Rw/w600-no/68001.jpg"),
                    Uri.parse("https://lh6.googleusercontent.com/-SQ6T1Ure6l8/VGLaTg2iGuI/AAAAAAAAACo/m6_RkTW2G1o/w600-no/IMG_20140201_082851.jpg"),
                    new LatLng(-33.8723, 151.19896),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Bondi Beach",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam et nunc in leo laoreet placerat. Interdum et malesuada fames ac ante ipsum primis in faucibus.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam et nunc in leo laoreet placerat. Interdum et malesuada fames ac ante ipsum primis in faucibus. Proin vestibulum laoreet odio nec posuere. Quisque ante arcu, malesuada vitae velit a, auctor tincidunt ante. Mauris varius eros eros, eget scelerisque mi scelerisque ut. Donec vehicula vitae urna ac hendrerit. Phasellus egestas risus nec euismod auctor.\n\nInteger fermentum velit et dolor varius sagittis. Proin et viverra sapien. Nulla aliquet ante et hendrerit egestas. Duis vulputate libero in nisi gravida cursus. Praesent laoreet nec dolor non iaculis. Aliquam eleifend ultricies ipsum, eu pellentesque libero rutrum non. Mauris et purus erat. Nullam semper mi id tincidunt viverra. Ut porta sem congue lectus luctus ultricies. Suspendisse iaculis lacinia nibh, eu accumsan magna volutpat vel. Sed id interdum mi, vel sollicitudin elit. Fusce facilisis elementum gravida. Duis at volutpat odio. Integer porta convallis tincidunt. Donec aliquam, leo ut.",
                    Uri.parse("https://lh4.googleusercontent.com/-wbNgVdUkBiE/VHe99hGVtNI/AAAAAAAAAFY/fAHfhchNLJw/w600-no/IMG_20141124_143747.jpg"),
                    Uri.parse("https://lh6.googleusercontent.com/-sjY_xlEOic4/VHe9-I4DD9I/AAAAAAAAAFI/Mt0VnjU7SxQ/w600-no/IMG_20141124_144008.jpg"),
                    new LatLng(-33.89102, 151.277726),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Taronga Zoo",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam eros velit, faucibus in mi in, accumsan eleifend magna. Fusce efficitur volutpat leo nec finibus. Vivamus luctus quis dolor ac interdum.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam eros velit, faucibus in mi in, accumsan eleifend magna. Fusce efficitur volutpat leo nec finibus. Vivamus luctus quis dolor ac interdum. Donec iaculis, orci quis semper vulputate, tortor nisi porttitor tortor, at pretium ante quam ut odio. Donec fringilla sapien et dolor pharetra ultrices. Aenean faucibus felis non vulputate iaculis.\n\nEtiam eget dapibus ligula. Nunc facilisis dignissim tortor et elementum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Aliquam condimentum pellentesque mollis. Aliquam finibus urna ipsum, sed accumsan ante blandit quis. Vestibulum vel lacinia ligula. Nunc justo ex, volutpat nec justo ut, efficitur gravida lectus. Mauris cursus dui libero, vel tristique purus laoreet non.\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse ultrices ullamcorper est, at consequat massa. Nam egestas at urna at pellentesque. Quisque lacus quam, efficitur vel erat eget, placerat feugiat eros. Mauris.",
                    Uri.parse("https://lh6.googleusercontent.com/-kypwDfnk674/VGLWpQPm4VI/AAAAAAAAAB0/SrfL0fE9DnE/w500-no/OI000020_2.jpg"),
                    Uri.parse("https://lh3.googleusercontent.com/-6_Ioko2ysgU/VHva2PjmRCI/AAAAAAAAAGM/cHjJC7ney4Q/w500-no/PC190054.JPG"),
                    new LatLng(-33.843333, 151.241111),
                    CITY_SYDNEY
            ));
            add(new Attraction(
                    "Sydney Opera House",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vitae bibendum justo, vitae cursus velit. Suspendisse potenti.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vitae bibendum justo, vitae cursus velit. Suspendisse potenti. Suspendisse scelerisque risus justo, non tincidunt nibh blandit et. Vivamus elit lacus, luctus nec erat in, pharetra semper turpis. Quisque viverra nulla ligula, non pulvinar ante dictum sit amet. Vestibulum aliquet tortor mauris, vel suscipit nisl malesuada eget. Aliquam maximus dictum euismod. Maecenas leo quam, volutpat id diam eget, placerat fringilla ipsum. Nam pretium vehicula augue quis euismod.\n\nNam sed blandit magna. Vestibulum a fermentum arcu. Vestibulum et ligula at nisi luctus facilisis. Proin fermentum enim a nibh commodo finibus. Suspendisse justo elit, vulputate ut ipsum at, pellentesque auctor massa. Praesent vestibulum erat interdum imperdiet dapibus. In hac habitasse platea dictumst. Proin varius orci vitae tempor vulputate.\n\nEtiam sed mollis orci. Integer et ex sed tortor scelerisque blandit semper id libero. Nulla facilisi. Pellentesque tempor magna eget massa ultrices, et efficitur lectus finibus.",
                    Uri.parse("https://lh5.googleusercontent.com/-7fb5ybQhUbo/VGLWjIL4RmI/AAAAAAAAACM/2jLe_msj_tk/w600-no/IMG_0049.JPG"),
                    Uri.parse("https://lh3.googleusercontent.com/-EFEw6s7mT6I/VGLkCH4Xt4I/AAAAAAAAADY/ZlznhaQvb8E/w600-no/DSC_2775.JPG"),
                    new LatLng(-33.858667, 151.214028),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Sydney Harbour Bridge",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris ut nulla neque. Morbi nec felis vel neque rhoncus malesuada.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris ut nulla neque. Morbi nec felis vel neque rhoncus malesuada. Mauris non nisi est. Nunc in ipsum euismod, suscipit dolor eget, efficitur nisi. Integer venenatis mauris mauris, quis luctus risus pellentesque a. Duis tempus est at ligula vehicula fermentum. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.\n\nNam ut sodales nibh, euismod aliquet lectus. Curabitur ornare dictum nisi, at faucibus magna. Morbi tempus nibh sed sodales volutpat. Etiam sodales, turpis sit amet porttitor tristique, libero libero faucibus est, viverra dictum risus ipsum vel augue. Nulla dolor magna, iaculis ac ornare id, fermentum eget massa. Sed mattis, odio nec sodales vehicula, neque metus ullamcorper nulla, sit amet ullamcorper risus lectus a ipsum. Curabitur venenatis feugiat quam nec elementum. Curabitur a interdum urna. Curabitur tincidunt tortor eget neque condimentum blandit. Etiam imperdiet, enim nec blandit convallis, nunc augue.",
                    Uri.parse("https://lh6.googleusercontent.com/-ORRJtfLQlaw/VGLmQPv3n8I/AAAAAAAAAD8/2TzSCCPzl9k/w600-no/DSC04114.JPG"),
                    Uri.parse("https://lh4.googleusercontent.com/-ch9Kk-7pD68/VGLkCNh5niI/AAAAAAAAADc/ztxkRHWX-po/w600-no/DSC_2739.JPG"),
                    new LatLng(-33.852222, 151.210556),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Darling Harbour",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam ut dui in ipsum suscipit aliquet pretium aliquet odio.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam ut dui in ipsum suscipit aliquet pretium aliquet odio. Nam posuere nunc sed risus molestie varius. Suspendisse posuere faucibus urna, id vestibulum ante iaculis et. Vivamus placerat suscipit sem, a tempor nunc vehicula ac. Ut libero velit, dapibus sit amet euismod vel, dignissim a nisl.\n\nDonec non dui non felis laoreet malesuada. Fusce ac metus ultrices, fermentum felis quis, varius velit. Donec ac felis semper, scelerisque diam sed, dignissim risus. Maecenas vel semper sapien. Fusce euismod justo posuere, efficitur risus tincidunt, congue tellus. In hac habitasse platea dictumst. Sed lobortis risus consequat vehicula facilisis.\n\nIn hendrerit, neque in gravida rutrum, purus enim aliquet lectus, sit amet vulputate tortor lacus at sem. Aenean lorem metus, finibus rhoncus eros at, ullamcorper fringilla velit. Nulla vitae porttitor metus, quis gravida lectus. In rhoncus, diam a elementum luctus, erat nisi tempus ex, in porta est.",
                    Uri.parse("https://lh5.googleusercontent.com/-qX43g6s92LY/VGLaTT3N35I/AAAAAAAAAC8/BbueQmch0Rw/w600-no/68001.jpg"),
                    Uri.parse("https://lh6.googleusercontent.com/-SQ6T1Ure6l8/VGLaTg2iGuI/AAAAAAAAACo/m6_RkTW2G1o/w600-no/IMG_20140201_082851.jpg"),
                    new LatLng(-33.8723, 151.19896),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Bondi Beach",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam et nunc in leo laoreet placerat. Interdum et malesuada fames ac ante ipsum primis in faucibus.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam et nunc in leo laoreet placerat. Interdum et malesuada fames ac ante ipsum primis in faucibus. Proin vestibulum laoreet odio nec posuere. Quisque ante arcu, malesuada vitae velit a, auctor tincidunt ante. Mauris varius eros eros, eget scelerisque mi scelerisque ut. Donec vehicula vitae urna ac hendrerit. Phasellus egestas risus nec euismod auctor.\n\nInteger fermentum velit et dolor varius sagittis. Proin et viverra sapien. Nulla aliquet ante et hendrerit egestas. Duis vulputate libero in nisi gravida cursus. Praesent laoreet nec dolor non iaculis. Aliquam eleifend ultricies ipsum, eu pellentesque libero rutrum non. Mauris et purus erat. Nullam semper mi id tincidunt viverra. Ut porta sem congue lectus luctus ultricies. Suspendisse iaculis lacinia nibh, eu accumsan magna volutpat vel. Sed id interdum mi, vel sollicitudin elit. Fusce facilisis elementum gravida. Duis at volutpat odio. Integer porta convallis tincidunt. Donec aliquam, leo ut.",
                    Uri.parse("https://lh4.googleusercontent.com/-wbNgVdUkBiE/VHe99hGVtNI/AAAAAAAAAFY/fAHfhchNLJw/w600-no/IMG_20141124_143747.jpg"),
                    Uri.parse("https://lh6.googleusercontent.com/-sjY_xlEOic4/VHe9-I4DD9I/AAAAAAAAAFI/Mt0VnjU7SxQ/w600-no/IMG_20141124_144008.jpg"),
                    new LatLng(-33.89102, 151.277726),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Taronga Zoo",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam eros velit, faucibus in mi in, accumsan eleifend magna. Fusce efficitur volutpat leo nec finibus. Vivamus luctus quis dolor ac interdum.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam eros velit, faucibus in mi in, accumsan eleifend magna. Fusce efficitur volutpat leo nec finibus. Vivamus luctus quis dolor ac interdum. Donec iaculis, orci quis semper vulputate, tortor nisi porttitor tortor, at pretium ante quam ut odio. Donec fringilla sapien et dolor pharetra ultrices. Aenean faucibus felis non vulputate iaculis.\n\nEtiam eget dapibus ligula. Nunc facilisis dignissim tortor et elementum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Aliquam condimentum pellentesque mollis. Aliquam finibus urna ipsum, sed accumsan ante blandit quis. Vestibulum vel lacinia ligula. Nunc justo ex, volutpat nec justo ut, efficitur gravida lectus. Mauris cursus dui libero, vel tristique purus laoreet non.\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse ultrices ullamcorper est, at consequat massa. Nam egestas at urna at pellentesque. Quisque lacus quam, efficitur vel erat eget, placerat feugiat eros. Mauris.",
                    Uri.parse("https://lh6.googleusercontent.com/-kypwDfnk674/VGLWpQPm4VI/AAAAAAAAAB0/SrfL0fE9DnE/w500-no/OI000020_2.jpg"),
                    Uri.parse("https://lh3.googleusercontent.com/-6_Ioko2ysgU/VHva2PjmRCI/AAAAAAAAAGM/cHjJC7ney4Q/w500-no/PC190054.JPG"),
                    new LatLng(-33.843333, 151.241111),
                    CITY_SYDNEY
            ));
            add(new Attraction(
                    "Sydney Opera House",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vitae bibendum justo, vitae cursus velit. Suspendisse potenti.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vitae bibendum justo, vitae cursus velit. Suspendisse potenti. Suspendisse scelerisque risus justo, non tincidunt nibh blandit et. Vivamus elit lacus, luctus nec erat in, pharetra semper turpis. Quisque viverra nulla ligula, non pulvinar ante dictum sit amet. Vestibulum aliquet tortor mauris, vel suscipit nisl malesuada eget. Aliquam maximus dictum euismod. Maecenas leo quam, volutpat id diam eget, placerat fringilla ipsum. Nam pretium vehicula augue quis euismod.\n\nNam sed blandit magna. Vestibulum a fermentum arcu. Vestibulum et ligula at nisi luctus facilisis. Proin fermentum enim a nibh commodo finibus. Suspendisse justo elit, vulputate ut ipsum at, pellentesque auctor massa. Praesent vestibulum erat interdum imperdiet dapibus. In hac habitasse platea dictumst. Proin varius orci vitae tempor vulputate.\n\nEtiam sed mollis orci. Integer et ex sed tortor scelerisque blandit semper id libero. Nulla facilisi. Pellentesque tempor magna eget massa ultrices, et efficitur lectus finibus.",
                    Uri.parse("https://lh5.googleusercontent.com/-7fb5ybQhUbo/VGLWjIL4RmI/AAAAAAAAACM/2jLe_msj_tk/w600-no/IMG_0049.JPG"),
                    Uri.parse("https://lh3.googleusercontent.com/-EFEw6s7mT6I/VGLkCH4Xt4I/AAAAAAAAADY/ZlznhaQvb8E/w600-no/DSC_2775.JPG"),
                    new LatLng(-33.858667, 151.214028),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Sydney Harbour Bridge",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris ut nulla neque. Morbi nec felis vel neque rhoncus malesuada.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris ut nulla neque. Morbi nec felis vel neque rhoncus malesuada. Mauris non nisi est. Nunc in ipsum euismod, suscipit dolor eget, efficitur nisi. Integer venenatis mauris mauris, quis luctus risus pellentesque a. Duis tempus est at ligula vehicula fermentum. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.\n\nNam ut sodales nibh, euismod aliquet lectus. Curabitur ornare dictum nisi, at faucibus magna. Morbi tempus nibh sed sodales volutpat. Etiam sodales, turpis sit amet porttitor tristique, libero libero faucibus est, viverra dictum risus ipsum vel augue. Nulla dolor magna, iaculis ac ornare id, fermentum eget massa. Sed mattis, odio nec sodales vehicula, neque metus ullamcorper nulla, sit amet ullamcorper risus lectus a ipsum. Curabitur venenatis feugiat quam nec elementum. Curabitur a interdum urna. Curabitur tincidunt tortor eget neque condimentum blandit. Etiam imperdiet, enim nec blandit convallis, nunc augue.",
                    Uri.parse("https://lh6.googleusercontent.com/-ORRJtfLQlaw/VGLmQPv3n8I/AAAAAAAAAD8/2TzSCCPzl9k/w600-no/DSC04114.JPG"),
                    Uri.parse("https://lh4.googleusercontent.com/-ch9Kk-7pD68/VGLkCNh5niI/AAAAAAAAADc/ztxkRHWX-po/w600-no/DSC_2739.JPG"),
                    new LatLng(-33.852222, 151.210556),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Darling Harbour",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam ut dui in ipsum suscipit aliquet pretium aliquet odio.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam ut dui in ipsum suscipit aliquet pretium aliquet odio. Nam posuere nunc sed risus molestie varius. Suspendisse posuere faucibus urna, id vestibulum ante iaculis et. Vivamus placerat suscipit sem, a tempor nunc vehicula ac. Ut libero velit, dapibus sit amet euismod vel, dignissim a nisl.\n\nDonec non dui non felis laoreet malesuada. Fusce ac metus ultrices, fermentum felis quis, varius velit. Donec ac felis semper, scelerisque diam sed, dignissim risus. Maecenas vel semper sapien. Fusce euismod justo posuere, efficitur risus tincidunt, congue tellus. In hac habitasse platea dictumst. Sed lobortis risus consequat vehicula facilisis.\n\nIn hendrerit, neque in gravida rutrum, purus enim aliquet lectus, sit amet vulputate tortor lacus at sem. Aenean lorem metus, finibus rhoncus eros at, ullamcorper fringilla velit. Nulla vitae porttitor metus, quis gravida lectus. In rhoncus, diam a elementum luctus, erat nisi tempus ex, in porta est.",
                    Uri.parse("https://lh5.googleusercontent.com/-qX43g6s92LY/VGLaTT3N35I/AAAAAAAAAC8/BbueQmch0Rw/w600-no/68001.jpg"),
                    Uri.parse("https://lh6.googleusercontent.com/-SQ6T1Ure6l8/VGLaTg2iGuI/AAAAAAAAACo/m6_RkTW2G1o/w600-no/IMG_20140201_082851.jpg"),
                    new LatLng(-33.8723, 151.19896),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Bondi Beach",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam et nunc in leo laoreet placerat. Interdum et malesuada fames ac ante ipsum primis in faucibus.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam et nunc in leo laoreet placerat. Interdum et malesuada fames ac ante ipsum primis in faucibus. Proin vestibulum laoreet odio nec posuere. Quisque ante arcu, malesuada vitae velit a, auctor tincidunt ante. Mauris varius eros eros, eget scelerisque mi scelerisque ut. Donec vehicula vitae urna ac hendrerit. Phasellus egestas risus nec euismod auctor.\n\nInteger fermentum velit et dolor varius sagittis. Proin et viverra sapien. Nulla aliquet ante et hendrerit egestas. Duis vulputate libero in nisi gravida cursus. Praesent laoreet nec dolor non iaculis. Aliquam eleifend ultricies ipsum, eu pellentesque libero rutrum non. Mauris et purus erat. Nullam semper mi id tincidunt viverra. Ut porta sem congue lectus luctus ultricies. Suspendisse iaculis lacinia nibh, eu accumsan magna volutpat vel. Sed id interdum mi, vel sollicitudin elit. Fusce facilisis elementum gravida. Duis at volutpat odio. Integer porta convallis tincidunt. Donec aliquam, leo ut.",
                    Uri.parse("https://lh4.googleusercontent.com/-wbNgVdUkBiE/VHe99hGVtNI/AAAAAAAAAFY/fAHfhchNLJw/w600-no/IMG_20141124_143747.jpg"),
                    Uri.parse("https://lh6.googleusercontent.com/-sjY_xlEOic4/VHe9-I4DD9I/AAAAAAAAAFI/Mt0VnjU7SxQ/w600-no/IMG_20141124_144008.jpg"),
                    new LatLng(-33.89102, 151.277726),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Taronga Zoo",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam eros velit, faucibus in mi in, accumsan eleifend magna. Fusce efficitur volutpat leo nec finibus. Vivamus luctus quis dolor ac interdum.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam eros velit, faucibus in mi in, accumsan eleifend magna. Fusce efficitur volutpat leo nec finibus. Vivamus luctus quis dolor ac interdum. Donec iaculis, orci quis semper vulputate, tortor nisi porttitor tortor, at pretium ante quam ut odio. Donec fringilla sapien et dolor pharetra ultrices. Aenean faucibus felis non vulputate iaculis.\n\nEtiam eget dapibus ligula. Nunc facilisis dignissim tortor et elementum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Aliquam condimentum pellentesque mollis. Aliquam finibus urna ipsum, sed accumsan ante blandit quis. Vestibulum vel lacinia ligula. Nunc justo ex, volutpat nec justo ut, efficitur gravida lectus. Mauris cursus dui libero, vel tristique purus laoreet non.\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse ultrices ullamcorper est, at consequat massa. Nam egestas at urna at pellentesque. Quisque lacus quam, efficitur vel erat eget, placerat feugiat eros. Mauris.",
                    Uri.parse("https://lh6.googleusercontent.com/-kypwDfnk674/VGLWpQPm4VI/AAAAAAAAAB0/SrfL0fE9DnE/w500-no/OI000020_2.jpg"),
                    Uri.parse("https://lh3.googleusercontent.com/-6_Ioko2ysgU/VHva2PjmRCI/AAAAAAAAAGM/cHjJC7ney4Q/w500-no/PC190054.JPG"),
                    new LatLng(-33.843333, 151.241111),
                    CITY_SYDNEY
            ));
            add(new Attraction(
                    "Sydney Opera House",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vitae bibendum justo, vitae cursus velit. Suspendisse potenti.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vitae bibendum justo, vitae cursus velit. Suspendisse potenti. Suspendisse scelerisque risus justo, non tincidunt nibh blandit et. Vivamus elit lacus, luctus nec erat in, pharetra semper turpis. Quisque viverra nulla ligula, non pulvinar ante dictum sit amet. Vestibulum aliquet tortor mauris, vel suscipit nisl malesuada eget. Aliquam maximus dictum euismod. Maecenas leo quam, volutpat id diam eget, placerat fringilla ipsum. Nam pretium vehicula augue quis euismod.\n\nNam sed blandit magna. Vestibulum a fermentum arcu. Vestibulum et ligula at nisi luctus facilisis. Proin fermentum enim a nibh commodo finibus. Suspendisse justo elit, vulputate ut ipsum at, pellentesque auctor massa. Praesent vestibulum erat interdum imperdiet dapibus. In hac habitasse platea dictumst. Proin varius orci vitae tempor vulputate.\n\nEtiam sed mollis orci. Integer et ex sed tortor scelerisque blandit semper id libero. Nulla facilisi. Pellentesque tempor magna eget massa ultrices, et efficitur lectus finibus.",
                    Uri.parse("https://lh5.googleusercontent.com/-7fb5ybQhUbo/VGLWjIL4RmI/AAAAAAAAACM/2jLe_msj_tk/w600-no/IMG_0049.JPG"),
                    Uri.parse("https://lh3.googleusercontent.com/-EFEw6s7mT6I/VGLkCH4Xt4I/AAAAAAAAADY/ZlznhaQvb8E/w600-no/DSC_2775.JPG"),
                    new LatLng(-33.858667, 151.214028),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Sydney Harbour Bridge",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris ut nulla neque. Morbi nec felis vel neque rhoncus malesuada.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris ut nulla neque. Morbi nec felis vel neque rhoncus malesuada. Mauris non nisi est. Nunc in ipsum euismod, suscipit dolor eget, efficitur nisi. Integer venenatis mauris mauris, quis luctus risus pellentesque a. Duis tempus est at ligula vehicula fermentum. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.\n\nNam ut sodales nibh, euismod aliquet lectus. Curabitur ornare dictum nisi, at faucibus magna. Morbi tempus nibh sed sodales volutpat. Etiam sodales, turpis sit amet porttitor tristique, libero libero faucibus est, viverra dictum risus ipsum vel augue. Nulla dolor magna, iaculis ac ornare id, fermentum eget massa. Sed mattis, odio nec sodales vehicula, neque metus ullamcorper nulla, sit amet ullamcorper risus lectus a ipsum. Curabitur venenatis feugiat quam nec elementum. Curabitur a interdum urna. Curabitur tincidunt tortor eget neque condimentum blandit. Etiam imperdiet, enim nec blandit convallis, nunc augue.",
                    Uri.parse("https://lh6.googleusercontent.com/-ORRJtfLQlaw/VGLmQPv3n8I/AAAAAAAAAD8/2TzSCCPzl9k/w600-no/DSC04114.JPG"),
                    Uri.parse("https://lh4.googleusercontent.com/-ch9Kk-7pD68/VGLkCNh5niI/AAAAAAAAADc/ztxkRHWX-po/w600-no/DSC_2739.JPG"),
                    new LatLng(-33.852222, 151.210556),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Darling Harbour",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam ut dui in ipsum suscipit aliquet pretium aliquet odio.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam ut dui in ipsum suscipit aliquet pretium aliquet odio. Nam posuere nunc sed risus molestie varius. Suspendisse posuere faucibus urna, id vestibulum ante iaculis et. Vivamus placerat suscipit sem, a tempor nunc vehicula ac. Ut libero velit, dapibus sit amet euismod vel, dignissim a nisl.\n\nDonec non dui non felis laoreet malesuada. Fusce ac metus ultrices, fermentum felis quis, varius velit. Donec ac felis semper, scelerisque diam sed, dignissim risus. Maecenas vel semper sapien. Fusce euismod justo posuere, efficitur risus tincidunt, congue tellus. In hac habitasse platea dictumst. Sed lobortis risus consequat vehicula facilisis.\n\nIn hendrerit, neque in gravida rutrum, purus enim aliquet lectus, sit amet vulputate tortor lacus at sem. Aenean lorem metus, finibus rhoncus eros at, ullamcorper fringilla velit. Nulla vitae porttitor metus, quis gravida lectus. In rhoncus, diam a elementum luctus, erat nisi tempus ex, in porta est.",
                    Uri.parse("https://lh5.googleusercontent.com/-qX43g6s92LY/VGLaTT3N35I/AAAAAAAAAC8/BbueQmch0Rw/w600-no/68001.jpg"),
                    Uri.parse("https://lh6.googleusercontent.com/-SQ6T1Ure6l8/VGLaTg2iGuI/AAAAAAAAACo/m6_RkTW2G1o/w600-no/IMG_20140201_082851.jpg"),
                    new LatLng(-33.8723, 151.19896),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Bondi Beach",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam et nunc in leo laoreet placerat. Interdum et malesuada fames ac ante ipsum primis in faucibus.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam et nunc in leo laoreet placerat. Interdum et malesuada fames ac ante ipsum primis in faucibus. Proin vestibulum laoreet odio nec posuere. Quisque ante arcu, malesuada vitae velit a, auctor tincidunt ante. Mauris varius eros eros, eget scelerisque mi scelerisque ut. Donec vehicula vitae urna ac hendrerit. Phasellus egestas risus nec euismod auctor.\n\nInteger fermentum velit et dolor varius sagittis. Proin et viverra sapien. Nulla aliquet ante et hendrerit egestas. Duis vulputate libero in nisi gravida cursus. Praesent laoreet nec dolor non iaculis. Aliquam eleifend ultricies ipsum, eu pellentesque libero rutrum non. Mauris et purus erat. Nullam semper mi id tincidunt viverra. Ut porta sem congue lectus luctus ultricies. Suspendisse iaculis lacinia nibh, eu accumsan magna volutpat vel. Sed id interdum mi, vel sollicitudin elit. Fusce facilisis elementum gravida. Duis at volutpat odio. Integer porta convallis tincidunt. Donec aliquam, leo ut.",
                    Uri.parse("https://lh4.googleusercontent.com/-wbNgVdUkBiE/VHe99hGVtNI/AAAAAAAAAFY/fAHfhchNLJw/w600-no/IMG_20141124_143747.jpg"),
                    Uri.parse("https://lh6.googleusercontent.com/-sjY_xlEOic4/VHe9-I4DD9I/AAAAAAAAAFI/Mt0VnjU7SxQ/w600-no/IMG_20141124_144008.jpg"),
                    new LatLng(-33.89102, 151.277726),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Taronga Zoo",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam eros velit, faucibus in mi in, accumsan eleifend magna. Fusce efficitur volutpat leo nec finibus. Vivamus luctus quis dolor ac interdum.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam eros velit, faucibus in mi in, accumsan eleifend magna. Fusce efficitur volutpat leo nec finibus. Vivamus luctus quis dolor ac interdum. Donec iaculis, orci quis semper vulputate, tortor nisi porttitor tortor, at pretium ante quam ut odio. Donec fringilla sapien et dolor pharetra ultrices. Aenean faucibus felis non vulputate iaculis.\n\nEtiam eget dapibus ligula. Nunc facilisis dignissim tortor et elementum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Aliquam condimentum pellentesque mollis. Aliquam finibus urna ipsum, sed accumsan ante blandit quis. Vestibulum vel lacinia ligula. Nunc justo ex, volutpat nec justo ut, efficitur gravida lectus. Mauris cursus dui libero, vel tristique purus laoreet non.\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse ultrices ullamcorper est, at consequat massa. Nam egestas at urna at pellentesque. Quisque lacus quam, efficitur vel erat eget, placerat feugiat eros. Mauris.",
                    Uri.parse("https://lh6.googleusercontent.com/-kypwDfnk674/VGLWpQPm4VI/AAAAAAAAAB0/SrfL0fE9DnE/w500-no/OI000020_2.jpg"),
                    Uri.parse("https://lh3.googleusercontent.com/-6_Ioko2ysgU/VHva2PjmRCI/AAAAAAAAAGM/cHjJC7ney4Q/w500-no/PC190054.JPG"),
                    new LatLng(-33.843333, 151.241111),
                    CITY_SYDNEY
            ));
            add(new Attraction(
                    "Sydney Opera House",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vitae bibendum justo, vitae cursus velit. Suspendisse potenti.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vitae bibendum justo, vitae cursus velit. Suspendisse potenti. Suspendisse scelerisque risus justo, non tincidunt nibh blandit et. Vivamus elit lacus, luctus nec erat in, pharetra semper turpis. Quisque viverra nulla ligula, non pulvinar ante dictum sit amet. Vestibulum aliquet tortor mauris, vel suscipit nisl malesuada eget. Aliquam maximus dictum euismod. Maecenas leo quam, volutpat id diam eget, placerat fringilla ipsum. Nam pretium vehicula augue quis euismod.\n\nNam sed blandit magna. Vestibulum a fermentum arcu. Vestibulum et ligula at nisi luctus facilisis. Proin fermentum enim a nibh commodo finibus. Suspendisse justo elit, vulputate ut ipsum at, pellentesque auctor massa. Praesent vestibulum erat interdum imperdiet dapibus. In hac habitasse platea dictumst. Proin varius orci vitae tempor vulputate.\n\nEtiam sed mollis orci. Integer et ex sed tortor scelerisque blandit semper id libero. Nulla facilisi. Pellentesque tempor magna eget massa ultrices, et efficitur lectus finibus.",
                    Uri.parse("https://lh5.googleusercontent.com/-7fb5ybQhUbo/VGLWjIL4RmI/AAAAAAAAACM/2jLe_msj_tk/w600-no/IMG_0049.JPG"),
                    Uri.parse("https://lh3.googleusercontent.com/-EFEw6s7mT6I/VGLkCH4Xt4I/AAAAAAAAADY/ZlznhaQvb8E/w600-no/DSC_2775.JPG"),
                    new LatLng(-33.858667, 151.214028),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Sydney Harbour Bridge",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris ut nulla neque. Morbi nec felis vel neque rhoncus malesuada.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris ut nulla neque. Morbi nec felis vel neque rhoncus malesuada. Mauris non nisi est. Nunc in ipsum euismod, suscipit dolor eget, efficitur nisi. Integer venenatis mauris mauris, quis luctus risus pellentesque a. Duis tempus est at ligula vehicula fermentum. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.\n\nNam ut sodales nibh, euismod aliquet lectus. Curabitur ornare dictum nisi, at faucibus magna. Morbi tempus nibh sed sodales volutpat. Etiam sodales, turpis sit amet porttitor tristique, libero libero faucibus est, viverra dictum risus ipsum vel augue. Nulla dolor magna, iaculis ac ornare id, fermentum eget massa. Sed mattis, odio nec sodales vehicula, neque metus ullamcorper nulla, sit amet ullamcorper risus lectus a ipsum. Curabitur venenatis feugiat quam nec elementum. Curabitur a interdum urna. Curabitur tincidunt tortor eget neque condimentum blandit. Etiam imperdiet, enim nec blandit convallis, nunc augue.",
                    Uri.parse("https://lh6.googleusercontent.com/-ORRJtfLQlaw/VGLmQPv3n8I/AAAAAAAAAD8/2TzSCCPzl9k/w600-no/DSC04114.JPG"),
                    Uri.parse("https://lh4.googleusercontent.com/-ch9Kk-7pD68/VGLkCNh5niI/AAAAAAAAADc/ztxkRHWX-po/w600-no/DSC_2739.JPG"),
                    new LatLng(-33.852222, 151.210556),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Darling Harbour",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam ut dui in ipsum suscipit aliquet pretium aliquet odio.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam ut dui in ipsum suscipit aliquet pretium aliquet odio. Nam posuere nunc sed risus molestie varius. Suspendisse posuere faucibus urna, id vestibulum ante iaculis et. Vivamus placerat suscipit sem, a tempor nunc vehicula ac. Ut libero velit, dapibus sit amet euismod vel, dignissim a nisl.\n\nDonec non dui non felis laoreet malesuada. Fusce ac metus ultrices, fermentum felis quis, varius velit. Donec ac felis semper, scelerisque diam sed, dignissim risus. Maecenas vel semper sapien. Fusce euismod justo posuere, efficitur risus tincidunt, congue tellus. In hac habitasse platea dictumst. Sed lobortis risus consequat vehicula facilisis.\n\nIn hendrerit, neque in gravida rutrum, purus enim aliquet lectus, sit amet vulputate tortor lacus at sem. Aenean lorem metus, finibus rhoncus eros at, ullamcorper fringilla velit. Nulla vitae porttitor metus, quis gravida lectus. In rhoncus, diam a elementum luctus, erat nisi tempus ex, in porta est.",
                    Uri.parse("https://lh5.googleusercontent.com/-qX43g6s92LY/VGLaTT3N35I/AAAAAAAAAC8/BbueQmch0Rw/w600-no/68001.jpg"),
                    Uri.parse("https://lh6.googleusercontent.com/-SQ6T1Ure6l8/VGLaTg2iGuI/AAAAAAAAACo/m6_RkTW2G1o/w600-no/IMG_20140201_082851.jpg"),
                    new LatLng(-33.8723, 151.19896),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Bondi Beach",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam et nunc in leo laoreet placerat. Interdum et malesuada fames ac ante ipsum primis in faucibus.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam et nunc in leo laoreet placerat. Interdum et malesuada fames ac ante ipsum primis in faucibus. Proin vestibulum laoreet odio nec posuere. Quisque ante arcu, malesuada vitae velit a, auctor tincidunt ante. Mauris varius eros eros, eget scelerisque mi scelerisque ut. Donec vehicula vitae urna ac hendrerit. Phasellus egestas risus nec euismod auctor.\n\nInteger fermentum velit et dolor varius sagittis. Proin et viverra sapien. Nulla aliquet ante et hendrerit egestas. Duis vulputate libero in nisi gravida cursus. Praesent laoreet nec dolor non iaculis. Aliquam eleifend ultricies ipsum, eu pellentesque libero rutrum non. Mauris et purus erat. Nullam semper mi id tincidunt viverra. Ut porta sem congue lectus luctus ultricies. Suspendisse iaculis lacinia nibh, eu accumsan magna volutpat vel. Sed id interdum mi, vel sollicitudin elit. Fusce facilisis elementum gravida. Duis at volutpat odio. Integer porta convallis tincidunt. Donec aliquam, leo ut.",
                    Uri.parse("https://lh4.googleusercontent.com/-wbNgVdUkBiE/VHe99hGVtNI/AAAAAAAAAFY/fAHfhchNLJw/w600-no/IMG_20141124_143747.jpg"),
                    Uri.parse("https://lh6.googleusercontent.com/-sjY_xlEOic4/VHe9-I4DD9I/AAAAAAAAAFI/Mt0VnjU7SxQ/w600-no/IMG_20141124_144008.jpg"),
                    new LatLng(-33.89102, 151.277726),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Taronga Zoo",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam eros velit, faucibus in mi in, accumsan eleifend magna. Fusce efficitur volutpat leo nec finibus. Vivamus luctus quis dolor ac interdum.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam eros velit, faucibus in mi in, accumsan eleifend magna. Fusce efficitur volutpat leo nec finibus. Vivamus luctus quis dolor ac interdum. Donec iaculis, orci quis semper vulputate, tortor nisi porttitor tortor, at pretium ante quam ut odio. Donec fringilla sapien et dolor pharetra ultrices. Aenean faucibus felis non vulputate iaculis.\n\nEtiam eget dapibus ligula. Nunc facilisis dignissim tortor et elementum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Aliquam condimentum pellentesque mollis. Aliquam finibus urna ipsum, sed accumsan ante blandit quis. Vestibulum vel lacinia ligula. Nunc justo ex, volutpat nec justo ut, efficitur gravida lectus. Mauris cursus dui libero, vel tristique purus laoreet non.\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse ultrices ullamcorper est, at consequat massa. Nam egestas at urna at pellentesque. Quisque lacus quam, efficitur vel erat eget, placerat feugiat eros. Mauris.",
                    Uri.parse("https://lh6.googleusercontent.com/-kypwDfnk674/VGLWpQPm4VI/AAAAAAAAAB0/SrfL0fE9DnE/w500-no/OI000020_2.jpg"),
                    Uri.parse("https://lh3.googleusercontent.com/-6_Ioko2ysgU/VHva2PjmRCI/AAAAAAAAAGM/cHjJC7ney4Q/w500-no/PC190054.JPG"),
                    new LatLng(-33.843333, 151.241111),
                    CITY_SYDNEY
            ));
            add(new Attraction(
                    "Sydney Opera House",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vitae bibendum justo, vitae cursus velit. Suspendisse potenti.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vitae bibendum justo, vitae cursus velit. Suspendisse potenti. Suspendisse scelerisque risus justo, non tincidunt nibh blandit et. Vivamus elit lacus, luctus nec erat in, pharetra semper turpis. Quisque viverra nulla ligula, non pulvinar ante dictum sit amet. Vestibulum aliquet tortor mauris, vel suscipit nisl malesuada eget. Aliquam maximus dictum euismod. Maecenas leo quam, volutpat id diam eget, placerat fringilla ipsum. Nam pretium vehicula augue quis euismod.\n\nNam sed blandit magna. Vestibulum a fermentum arcu. Vestibulum et ligula at nisi luctus facilisis. Proin fermentum enim a nibh commodo finibus. Suspendisse justo elit, vulputate ut ipsum at, pellentesque auctor massa. Praesent vestibulum erat interdum imperdiet dapibus. In hac habitasse platea dictumst. Proin varius orci vitae tempor vulputate.\n\nEtiam sed mollis orci. Integer et ex sed tortor scelerisque blandit semper id libero. Nulla facilisi. Pellentesque tempor magna eget massa ultrices, et efficitur lectus finibus.",
                    Uri.parse("https://lh5.googleusercontent.com/-7fb5ybQhUbo/VGLWjIL4RmI/AAAAAAAAACM/2jLe_msj_tk/w600-no/IMG_0049.JPG"),
                    Uri.parse("https://lh3.googleusercontent.com/-EFEw6s7mT6I/VGLkCH4Xt4I/AAAAAAAAADY/ZlznhaQvb8E/w600-no/DSC_2775.JPG"),
                    new LatLng(-33.858667, 151.214028),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Sydney Harbour Bridge",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris ut nulla neque. Morbi nec felis vel neque rhoncus malesuada.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris ut nulla neque. Morbi nec felis vel neque rhoncus malesuada. Mauris non nisi est. Nunc in ipsum euismod, suscipit dolor eget, efficitur nisi. Integer venenatis mauris mauris, quis luctus risus pellentesque a. Duis tempus est at ligula vehicula fermentum. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.\n\nNam ut sodales nibh, euismod aliquet lectus. Curabitur ornare dictum nisi, at faucibus magna. Morbi tempus nibh sed sodales volutpat. Etiam sodales, turpis sit amet porttitor tristique, libero libero faucibus est, viverra dictum risus ipsum vel augue. Nulla dolor magna, iaculis ac ornare id, fermentum eget massa. Sed mattis, odio nec sodales vehicula, neque metus ullamcorper nulla, sit amet ullamcorper risus lectus a ipsum. Curabitur venenatis feugiat quam nec elementum. Curabitur a interdum urna. Curabitur tincidunt tortor eget neque condimentum blandit. Etiam imperdiet, enim nec blandit convallis, nunc augue.",
                    Uri.parse("https://lh6.googleusercontent.com/-ORRJtfLQlaw/VGLmQPv3n8I/AAAAAAAAAD8/2TzSCCPzl9k/w600-no/DSC04114.JPG"),
                    Uri.parse("https://lh4.googleusercontent.com/-ch9Kk-7pD68/VGLkCNh5niI/AAAAAAAAADc/ztxkRHWX-po/w600-no/DSC_2739.JPG"),
                    new LatLng(-33.852222, 151.210556),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Darling Harbour",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam ut dui in ipsum suscipit aliquet pretium aliquet odio.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam ut dui in ipsum suscipit aliquet pretium aliquet odio. Nam posuere nunc sed risus molestie varius. Suspendisse posuere faucibus urna, id vestibulum ante iaculis et. Vivamus placerat suscipit sem, a tempor nunc vehicula ac. Ut libero velit, dapibus sit amet euismod vel, dignissim a nisl.\n\nDonec non dui non felis laoreet malesuada. Fusce ac metus ultrices, fermentum felis quis, varius velit. Donec ac felis semper, scelerisque diam sed, dignissim risus. Maecenas vel semper sapien. Fusce euismod justo posuere, efficitur risus tincidunt, congue tellus. In hac habitasse platea dictumst. Sed lobortis risus consequat vehicula facilisis.\n\nIn hendrerit, neque in gravida rutrum, purus enim aliquet lectus, sit amet vulputate tortor lacus at sem. Aenean lorem metus, finibus rhoncus eros at, ullamcorper fringilla velit. Nulla vitae porttitor metus, quis gravida lectus. In rhoncus, diam a elementum luctus, erat nisi tempus ex, in porta est.",
                    Uri.parse("https://lh5.googleusercontent.com/-qX43g6s92LY/VGLaTT3N35I/AAAAAAAAAC8/BbueQmch0Rw/w600-no/68001.jpg"),
                    Uri.parse("https://lh6.googleusercontent.com/-SQ6T1Ure6l8/VGLaTg2iGuI/AAAAAAAAACo/m6_RkTW2G1o/w600-no/IMG_20140201_082851.jpg"),
                    new LatLng(-33.8723, 151.19896),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Bondi Beach",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam et nunc in leo laoreet placerat. Interdum et malesuada fames ac ante ipsum primis in faucibus.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam et nunc in leo laoreet placerat. Interdum et malesuada fames ac ante ipsum primis in faucibus. Proin vestibulum laoreet odio nec posuere. Quisque ante arcu, malesuada vitae velit a, auctor tincidunt ante. Mauris varius eros eros, eget scelerisque mi scelerisque ut. Donec vehicula vitae urna ac hendrerit. Phasellus egestas risus nec euismod auctor.\n\nInteger fermentum velit et dolor varius sagittis. Proin et viverra sapien. Nulla aliquet ante et hendrerit egestas. Duis vulputate libero in nisi gravida cursus. Praesent laoreet nec dolor non iaculis. Aliquam eleifend ultricies ipsum, eu pellentesque libero rutrum non. Mauris et purus erat. Nullam semper mi id tincidunt viverra. Ut porta sem congue lectus luctus ultricies. Suspendisse iaculis lacinia nibh, eu accumsan magna volutpat vel. Sed id interdum mi, vel sollicitudin elit. Fusce facilisis elementum gravida. Duis at volutpat odio. Integer porta convallis tincidunt. Donec aliquam, leo ut.",
                    Uri.parse("https://lh4.googleusercontent.com/-wbNgVdUkBiE/VHe99hGVtNI/AAAAAAAAAFY/fAHfhchNLJw/w600-no/IMG_20141124_143747.jpg"),
                    Uri.parse("https://lh6.googleusercontent.com/-sjY_xlEOic4/VHe9-I4DD9I/AAAAAAAAAFI/Mt0VnjU7SxQ/w600-no/IMG_20141124_144008.jpg"),
                    new LatLng(-33.89102, 151.277726),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Taronga Zoo",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam eros velit, faucibus in mi in, accumsan eleifend magna. Fusce efficitur volutpat leo nec finibus. Vivamus luctus quis dolor ac interdum.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam eros velit, faucibus in mi in, accumsan eleifend magna. Fusce efficitur volutpat leo nec finibus. Vivamus luctus quis dolor ac interdum. Donec iaculis, orci quis semper vulputate, tortor nisi porttitor tortor, at pretium ante quam ut odio. Donec fringilla sapien et dolor pharetra ultrices. Aenean faucibus felis non vulputate iaculis.\n\nEtiam eget dapibus ligula. Nunc facilisis dignissim tortor et elementum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Aliquam condimentum pellentesque mollis. Aliquam finibus urna ipsum, sed accumsan ante blandit quis. Vestibulum vel lacinia ligula. Nunc justo ex, volutpat nec justo ut, efficitur gravida lectus. Mauris cursus dui libero, vel tristique purus laoreet non.\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse ultrices ullamcorper est, at consequat massa. Nam egestas at urna at pellentesque. Quisque lacus quam, efficitur vel erat eget, placerat feugiat eros. Mauris.",
                    Uri.parse("https://lh6.googleusercontent.com/-kypwDfnk674/VGLWpQPm4VI/AAAAAAAAAB0/SrfL0fE9DnE/w500-no/OI000020_2.jpg"),
                    Uri.parse("https://lh3.googleusercontent.com/-6_Ioko2ysgU/VHva2PjmRCI/AAAAAAAAAGM/cHjJC7ney4Q/w500-no/PC190054.JPG"),
                    new LatLng(-33.843333, 151.241111),
                    CITY_SYDNEY
            ));
            add(new Attraction(
                    "Sydney Opera House",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vitae bibendum justo, vitae cursus velit. Suspendisse potenti.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vitae bibendum justo, vitae cursus velit. Suspendisse potenti. Suspendisse scelerisque risus justo, non tincidunt nibh blandit et. Vivamus elit lacus, luctus nec erat in, pharetra semper turpis. Quisque viverra nulla ligula, non pulvinar ante dictum sit amet. Vestibulum aliquet tortor mauris, vel suscipit nisl malesuada eget. Aliquam maximus dictum euismod. Maecenas leo quam, volutpat id diam eget, placerat fringilla ipsum. Nam pretium vehicula augue quis euismod.\n\nNam sed blandit magna. Vestibulum a fermentum arcu. Vestibulum et ligula at nisi luctus facilisis. Proin fermentum enim a nibh commodo finibus. Suspendisse justo elit, vulputate ut ipsum at, pellentesque auctor massa. Praesent vestibulum erat interdum imperdiet dapibus. In hac habitasse platea dictumst. Proin varius orci vitae tempor vulputate.\n\nEtiam sed mollis orci. Integer et ex sed tortor scelerisque blandit semper id libero. Nulla facilisi. Pellentesque tempor magna eget massa ultrices, et efficitur lectus finibus.",
                    Uri.parse("https://lh5.googleusercontent.com/-7fb5ybQhUbo/VGLWjIL4RmI/AAAAAAAAACM/2jLe_msj_tk/w600-no/IMG_0049.JPG"),
                    Uri.parse("https://lh3.googleusercontent.com/-EFEw6s7mT6I/VGLkCH4Xt4I/AAAAAAAAADY/ZlznhaQvb8E/w600-no/DSC_2775.JPG"),
                    new LatLng(-33.858667, 151.214028),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Sydney Harbour Bridge",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris ut nulla neque. Morbi nec felis vel neque rhoncus malesuada.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris ut nulla neque. Morbi nec felis vel neque rhoncus malesuada. Mauris non nisi est. Nunc in ipsum euismod, suscipit dolor eget, efficitur nisi. Integer venenatis mauris mauris, quis luctus risus pellentesque a. Duis tempus est at ligula vehicula fermentum. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.\n\nNam ut sodales nibh, euismod aliquet lectus. Curabitur ornare dictum nisi, at faucibus magna. Morbi tempus nibh sed sodales volutpat. Etiam sodales, turpis sit amet porttitor tristique, libero libero faucibus est, viverra dictum risus ipsum vel augue. Nulla dolor magna, iaculis ac ornare id, fermentum eget massa. Sed mattis, odio nec sodales vehicula, neque metus ullamcorper nulla, sit amet ullamcorper risus lectus a ipsum. Curabitur venenatis feugiat quam nec elementum. Curabitur a interdum urna. Curabitur tincidunt tortor eget neque condimentum blandit. Etiam imperdiet, enim nec blandit convallis, nunc augue.",
                    Uri.parse("https://lh6.googleusercontent.com/-ORRJtfLQlaw/VGLmQPv3n8I/AAAAAAAAAD8/2TzSCCPzl9k/w600-no/DSC04114.JPG"),
                    Uri.parse("https://lh4.googleusercontent.com/-ch9Kk-7pD68/VGLkCNh5niI/AAAAAAAAADc/ztxkRHWX-po/w600-no/DSC_2739.JPG"),
                    new LatLng(-33.852222, 151.210556),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Darling Harbour",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam ut dui in ipsum suscipit aliquet pretium aliquet odio.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam ut dui in ipsum suscipit aliquet pretium aliquet odio. Nam posuere nunc sed risus molestie varius. Suspendisse posuere faucibus urna, id vestibulum ante iaculis et. Vivamus placerat suscipit sem, a tempor nunc vehicula ac. Ut libero velit, dapibus sit amet euismod vel, dignissim a nisl.\n\nDonec non dui non felis laoreet malesuada. Fusce ac metus ultrices, fermentum felis quis, varius velit. Donec ac felis semper, scelerisque diam sed, dignissim risus. Maecenas vel semper sapien. Fusce euismod justo posuere, efficitur risus tincidunt, congue tellus. In hac habitasse platea dictumst. Sed lobortis risus consequat vehicula facilisis.\n\nIn hendrerit, neque in gravida rutrum, purus enim aliquet lectus, sit amet vulputate tortor lacus at sem. Aenean lorem metus, finibus rhoncus eros at, ullamcorper fringilla velit. Nulla vitae porttitor metus, quis gravida lectus. In rhoncus, diam a elementum luctus, erat nisi tempus ex, in porta est.",
                    Uri.parse("https://lh5.googleusercontent.com/-qX43g6s92LY/VGLaTT3N35I/AAAAAAAAAC8/BbueQmch0Rw/w600-no/68001.jpg"),
                    Uri.parse("https://lh6.googleusercontent.com/-SQ6T1Ure6l8/VGLaTg2iGuI/AAAAAAAAACo/m6_RkTW2G1o/w600-no/IMG_20140201_082851.jpg"),
                    new LatLng(-33.8723, 151.19896),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Bondi Beach",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam et nunc in leo laoreet placerat. Interdum et malesuada fames ac ante ipsum primis in faucibus.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam et nunc in leo laoreet placerat. Interdum et malesuada fames ac ante ipsum primis in faucibus. Proin vestibulum laoreet odio nec posuere. Quisque ante arcu, malesuada vitae velit a, auctor tincidunt ante. Mauris varius eros eros, eget scelerisque mi scelerisque ut. Donec vehicula vitae urna ac hendrerit. Phasellus egestas risus nec euismod auctor.\n\nInteger fermentum velit et dolor varius sagittis. Proin et viverra sapien. Nulla aliquet ante et hendrerit egestas. Duis vulputate libero in nisi gravida cursus. Praesent laoreet nec dolor non iaculis. Aliquam eleifend ultricies ipsum, eu pellentesque libero rutrum non. Mauris et purus erat. Nullam semper mi id tincidunt viverra. Ut porta sem congue lectus luctus ultricies. Suspendisse iaculis lacinia nibh, eu accumsan magna volutpat vel. Sed id interdum mi, vel sollicitudin elit. Fusce facilisis elementum gravida. Duis at volutpat odio. Integer porta convallis tincidunt. Donec aliquam, leo ut.",
                    Uri.parse("https://lh4.googleusercontent.com/-wbNgVdUkBiE/VHe99hGVtNI/AAAAAAAAAFY/fAHfhchNLJw/w600-no/IMG_20141124_143747.jpg"),
                    Uri.parse("https://lh6.googleusercontent.com/-sjY_xlEOic4/VHe9-I4DD9I/AAAAAAAAAFI/Mt0VnjU7SxQ/w600-no/IMG_20141124_144008.jpg"),
                    new LatLng(-33.89102, 151.277726),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Taronga Zoo",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam eros velit, faucibus in mi in, accumsan eleifend magna. Fusce efficitur volutpat leo nec finibus. Vivamus luctus quis dolor ac interdum.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam eros velit, faucibus in mi in, accumsan eleifend magna. Fusce efficitur volutpat leo nec finibus. Vivamus luctus quis dolor ac interdum. Donec iaculis, orci quis semper vulputate, tortor nisi porttitor tortor, at pretium ante quam ut odio. Donec fringilla sapien et dolor pharetra ultrices. Aenean faucibus felis non vulputate iaculis.\n\nEtiam eget dapibus ligula. Nunc facilisis dignissim tortor et elementum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Aliquam condimentum pellentesque mollis. Aliquam finibus urna ipsum, sed accumsan ante blandit quis. Vestibulum vel lacinia ligula. Nunc justo ex, volutpat nec justo ut, efficitur gravida lectus. Mauris cursus dui libero, vel tristique purus laoreet non.\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse ultrices ullamcorper est, at consequat massa. Nam egestas at urna at pellentesque. Quisque lacus quam, efficitur vel erat eget, placerat feugiat eros. Mauris.",
                    Uri.parse("https://lh6.googleusercontent.com/-kypwDfnk674/VGLWpQPm4VI/AAAAAAAAAB0/SrfL0fE9DnE/w500-no/OI000020_2.jpg"),
                    Uri.parse("https://lh3.googleusercontent.com/-6_Ioko2ysgU/VHva2PjmRCI/AAAAAAAAAGM/cHjJC7ney4Q/w500-no/PC190054.JPG"),
                    new LatLng(-33.843333, 151.241111),
                    CITY_SYDNEY
            ));
            add(new Attraction(
                    "Sydney Opera House",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vitae bibendum justo, vitae cursus velit. Suspendisse potenti.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vitae bibendum justo, vitae cursus velit. Suspendisse potenti. Suspendisse scelerisque risus justo, non tincidunt nibh blandit et. Vivamus elit lacus, luctus nec erat in, pharetra semper turpis. Quisque viverra nulla ligula, non pulvinar ante dictum sit amet. Vestibulum aliquet tortor mauris, vel suscipit nisl malesuada eget. Aliquam maximus dictum euismod. Maecenas leo quam, volutpat id diam eget, placerat fringilla ipsum. Nam pretium vehicula augue quis euismod.\n\nNam sed blandit magna. Vestibulum a fermentum arcu. Vestibulum et ligula at nisi luctus facilisis. Proin fermentum enim a nibh commodo finibus. Suspendisse justo elit, vulputate ut ipsum at, pellentesque auctor massa. Praesent vestibulum erat interdum imperdiet dapibus. In hac habitasse platea dictumst. Proin varius orci vitae tempor vulputate.\n\nEtiam sed mollis orci. Integer et ex sed tortor scelerisque blandit semper id libero. Nulla facilisi. Pellentesque tempor magna eget massa ultrices, et efficitur lectus finibus.",
                    Uri.parse("https://lh5.googleusercontent.com/-7fb5ybQhUbo/VGLWjIL4RmI/AAAAAAAAACM/2jLe_msj_tk/w600-no/IMG_0049.JPG"),
                    Uri.parse("https://lh3.googleusercontent.com/-EFEw6s7mT6I/VGLkCH4Xt4I/AAAAAAAAADY/ZlznhaQvb8E/w600-no/DSC_2775.JPG"),
                    new LatLng(-33.858667, 151.214028),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Sydney Harbour Bridge",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris ut nulla neque. Morbi nec felis vel neque rhoncus malesuada.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris ut nulla neque. Morbi nec felis vel neque rhoncus malesuada. Mauris non nisi est. Nunc in ipsum euismod, suscipit dolor eget, efficitur nisi. Integer venenatis mauris mauris, quis luctus risus pellentesque a. Duis tempus est at ligula vehicula fermentum. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.\n\nNam ut sodales nibh, euismod aliquet lectus. Curabitur ornare dictum nisi, at faucibus magna. Morbi tempus nibh sed sodales volutpat. Etiam sodales, turpis sit amet porttitor tristique, libero libero faucibus est, viverra dictum risus ipsum vel augue. Nulla dolor magna, iaculis ac ornare id, fermentum eget massa. Sed mattis, odio nec sodales vehicula, neque metus ullamcorper nulla, sit amet ullamcorper risus lectus a ipsum. Curabitur venenatis feugiat quam nec elementum. Curabitur a interdum urna. Curabitur tincidunt tortor eget neque condimentum blandit. Etiam imperdiet, enim nec blandit convallis, nunc augue.",
                    Uri.parse("https://lh6.googleusercontent.com/-ORRJtfLQlaw/VGLmQPv3n8I/AAAAAAAAAD8/2TzSCCPzl9k/w600-no/DSC04114.JPG"),
                    Uri.parse("https://lh4.googleusercontent.com/-ch9Kk-7pD68/VGLkCNh5niI/AAAAAAAAADc/ztxkRHWX-po/w600-no/DSC_2739.JPG"),
                    new LatLng(-33.852222, 151.210556),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Darling Harbour",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam ut dui in ipsum suscipit aliquet pretium aliquet odio.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam ut dui in ipsum suscipit aliquet pretium aliquet odio. Nam posuere nunc sed risus molestie varius. Suspendisse posuere faucibus urna, id vestibulum ante iaculis et. Vivamus placerat suscipit sem, a tempor nunc vehicula ac. Ut libero velit, dapibus sit amet euismod vel, dignissim a nisl.\n\nDonec non dui non felis laoreet malesuada. Fusce ac metus ultrices, fermentum felis quis, varius velit. Donec ac felis semper, scelerisque diam sed, dignissim risus. Maecenas vel semper sapien. Fusce euismod justo posuere, efficitur risus tincidunt, congue tellus. In hac habitasse platea dictumst. Sed lobortis risus consequat vehicula facilisis.\n\nIn hendrerit, neque in gravida rutrum, purus enim aliquet lectus, sit amet vulputate tortor lacus at sem. Aenean lorem metus, finibus rhoncus eros at, ullamcorper fringilla velit. Nulla vitae porttitor metus, quis gravida lectus. In rhoncus, diam a elementum luctus, erat nisi tempus ex, in porta est.",
                    Uri.parse("https://lh5.googleusercontent.com/-qX43g6s92LY/VGLaTT3N35I/AAAAAAAAAC8/BbueQmch0Rw/w600-no/68001.jpg"),
                    Uri.parse("https://lh6.googleusercontent.com/-SQ6T1Ure6l8/VGLaTg2iGuI/AAAAAAAAACo/m6_RkTW2G1o/w600-no/IMG_20140201_082851.jpg"),
                    new LatLng(-33.8723, 151.19896),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Bondi Beach",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam et nunc in leo laoreet placerat. Interdum et malesuada fames ac ante ipsum primis in faucibus.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam et nunc in leo laoreet placerat. Interdum et malesuada fames ac ante ipsum primis in faucibus. Proin vestibulum laoreet odio nec posuere. Quisque ante arcu, malesuada vitae velit a, auctor tincidunt ante. Mauris varius eros eros, eget scelerisque mi scelerisque ut. Donec vehicula vitae urna ac hendrerit. Phasellus egestas risus nec euismod auctor.\n\nInteger fermentum velit et dolor varius sagittis. Proin et viverra sapien. Nulla aliquet ante et hendrerit egestas. Duis vulputate libero in nisi gravida cursus. Praesent laoreet nec dolor non iaculis. Aliquam eleifend ultricies ipsum, eu pellentesque libero rutrum non. Mauris et purus erat. Nullam semper mi id tincidunt viverra. Ut porta sem congue lectus luctus ultricies. Suspendisse iaculis lacinia nibh, eu accumsan magna volutpat vel. Sed id interdum mi, vel sollicitudin elit. Fusce facilisis elementum gravida. Duis at volutpat odio. Integer porta convallis tincidunt. Donec aliquam, leo ut.",
                    Uri.parse("https://lh4.googleusercontent.com/-wbNgVdUkBiE/VHe99hGVtNI/AAAAAAAAAFY/fAHfhchNLJw/w600-no/IMG_20141124_143747.jpg"),
                    Uri.parse("https://lh6.googleusercontent.com/-sjY_xlEOic4/VHe9-I4DD9I/AAAAAAAAAFI/Mt0VnjU7SxQ/w600-no/IMG_20141124_144008.jpg"),
                    new LatLng(-33.89102, 151.277726),
                    CITY_SYDNEY
            ));

            add(new Attraction(
                    "Taronga Zoo",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam eros velit, faucibus in mi in, accumsan eleifend magna. Fusce efficitur volutpat leo nec finibus. Vivamus luctus quis dolor ac interdum.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam eros velit, faucibus in mi in, accumsan eleifend magna. Fusce efficitur volutpat leo nec finibus. Vivamus luctus quis dolor ac interdum. Donec iaculis, orci quis semper vulputate, tortor nisi porttitor tortor, at pretium ante quam ut odio. Donec fringilla sapien et dolor pharetra ultrices. Aenean faucibus felis non vulputate iaculis.\n\nEtiam eget dapibus ligula. Nunc facilisis dignissim tortor et elementum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Aliquam condimentum pellentesque mollis. Aliquam finibus urna ipsum, sed accumsan ante blandit quis. Vestibulum vel lacinia ligula. Nunc justo ex, volutpat nec justo ut, efficitur gravida lectus. Mauris cursus dui libero, vel tristique purus laoreet non.\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse ultrices ullamcorper est, at consequat massa. Nam egestas at urna at pellentesque. Quisque lacus quam, efficitur vel erat eget, placerat feugiat eros. Mauris.",
                    Uri.parse("https://lh6.googleusercontent.com/-kypwDfnk674/VGLWpQPm4VI/AAAAAAAAAB0/SrfL0fE9DnE/w500-no/OI000020_2.jpg"),
                    Uri.parse("https://lh3.googleusercontent.com/-6_Ioko2ysgU/VHva2PjmRCI/AAAAAAAAAGM/cHjJC7ney4Q/w500-no/PC190054.JPG"),
                    new LatLng(-33.843333, 151.241111),
                    CITY_SYDNEY
            ));





        }});

    }};

    /**
     * Creates a list of geofences based on the city locations
     */
    public static List<Geofence> getGeofenceList() {
        List<Geofence> geofenceList = new ArrayList<Geofence>();
        for (String city : CITY_LOCATIONS.keySet()) {
            LatLng cityLatLng = CITY_LOCATIONS.get(city);
            geofenceList.add(new Geofence.Builder()
                    .setCircularRegion(cityLatLng.latitude, cityLatLng.longitude, TRIGGER_RADIUS)
                    .setRequestId(city)
                    .setTransitionTypes(TRIGGER_TRANSITION)
                    .setExpirationDuration(EXPIRATION_DURATION)
                    .build());
        }
        return geofenceList;
    }

    public static String getClosestCity(LatLng curLatLng) {
        if (curLatLng == null) {
            // If location is unknown return test city so some data is shown
            return TEST_CITY;
        }

        double minDistance = 0;
        String closestCity = null;
        for (Map.Entry<String, LatLng> entry: CITY_LOCATIONS.entrySet()) {
            double distance = SphericalUtil.computeDistanceBetween(curLatLng, entry.getValue());
            if (minDistance == 0 || distance < minDistance) {
                minDistance = distance;
                closestCity = entry.getKey();
            }
        }
        return closestCity;
    }
}
