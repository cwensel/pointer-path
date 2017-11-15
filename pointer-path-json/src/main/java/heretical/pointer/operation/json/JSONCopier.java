/*
 * Copyright (c) 2017 Chris K Wensel <chris@wensel.net>. All Rights Reserved.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package heretical.pointer.operation.json;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import heretical.pointer.operation.Copier;
import heretical.pointer.operation.CopySpec;
import heretical.pointer.path.json.JSONNestedPointerCompiler;

/**
 *
 */
public class JSONCopier extends Copier<JsonNode, ArrayNode>
  {
  public JSONCopier( CopySpec... copySpecs )
    {
    super( JSONNestedPointerCompiler.COMPILER, copySpecs );
    }
  }