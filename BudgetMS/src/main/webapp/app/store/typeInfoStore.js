Ext.define('BudgetMS.store.typeInfoStore', {
	name : 'typeInfo',
	extend : 'Ext.data.Store',
	model : 'BudgetMS.model.typeInfo',
	proxy : {
		type : 'ajax',
		url : 'typeInfo/getAllTypeInfo.do',
		reader : {
			type : 'json'
		}
	},
	autoLoad : true,
	filterOnLoad : true,
	listeners : {
		'beforeload' : function(store) {
//			debugger;
//			var combo = store.ownerCt;
//			
//			var f = {
//				property : "typeCategory",
//				value : /inst/
//			};
//			store.addFilter(f);if (!combo)
//				return;
		}
	}

});
