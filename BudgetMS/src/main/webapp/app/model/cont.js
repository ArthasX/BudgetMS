Ext.define("BudgetMS.model.cont", {
	extend : "Ext.data.Model",
	feilds : [ {
		name : "contId",
		type : "auto"
	}, {
		name : 'instDivideId',
		type : 'auto'
	}, {
		name : 'contName',
		type : 'auto'
	}, {
		name : 'contAmt',
		type : 'auto'
	}, {
		name : 'contType',
		type : 'auto'
	}, {
		name : 'signedDate',
		type : 'auto',
	}, {
		name : 'signedPerson',
		type : 'auto'
	}, {
		name : 'optDate',
		type : 'auto'
	}, {
		name : 'optUser',
		type : 'auto'
	}, {
		name : 'remark',
		type : 'auto'
	} ]
});
