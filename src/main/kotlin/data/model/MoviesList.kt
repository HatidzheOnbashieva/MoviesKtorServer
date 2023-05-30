package data.model

import data.model.Constants.BASE_URL


fun getMovies(): List<Movie> {
    return listOf(
        Movie(
            1,
            "John Wick: Chapter 4",
            "With the price on his head ever increasing, John Wick uncovers a path to defeating The High Table. But before he can earn his freedom, Wick must face off against a new enemy with powerful alliances across the globe and forces that turn old friends into foes.",
            "action, thriller, crime",
            "$BASE_URL/movies/JohnWick.png"
        ),
        Movie(
            2,
            "The Mother",
            "A deadly female assassin comes out of hiding to protect the daughter that she gave up years before, while on the run from dangerous men.",
            "action, thriller",
            "$BASE_URL/movies/TheMother.png"
        ),
        Movie(
            3,
            "The Little Mermaid",
            "The youngest of King Triton’s daughters, and the most defiant, Ariel longs to find out more about the world beyond the sea, and while visiting the surface, falls for the dashing Prince Eric. With mermaids forbidden to interact with humans, Ariel makes a deal with the evil sea witch, Ursula, which gives her a chance to experience life on land, but ultimately places her life – and her father’s crown – in jeopardy.",
            "adventure, family, fantasy, romance",
            "$BASE_URL/movies/TheLittleMermaid.png"
        ),
        Movie(
            4,
            "Super Mario Bros. Movie",
            "While working underground to fix a water main, Brooklyn plumbers—and brothers—Mario and Luigi are transported down a mysterious pipe and wander into a magical new world. But when the brothers are separated, Mario embarks on an epic quest to find Luigi.",
            "animation, family, adventure, fantasy, comedy",
            "$BASE_URL/movies/SuperMario.png"
        ),
        Movie(
            5,
            "Palmer",
            "After 12 years in prison, former high school football star Eddie Palmer returns home to put his life back together—and forms an unlikely bond with Sam, an outcast boy from a troubled home. But Eddie's past threatens to ruin his new life and family.",
            "drama",
            "$BASE_URL/movies/Palmer.png"
        ),
        Movie(
            6,
            "Black Panther: Wakanda Forever",
            "Queen Ramonda, Shuri, M’Baku, Okoye and the Dora Milaje fight to protect their nation from intervening world powers in the wake of King T’Challa’s death. As the Wakandans strive to embrace their next chapter, the heroes must band together with the help of War Dog Nakia and Everett Ross and forge a new path for the kingdom of Wakanda.",
            "action, adventure, science fiction",
            "$BASE_URL/movies/BlackPanther.png"
        ),
        Movie(
            7,
            "Fast X",
            "Over many missions and against impossible odds, Dom Toretto and his family have outsmarted, out-nerved and outdriven every foe in their path. Now, they confront the most lethal opponent they've ever faced: A terrifying threat emerging from the shadows of the past who's fueled by blood revenge, and who is determined to shatter this family and destroy everything—and everyone—that Dom loves, forever.",
            "action, adventure, crime, mystery, thriller",
            "$BASE_URL/movies/FastX.png"
        )
    )
}
