/*
 * (C) Copyright 2016 NaturalIntelligence.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Written by: Amit Gupta
 * https://github.com/NaturalIntelligence/
 * 
 */
package os.nushi.concurrency.cookiemaking2;

import java.util.EnumMap;

public class Cookie {
	final String name;
    EnumMap < Ingredient, Integer > ingredients;
 
    Cookie(String name) {
        this.name = name;
		ingredients = new EnumMap < Ingredient, Integer > (Ingredient.class);
    }
 
    public void setIngredient(Ingredient i, int quantity) {
        ingredients.put(i, quantity);
    }
 
    public EnumMap < Ingredient, Integer > getIngredients() {
        return ingredients;
    }
}
