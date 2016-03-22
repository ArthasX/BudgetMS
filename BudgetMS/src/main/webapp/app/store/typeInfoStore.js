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
	filterOnLoad : true
});
