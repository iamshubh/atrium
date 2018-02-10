package ch.tutteli.atrium.api.cc.en_UK

import ch.tutteli.atrium.api.cc.en_UK.creating.charsequence.contains.builders.CharSequenceContainsNotCheckerBuilder
import ch.tutteli.atrium.creating.AssertImpl
import ch.tutteli.atrium.creating.charsequence.contains.builders.CharSequenceContainsBuilder
import ch.tutteli.atrium.creating.charsequence.contains.searchbehaviours.CharSequenceContainsIgnoringCaseSearchBehaviour
import ch.tutteli.atrium.creating.charsequence.contains.searchbehaviours.CharSequenceContainsNoOpSearchBehaviour
import ch.tutteli.atrium.creating.charsequence.contains.searchbehaviours.CharSequenceContainsNotSearchBehaviour

/**
 * Defines that the decoration behaviour `ignore case` shall be applied to this sophisticated `contains` assertion.
 *
 * @return The newly created builder.
 */
val <T : CharSequence> CharSequenceContainsBuilder<T, CharSequenceContainsNoOpSearchBehaviour>.ignoringCase
    get() : CharSequenceContainsBuilder<T, CharSequenceContainsIgnoringCaseSearchBehaviour>
    = AssertImpl.charSequence.contains.searchBehaviours.ignoringCase(this)

/**
 * Defines that the decoration behaviour `ignore case` shall be applied to this sophisticated `contains not` assertion.
 *
 * @return The newly created builder.
 */
val <T : CharSequence> CharSequenceContainsNotCheckerBuilder<T, CharSequenceContainsNotSearchBehaviour>.ignoringCase
    get() : CharSequenceContainsNotCheckerBuilder<T, CharSequenceContainsIgnoringCaseSearchBehaviour>
    = CharSequenceContainsNotCheckerBuilder(containsBuilder.ignoringCase)
