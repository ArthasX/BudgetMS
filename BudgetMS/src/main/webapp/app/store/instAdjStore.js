Ext.define('BudgetMS.store.instAdjStore', {
	name : 'instAdj',
	model : 'BudgetMS.model.instAdj',
	proxy : {
		type : 'ajax',
		url : 'inst/findInstAdjByInstId.do',
		reader : {
			type : 'json',
		}
	}
});

// fields:'',
